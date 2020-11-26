package com.kenny.fangfayingyong;

import java.sql.SQLOutput;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @author kenny
 * @version 1.0
 * @date 2020/11/26 15:13
 * 1、对象::实例方法
 * 2、类::静态方法
 * 3、类::实例方法
 * 4、类::new
 */
public class Test {
    public static void main(String[] args) {
        //1、对象::实例方法
        Consumer<String> consumer=(s)-> System.out.println(s);
        consumer.accept("1001");
        Consumer<String> consumer1= System.out::println;
        consumer1.accept("1002");

        //2、类::静态方法
        Comparator<String> comparator=(o1,o2)->o1.length()+o2.length();
        System.out.println(comparator.compare("1001", "100001"));
        Comparator<String> comparator1=String::compareTo;
        System.out.println(comparator1.compare("1001", "1002"));

        //3、类::实例方法
        Function<User,Double> function=(e)->e.getMoney();
        Function<User,Double> function1=User::getMoney;
        System.out.println(function.apply(new User("1001",3000d)));
        System.out.println(function1.apply(new User("1002", 5000d)));


        //4、类::new
        Supplier<User> supplier=()->new User();
        Supplier<User> supplier1=User::new;
        System.out.println(supplier.toString());
        System.out.println(supplier1.toString());

    }
}

