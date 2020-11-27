package com.kenny;

import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * @author kenny
 * @version 1.0
 * @date 2020/11/27 8:46
 */
public class Functional {
    public static void main(String[] args) {

    }
}

/**
 * Supplier接口(供应接口)
 */
class SupplierDemo{
    public static void main(String[] args) {
        System.out.println(supplierDemo(LocalDateTime.now()::toString));
        System.out.println((Supplier<String>) () -> "test");
        System.out.println("————————————————————————————————");
        Integer[] integers=new Integer[]{22,4,56,12,654};
        Supplier<Integer> supplier = () -> {
            int max = 0;
            for (Integer integer : integers) {
                max = Math.max(max, integer);
            }
            return max;
        };
        System.out.println(supplier.get());

        System.out.println((Supplier<Integer>)()->{
            int max = 0;
            for (Integer integer : integers) {
                max = Math.max(max, integer);
            }
            return max;
        });
    }
    protected static String supplierDemo(Supplier<String> stringSupplier){
        return stringSupplier.get();
    }
}

/**
 * java.util.function.Consumer<T> 接口则正好与Supplier接口相反，它不是生产一个数据，
 * 而是消费一个数据，其数据类型由泛型决定
 */
class ConsumerDemo{
    /**
     * 默认方法：andThen
     * 如果一个方法的参数和返回值全都是 Consumer 类型，
     * 那么就可以实现效果：消费数据的时候，首先做一个操作，然后再做一个操作，实现组合
     */
    public static void main(String[] args) {
        String[] strings={"张三,男","李红,女","王五,男","赵六,男"};
        Consumer<String> consumer = strings1 -> System.out.println("姓名:" + strings1);
        Consumer<String> consumer1=strings1 -> System.out.println("性别:"+strings1);
        Function<String[],String[]> function=strings1 ->{
            LinkedList<String> strings3 = new LinkedList<>();
            String[] strings2;
            for (String s:strings1) {
                strings2=s.split(",");
                for (String s1:strings2) {
                    strings3.add(s1);
                }
            }
            return strings3.toArray(new String[strings3.size()]);
        };

        for(int i=0;i<function.apply(strings).length;i++) {
            //consumer.andThen(consumer1).accept(ss[i]);
            consumer.accept(function.apply(strings)[i]);
            consumer1.accept(function.apply(strings)[++i]);
        }
    }
}

/**
 * Predicate接口
 * and or nagte (取反)
 */
class PredicateDemo{
    public static void method_or(Predicate<String> pre1,Predicate<String> pre2){
        Consumer<Boolean> consumer= s -> System.out.println(s);
        consumer.accept( pre1.or(pre2).test("OOP ORM"));
    }
    public static void method_and(Predicate<String> pre1,Predicate<String> pre2){
        Consumer<Boolean> consumer= s -> System.out.println(s);
        consumer.accept( pre1.and(pre2).test("OOP ORM"));
    }

    /**
     * 判断结果的相反结果
     * @param pre1
     */
    public static void method_nagte(Predicate<String> pre1){
        Consumer<Boolean> consumer= s -> System.out.println(s);
        consumer.accept(pre1.negate().test("OOP ORM"));
    }

    public static void main(String[] args) {
        method_or(s->s.contains("O"),s1->s1.contains("h"));
        method_and(s->s.contains("O"),s1->s1.contains("h"));
        method_nagte(s->s.contains("A"));

    }

}

/**
 * Function接口
 * andThen  compose()
 */
class FunctionDemo{
    public static void main(String[] args) {
        Integer integer=10;
        method_andthen(integer1 -> integer1*10,integer1 -> integer1+20,integer);
        method_compose(integer1 -> integer1*10,integer1 -> integer1+20,integer);
    }

    public static void method_andthen(Function<Integer,Integer> f1,
                                      Function<Integer,Integer> f2,Integer integer){
        Consumer<Integer> tConsumer = s -> System.out.println(String.valueOf(s));
        tConsumer.accept(f1.andThen(f2).apply(integer));
    }
    public static void method_compose(Function<Integer,Integer> f1,
                                      Function<Integer,Integer> f2,Integer integer){
        Consumer<Integer> tConsumer = s -> System.out.println(String.valueOf(s));
        tConsumer.accept(f1.compose(f2).apply(integer));
    }
}