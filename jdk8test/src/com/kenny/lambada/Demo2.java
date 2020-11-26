package com.kenny.lambada;

import java.time.LocalTime;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * @author kenny
 * @version 1.0
 * @date 2020/11/26 13:49
 * 常见Lambda函数式接口
 */

public class Demo2 {

    public static void main(String[] args) {
        //Consumer<T>--void
        Consumer<String> consumer = (string) -> System.out.println("消费了"+string);
        consumer.accept("产品");

        //Supplier<T>--T
        Supplier<String> supplier = () -> "return_string";
        System.out.println(supplier.get());

        //Function<T,R>--R
        Function<Integer,String> function=(integer)->"return_string"+integer;

        System.out.println(function.apply(20));

        //Predicate--boolean
        Predicate<LocalTime> predicate=(localTime)->localTime.getHour()==14?true:false;

        System.out.println(predicate.test(LocalTime.now()));


    }
}
