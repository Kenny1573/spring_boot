package com.kenny.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author kenny
 * @version 1.0
 * @date 2020/11/27 8:05
 */
public class StreamMethod {
    public static void main(String[] args) {
        //生成流
        System.out.println("——————————————————————————————————");
        List<String> strings = Arrays.asList("abc", "b", "", "efg", "def");
        List<String> collect = strings.stream().filter(s -> s.isEmpty()).collect(Collectors.toList());
        System.out.println(collect.toArray());

        //forEach Stream 提供了新的方法 'forEach' 来迭代流中的每个数据。
        System.out.println("——————————————————————————————————");
        Random random = new Random(10);
        random.ints().limit(10).forEach(System.out::println);

        //map map 方法用于映射每个元素到对应的结果
        System.out.println("——————————————————————————————————");
        List<String> strings1 = Arrays.asList("11", "22", "33", "44");
        List<String> collect1 = strings1.stream().map(s -> s.trim()).distinct().collect(Collectors.toList());
        System.out.println(collect1.toArray());

        //filter filter 方法用于通过设置的条件过滤出元素
        System.out.println("——————————————————————————————————");
        List<String> strings2 = Arrays.asList("abc", "b", "", "efg", "def");
        strings2.stream()
                .filter(s -> !s.isEmpty())
                .collect(Collectors.toList())
                .forEach(System.out::println);

        //sorted 方法用于对流进行排序。
        System.out.println("——————————————————————————————————");
        Random random1 = new Random();
        random1.ints()
                .limit(10)
                .sorted()
                .forEach(System.out::println);

        //Collectors Collectors 类实现了很多归约操作
        System.out.println("——————————————————————————————————");
        List<String> strings3 = Arrays.asList("abc", "b", "", "efg", "def");
        String collect2 = strings3.stream()
                .filter(s -> !s.isEmpty())
                .distinct()
                .collect(Collectors.joining(","));
        System.out.println(collect2);
    }
}
