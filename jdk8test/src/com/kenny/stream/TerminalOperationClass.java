package com.kenny.stream;

import com.kenny.fangfayingyong.User;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author kenny
 * @version 1.0
 * @date 2020/11/30 10:13
 */
public class TerminalOperationClass {
    /**
     * 匹配、聚合操作
     * allMatch：接收一个 Predicate 函数，当流中每个元素都符合该断言时才返回true，否则返回false
     * noneMatch：接收一个 Predicate 函数，当流中每个元素都不符合该断言时才返回true，否则返回false
     * anyMatch：接收一个 Predicate 函数，只要流中有一个元素满足该断言则返回true，否则返回false
     * findFirst：返回流中第一个元素
     * findAny：返回流中的任意元素
     * count：返回流中元素的总个数
     * max：返回流中元素最大值
     * min：返回流中元素最小值
     */
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 3, 5, 7, 9, 20, 30);
        Stream<Integer> stream = integers.stream();
//        System.out.println(stream.allMatch(i -> i > 0));
//        System.out.println(stream.noneMatch(i -> i > 100));
//        System.out.println(stream.anyMatch(i -> i > 20));
//        System.out.println(stream.findFirst());
//        System.out.println(stream.findAny());
//        System.out.println(stream.count());
        System.out.println(stream.max(Integer::compareTo));
//        System.out.println(stream.min(Integer::compareTo));
    }
}

/**
 * 规约操作
 * Optional<T> reduce(BinaryOperator<T> accumulator)：第一次执行时，accumulator函数的第一个参数为流中的第一个元素，第二个参数为流中元素的第二个元素；第二次执行时，第一个参数为第一次函数执行的结果，第二个参数为流中的第三个元素；依次类推。
 * T reduce(T identity, BinaryOperator<T> accumulator)：流程跟上面一样，只是第一次执行时，accumulator函数的第一个参数为identity，而第二个参数为流中的第一个元素。
 * <U> U reduce(U identity,BiFunction<U, ? super T, U> accumulator,BinaryOperator<U> combiner)：在串行流(stream)中，该方法跟第二个方法一样，即第三个参数combiner不会起作用。在并行流(parallelStream)中,我们知道流被fork join出多个线程进行执行，
 * 此时每个线程的执行流程就跟第二个方法reduce(identity,accumulator)一样，而第三个参数combiner函数，则是将每个线程的执行结果当成一个新的流，然后使用第一个方法reduce(accumulator)流程进行规约。
 */

class demo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        System.out.println(list.stream().reduce((x1, x2) -> x1 + x2).get());

        System.out.println(list.stream().reduce(3, (x1, x2) -> x1 + x2));

        System.out.println(list.stream().reduce(0,
                (x1, x2) -> {
                    System.out.println("stream accumulator: x1:" + x1 + "  x2:" + x2);
                    return x1 - x2;
                },
                (x1, x2) -> {
                    System.out.println("stream combiner: x1:" + x1 + "  x2:" + x2);
                    return x1 * x2;
                }));

        System.out.println(list.parallelStream().reduce(0,
                (x1, x2) -> {
                    System.out.println("parallelStream accumulator: x1:" + x1 + "  x2:" + x2);
                    return x1 - x2;
                },
                (x1, x2) -> {
                    System.out.println("parallelStream combiner: x1:" + x1 + "  x2:" + x2);
                    return x1 * x2;
                }));

    }
}

