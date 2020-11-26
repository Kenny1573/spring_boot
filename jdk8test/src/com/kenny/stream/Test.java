package com.kenny.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

/**
 * @author kenny
 * @version 1.0
 * @date 2020/11/26 16:00
 * Stream流的操作
 */
public class Test {
    public static void main(String[] args) {
        //（1）. Collection中的stream()和parallelStream()获取流
        //stream()串行流，线程不安全
        //parallelStream()并行流，线程安全
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("apple");
        arrayList.add("huawei");
        arrayList.add("xiaomi");
        //Stream<String> stream = arrayList.stream();
        Stream<String> stringStream = arrayList.parallelStream();
        //stream.forEach((s) -> System.out.println(s));
        //stream.forEach(System.out::println);
        stringStream.forEach(System.out::println);
        stringStream.forEach((s)-> System.out.println(s));

    }
}
class test{
    public static void main(String[] args) {
        //(2). Arrays工具类的stream()方法
        String[] arr={"adfas","adfa","qewrq","scvs"};
        Stream<String> stream = Arrays.stream(arr);
        stream.forEach(System.out::println);
    }
}

class test2{
    public static void main(String[] args) {
        //(3)Stream中的of iterate generate方法生成流
        System.out.println("------------------of流-------------------");
        Stream<Integer> integerStream = Stream.of(10, 20, 30, 40, 50);
        integerStream.forEach(System.out::println);

        //迭代流
        System.out.println("------------------iterator流-------------------");
        Stream<Integer> iterate = Stream.iterate(10, integer -> integer + 2);
        iterate.limit(10).forEach(System.out::println);




    }
}
