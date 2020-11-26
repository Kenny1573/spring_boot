package com.kenny.lambada;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author kenny
 * @version 1.0
 * @date 2020/11/26 11:28
 */
public class Test {
    public static void main(String[] args) {
//        A.B b = new A().new B();
//        A a = new A();
//        a.say();
//        b.say();


//        AbstractClass abstractClass=new AbstractClass() {
//            String string = "这是实现类中的属性";
//            @Override
//            public void print() {
//                super.print();
//                System.out.println("这是实现类的方法");
//                System.out.println(string);
//            }
//        };
//        abstractClass.print();

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                while (true){
                    System.out.println("123");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        new Thread(runnable).start();
    }
}

class A{
    int i=20;
    public void say(){
        System.out.println("这是ClassA中的方法");
    }
    class B{
        int j=30;
        public void say(){
            System.out.println("这是ClassB中的方法");
            System.out.println(i+j);
        }
    }
}

class Test1{
    public static void main(String[] args) {
        new Thread(()->{
            System.out.println("线程执行了");
        }).start();
    }
}

class Test2{
    public static void main(String[] args) {
        Comparator<String> comparator=new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length()-o2.length();
            }
        };
        TreeSet<String> strings = new TreeSet<>(comparator);
        Comparator<String> comparator1 = (String o1,String o2)-> {
                return o1.length()+o2.length();

        };
        TreeSet<String> strings1 = new TreeSet<>(comparator1);
        TreeSet<String> strings2 = new TreeSet<>((String o1, String o2) -> {
            return o1.length() * o2.length();
        });
        /**
         * 如果执行语句只有一条，且没有返回值，{}可以省略。若有返回值，则若想省去{}，则必须同时省略return，且执行语句
         * 也必须保证只有一条
         */
        Comparator<String> comparator2=(o1,o2)->o1.length()+o2.length();

    }
}