/**
 * 收集操作
 * collect：接收一个Collector实例，将流中元素收集成另外一个数据结构。
 * Collector<T, A, R> 是一个接口，有以下5个抽象方法：
 * Supplier<A> supplier()：创建一个结果容器A
 * BiConsumer<A, T> accumulator()：消费型接口，第一个参数为容器A，第二个参数为流中元素T。
 * BinaryOperator<A> combiner()：函数接口，该参数的作用跟上一个方法(reduce)中的combiner参数一样，将并行流中各                                                                 个子进程的运行结果(accumulator函数操作后的容器A)进行合并。
 * Function<A, R> finisher()：函数式接口，参数为：容器A，返回类型为：collect方法最终想要的结果R。
 * Set<Characteristics> characteristics()：返回一个不可变的Set集合，用来表明该Collector的特征。有以下三个特征：
 * CONCURRENT：表示此收集器支持并发。（官方文档还有其他描述，暂时没去探索，故不作过多翻译）
 * UNORDERED：表示该收集操作不会保留流中元素原有的顺序。
 * IDENTITY_FINISH：表示finisher参数只是标识而已，可忽略。
 */
class demo1 {
    public static void main(String[] args) {
        LinkedList<User> users = new LinkedList<>();
        users.add(new User("1001", 3000d));
        users.add(new User("1002", 4000d));
        users.add(new User("1003", 5000d));
        List<String> collect = users.stream().map(User::getName).collect(Collectors.toList());
        Set<Double> collect1 = users.stream().map(User::getMoney).collect(Collectors.toSet());
        String collect2 = users.stream().map(User::getName).collect(Collectors.joining(","));
        System.out.println(collect);
        System.out.println(collect1);
        System.out.println(collect2);

    }
}
/**
 * Student s1 = new Student("aa", 10,1);
 * Student s2 = new Student("bb", 20,2);
 * Student s3 = new Student("cc", 10,3);
 * List<Student> list = Arrays.asList(s1, s2, s3);
 * <p>
 * //装成list
 * List<Integer> ageList = list.stream().map(Student::getAge).collect(Collectors.toList()); // [10, 20, 10]
 * <p>
 * //转成set
 * Set<Integer> ageSet = list.stream().map(Student::getAge).collect(Collectors.toSet()); // [20, 10]
 * <p>
 * //转成map,注:key不能相同，否则报错
 * Map<String, Integer> studentMap = list.stream().collect(Collectors.toMap(Student::getName, Student::getAge)); // {cc=10, bb=20, aa=10}
 * <p>
 * //字符串分隔符连接
 * String joinName = list.stream().map(Student::getName).collect(Collectors.joining(",", "(", ")")); // (aa,bb,cc)
 * <p>
 * //聚合操作
 * //1.学生总数
 * Long count = list.stream().collect(Collectors.counting()); // 3
 * //2.最大年龄 (最小的minBy同理)
 * Integer maxAge = list.stream().map(Student::getAge).collect(Collectors.maxBy(Integer::compare)).get(); // 20
 * //3.所有人的年龄
 * Integer sumAge = list.stream().collect(Collectors.summingInt(Student::getAge)); // 40
 * //4.平均年龄
 * Double averageAge = list.stream().collect(Collectors.averagingDouble(Student::getAge)); // 13.333333333333334
 * // 带上以上所有方法
 * DoubleSummaryStatistics statistics = list.stream().collect(Collectors.summarizingDouble(Student::getAge));
 * System.out.println("count:" + statistics.getCount() + ",max:" + statistics.getMax() + ",sum:" + statistics.getSum() + ",average:" + statistics.getAverage());
 * <p>
 * //分组
 * Map<Integer, List<Student>> ageMap = list.stream().collect(Collectors.groupingBy(Student::getAge));
 * //多重分组,先根据类型分再根据年龄分
 * Map<Integer, Map<Integer, List<Student>>> typeAgeMap = list.stream().collect(Collectors.groupingBy(Student::getType, Collectors.groupingBy(Student::getAge)));
 * <p>
 * //分区
 * //分成两部分，一部分大于10岁，一部分小于等于10岁
 * Map<Boolean, List<Student>> partMap = list.stream().collect(Collectors.partitioningBy(v -> v.getAge() > 10));
 * <p>
 * //规约
 * Integer allAge = list.stream().map(Student::getAge).collect(Collectors.reducing(Integer::sum)).get(); //40
 */





















