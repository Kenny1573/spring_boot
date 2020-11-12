package com.springdough.control;

import com.springdough.entity.Dough;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;
import java.time.LocalTime;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author Kenny
 * @since 1.8
 * 生产过程引导类
 */
public class Test {
    public static void main(String[] args) {
        //Hashtable<String, Dough> stringDoughHashtable = new Hashtable<>();
        CopyOnWriteArrayList<Dough> doughs = new CopyOnWriteArrayList<Dough>();
        ArrayList<Dough> collections = new ArrayList<>();
        Produce produce = new Produce(doughs);
        Consumer consumer = new Consumer(doughs, collections);
        Thread thread = new Thread(produce);
        Thread thread1 = new Thread(consumer);
        thread.start();
        thread1.start();
    }
}

class Produce implements Runnable{
    CopyOnWriteArrayList<Dough> list;
    Logger logger = LoggerFactory.getLogger(getClass());
    int anInt,iNum,jNum;
    long minutes;
    Duration duration;
    int[] num=new int[2];
    LocalTime localTime;
    Produce(CopyOnWriteArrayList<Dough> list){
        this.list=list;
    }
    /**
     * 生产类
     */
    @Override
    public  synchronized void run() {
        while (list.size()<=1000){
            list.add(new Dough(LocalTime.now()));
            logger.info("生产了一根油条并扔进了锅里=====>现在锅里油条数量=====>"+list.size());
            this.getNum();
            logger.info("锅里情况=====>炸好："+num[0]+"  未炸好："+num[1]);
            anInt=new Random().nextInt(3000)+3000;
            try {
                logger.info("生产中，大约需要"+anInt/1000+"秒");
                Thread.sleep(anInt);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    /**
     * 判断油条是否炸好
     * @return 存储数量的数组
     */
    public void getNum(){
        localTime=LocalTime.now();
        iNum=0;
        jNum=0;
        Dough dough;
        //for (Iterator<String> iterator = stringDoughHashtable.keySet().iterator(); iterator.hasNext();) {
        for(Dough d :list){
            //String key=iterator.next();
            //dough= stringDoughHashtable.get(key);
            duration=Duration.between(d.getTime(),localTime);
            minutes=duration.getSeconds();
            if (minutes>20){
                //炸20s炸好了
                d.setProduce(true);
                iNum++;
            }
            else{
                jNum++;
            }
        }
        num[0]=iNum;
        num[1]=jNum;
    }
}

class Consumer implements Runnable{
    CopyOnWriteArrayList<Dough>  list;
    public List<Dough> collections;
    Dough dough;
    Logger logger = LoggerFactory.getLogger(getClass());

    public Consumer(CopyOnWriteArrayList<Dough> list, List<Dough> collections) {
        this.list = list;
        this.collections = collections;
    }

    @Override
    public  synchronized void run() {
        while (collections.size()<1000){
            //for (Iterator<String> iterator = hashtable.keySet().iterator(); iterator.hasNext();){
              for(Dough dough:list){
                 // dough=(Dough) list.get(i);
                //String key=iterator.next();
                //dough=hashtable.get(key);
                if (dough!=null){
                    if (dough.isProduce()){
                        //hashtable.remove(key);
                        list.remove(dough);
                        collections.add(dough);
                        logger.info("夹出一根油条=====>");
                        logger.info("锅里还有:"+list.size()+"货架还有:"+collections.size());
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        continue;
                    }
                }
            }
        }
    }
}