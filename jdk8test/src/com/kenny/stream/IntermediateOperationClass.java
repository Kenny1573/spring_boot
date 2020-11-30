package com.kenny.stream;

import com.kenny.fangfayingyong.User;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Stream;

/**
 * @author kenny
 * @version 1.0
 * @date 2020/11/26 17:28
 */
public class IntermediateOperationClass {
    /**
     * 筛选与切片
     * filter：过滤流中的某些元素
     * limit(n)：获取n个元素
     * skip(n)：跳过n元素，配合limit(n)可实现分页
     * distinct：通过流中元素的 hashCode() 和 equals() 去除重复元素
     */
    public static void main(String[] args) {
        Integer[] arrays={1,2,3,4,5,6,7,8,9,10,11,12,13,14};
        Stream<Integer> arrays1 = Stream.of(arrays);

        Stream<Integer> distinct = arrays1.filter(s -> s > 0)
                                          .limit(10)
                                          .skip(2)
                                          .distinct();
        distinct.forEach(System.out::println);

    }
}

/**
 * 映射
 * map：接收一个函数作为参数，该函数会被应用到每个元素上，并将其映射成一个新的元素。
 * flatMap：接收一个函数作为参数，将流中的每个值都换成另一个流，然后把所有流连接成一个流。
 */
class test1{
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("1,2,3", "a,b,c");
        Stream<String> stringStream = strings.stream().map(s -> s.replaceAll(",", ""));
        stringStream.forEach(System.out::println);
        Stream<String> stringStream1 = strings.parallelStream().flatMap(s -> {
            String[] split = s.split(",");
            Stream<String> split1 = Stream.of(split);
            return split1;
        });
        stringStream1.forEach(System.out::println);
    }
}

/**
 * 排序
 * sorted()：自然排序，流中元素需实现Comparable接口
 *  sorted(Comparator com)：定制排序，自定义Comparator排序器
 */
class test4{
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("1a", "2b", "3c");
        Stream<String> sorted = strings.stream().sorted();
        sorted.forEach(System.out::println);

        LinkedList<User> users = new LinkedList<>();
        for(int i=0;i<5;i++){
            users.push(new User(""+ LocalDate.now().getMonth(),(double)new Random().nextInt(100)));
        }
        users.parallelStream().sorted((o1, o2) -> {
            if (o1.getMoney().equals(o2.getMoney())) {
                return (int) (o1.getMoney()+o2.getMoney());
            } else {
                return (int) (o1.getMoney()-o2.getMoney());
            }
        }).forEach(System.out::println);
    }
}
/**
 * peek：如同于map，能得到流中的每一个元素。
 * 但map接收的是一个Function表达式，有返回值；而peek接收的是Consumer表达式，没有返回值。
 */
class tes5{
    public static void main(String[] args) {
        LinkedList<User> users = new LinkedList<>();
        for(int i=0;i<5;i++){
            users.push(new User(""+ LocalDate.now().getMonth(),(double)new Random().nextInt(100)));
        }
        users.parallelStream().peek(o1 -> {
            o1.setMoney(100d);
        }).forEach(System.out::println);
    }
}
