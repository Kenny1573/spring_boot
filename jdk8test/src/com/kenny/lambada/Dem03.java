package com.kenny.lambada;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.PrimitiveIterator;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * @author kenny
 * @version 1.0
 * @date 2020/11/26 14:05
 * 函数式接口实例
 */
public class Dem03 {
    public static void main(String[] args) {
        Consumer<Double> xConsumer = new Consumer<Double>() {
            @Override
            public void accept(Double aDouble) {

                System.out.println("消费了A" + aDouble);
            }
        };
        Consumer<Double> tConsumer = (t) -> System.out.println("消费了B" + t);
        print(xConsumer,2000);
        print(tConsumer,1000);
        print((t)-> System.out.println("消费了C"+t),3000);
    }
    protected static void print(Consumer<Double> consumer,double money ){
        consumer.accept(money);
    }
}

class C{
    public static void main(String[] args) {
        int[] print = print(() -> new Random().nextInt(100), 10);
        System.out.println(Arrays.toString(print));
    }
    protected static int[] print(Supplier<Integer> supplier,int count){
        int[] ints = new int[count];
        for (int i=0;i<ints.length;i++){
            ints[i]=supplier.get();
        }
        return ints;
    }
}

class D{
    public static void main(String[] args) {
        System.out.println(  handler((s)->s.toUpperCase(),"hello"));
    }
    protected static String handler(Function<String,String> function,String s){
        return function.apply(s);
    }
}

class E{
    public static void main(String[] args) {
        LinkedList<String> strings = new LinkedList<>();
        strings.push("adsffds");
        strings.push("sds");
        strings.push("asbdds");
        LinkedList<String> re = re((s) -> s.length() > 4, strings);
        System.out.println(re==null?"集合为空":re.toString());
    }
    protected static LinkedList<String> re(Predicate<String> predicate,LinkedList<String> linkedList){
        LinkedList<String> strings = new LinkedList<>();
        for (String s:linkedList){
            if (predicate.test(s)) {
                strings.add(s);
            }
        }
        return strings.size()==0?null:strings;
    }
}