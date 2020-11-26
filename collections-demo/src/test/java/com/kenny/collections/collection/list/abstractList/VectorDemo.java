package com.kenny.collections.collection.list.abstractList;

import com.kenny.collections.entity.User;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDate;
import java.util.*;

/**
 * @author kenny
 * @version 1.0
 * @date 2020/11/25 13:52
 * Vector继承自AbstractList 同时，AbstractList实现了List接口
 * Vector是同步的，保证了线程安全
 */
public class VectorDemo {
    protected User getUser() {
        User user = new User();
        user.setUserName("1001" + new Random(100));
        user.setPwd("1001" + new Random(50));
        user.setAge(11);
        user.setAddress("江苏");
        user.setDate(LocalDate.now());
        return user;
    }

    protected void print(Object obj) {
        Logger logger = LoggerFactory.getLogger(getClass());
        logger.info(obj.toString());
    }

    /**
     * 构造方法
     */
    public void constructor() {
        //构造一个空向量，使其内部数据数组的大小为 10 ，标准容量增量为零。
        Vector<Object> vector = new Vector<>();

        //构造具有指定的初始容量和容量增量的空向量。
        //initialCapacity - 矢量的初始容量
        //capacityIncrement - 当矢量溢出时容量增加的量
        //IllegalArgumentException - 如果指定的初始容量为负
        Vector<Object> vector1 = new Vector<>(10, 10);

        //可以不指定溢出时候的增加量
        Vector<Object> vector2 = new Vector<>(10);

        //public Vector(Collection<? extends E> c)构造一个包含指定集合元素的向量，按照集合的迭代器返回的顺序。
        //c - 要将元素放入此向量的集合
        //NullPointerException - 如果指定的集合为空
        ArrayList<User> users = new ArrayList<>();
        Vector<User> vector3 = new Vector<>(users);

    }

    @Test
    public void method() {
        Vector<String> vector = new Vector<>(10);

        //1、add(E e) 将指定的元素追加到此Vector的末尾。--boolean
//        boolean state=vector.add(new String("1001"));
//        System.out.println(state);
//        print(vector);

        //2、add(int index, E element) 在此Vector中的指定位置插入指定的元素。--void
        //insertElementAt(E obj, int index)
        //在指定的index插入指定对象作为该向量中的一个 index 。 --void
//        vector.add(0,new String("1002"));
//        vector.insertElementAt("1003",1);
//        print(vector);

        //3、addAll(Collection<? extends E> c) 在此Vector中的指定位置插入指定的元素。--boolean
//        vector.add(new String("1001"));
//        Vector<String> strings = new Vector<>();
//        strings.add(new String("1002"));
//        strings.add(new String("1003"));
//        boolean b = vector.addAll(strings);
//        print(b);
//        print(vector);

        //4、addElement(E obj)将指定的组件添加到此向量的末尾，将其大小增加1。--void
//        vector.add(new String("1001"));
//        vector.addElement(new String("1002"));
//        print(vector);

        //5、capacity() 返回此向量的当前容量。--int
//        print(vector.capacity());

        //6、clear() 从此Vector中删除所有元素。--void
//        vector.add(new String("1001"));
//        vector.clear();

        //7、clone() 返回此向量的克隆。--Object
//          vector.add(new String("1001"));
//          print(vector);
//          print(vector.clone());

        //8、contains(Object o) 如果此向量包含指定的元素，则返回 true 。--boolean
//        vector.add(new String("1001"));
//        print(vector.contains("1001"));

        //9、containsAll(Collection<?> c)  如果此向量包含指定集合中的所有元素，则返回true。 --boolean
//        vector.add("1001");
//        vector.add("1002");
//        vector.add("1003");
//        ArrayList<String> arrayList = new ArrayList<>();
//        arrayList.add("1001");
//        arrayList.add("1004");
//        print(vector.containsAll(arrayList));

        //10、copyInto(Object[] anArray) 将此向量的组件复制到指定的数组中。--void
//        vector.add("1001");
//        vector.add("1002");
//        vector.add("1003");
//        Object[] objects = new Object[5];
//        vector.copyInto(objects);
//        print(objects.toString());

        //11、elementAt(int index) 返回指定索引处的组件。--E
        //get(int index)
        //返回此向量中指定位置的元素。 --E
//        vector.add("1001");
//        vector.add("1002");
//        vector.add("1003");
//        System.out.println(vector.elementAt(2));//--1003
//        System.out.println(vector.get(2));

        //12、elements() 返回此向量的组件的枚举。 --Enumeration<E>
//          vector.add("1001");
//          vector.add("1002");
//          vector.add("1003");
//          Enumeration<String> elements = vector.elements();
//          System.out.println(elements);

        //13、ensureCapacity(int minCapacity)如果需要，增加此向量的容量，以确保它可以至少保存最小容量参数指定的组件数。
        //--void
//        vector.ensureCapacity(20);
//        print(vector.capacity());

        //14. equals(Object o) 将指定的对象与此向量进行比较以获得相等性。
        /**
         * 将指定的对象与此向量进行比较以获得相等性。 如果且仅当指定的对象也是列表时，则返回true，
         * 两个列表的大小相同，并且两个列表中所有相应的元素对相等 。
         * （如果(e1==null ? e2==null : e1.equals(e2))两个元素e1和e2 相等 ）。
         * 换句话说，如果两个列表以相同的顺序包含相同的元素，则它们被定义为相等。
         */
//        vector.add("1001");
//        vector.add("1002");
//        vector.add("1003");
//        Vector<String> strings = new Vector<>();
//        strings.add("1001");
//        strings.add("1002");
//        strings.add("1003");
//        ArrayList<String> arrayList = new ArrayList<>();
//        arrayList.add("1001");
//        arrayList.add("1002");
//        arrayList.add("1003");
//        print(vector.equals(strings));
//        print(vector.equals(arrayList));

        //15. firstElement()
        //返回此向量的第一个组件（索引号为 0的项目）。 --E
//        vector.add("1001");
//        vector.add("1002");
//        vector.add("1003");
//        print(vector.firstElement());

        //16. forEach(Consumer<? super E> action)
        //对 Iterable的每个元素执行给定的操作，直到所有元素都被处理或动作引发异常。 --void


        //17.hashCode()
        //返回此Vector的哈希码值。 --int
//        print(vector.hashCode());

        //18. indexOf(Object o)
        //返回此向量中指定元素的第一次出现的索引，如果此向量不包含元素，则返回-1。 --int
//        vector.add("1001");
//        vector.add("1002");
//        vector.add("1003");
//        print(vector.indexOf("1001"));
//        print(vector.indexOf("1004"));

        //19. indexOf(Object o, int index)
        //返回此向量中指定元素的第一次出现的索引，从 index向后找o(包括index) ，如果未找到该元素，则返回-1。 --int
//        vector.add("1001");
//        vector.add("1002");
//        vector.add("1003");
//        vector.add("1004");
//        print(vector.indexOf("1002",0));
//        print(vector.indexOf("1004",0));
//        print(vector.indexOf("1001",0));

        //20.isEmpty()
        //测试此矢量是否没有组件。 --boolean
//        print(vector.isEmpty());
//        vector.add("1001");
//        print(vector.isEmpty());

        //21.iterator()
        //以正确的顺序返回该列表中的元素的迭代器。 --Iterator<E>
//        vector.add("1001");
//        vector.add("1002");
//        vector.add("1003");
//        vector.add("1004");
//        for (Iterator iterator=vector.iterator();iterator.hasNext();){
//            print(iterator.toString());
//        }

        //22. lastElement()
        //返回向量的最后一个组件。 --E
//        vector.add("1001");
//        vector.add("1002");
//        vector.add("1003");
//        vector.add("1004");
//        print(vector.lastElement());

        //23. lastIndexOf(Object o)
        //返回此向量中指定元素的最后一次出现的索引，如果此向量不包含元素，则返回-1。--int
//        vector.add("1001");
//        vector.add("1002");
//        vector.add("1003");
//        vector.add("1004");
//        print(vector.lastIndexOf("1003"));
//        print(vector.lastIndexOf("1004"));
//        print(vector.lastIndexOf("1005"));

        //24. lastIndexOf(Object o, int index)
        //返回此向量中指定元素的最后一次出现的索引，从 index(包括index)向前 ，如果未找到元素，则返回-1。
//        vector.add("1001");
//        vector.add("1002");
//        vector.add("1003");
//        vector.add("1004");
//        print(vector.lastIndexOf("1003",2));
//        print(vector.lastIndexOf("1004",2));
//        print(vector.lastIndexOf("1005",2));

        //25. listIterator()
        //返回列表中的列表迭代器（按适当的顺序）。--ListIterator<E>
        //listIterator(int index)
        //从列表中的指定位置开始，返回列表中的元素（按正确顺序）的列表迭代器。--ListIterator<E>
//        vector.add("1001");
//        vector.add("1002");
//        vector.add("1003");
//        vector.add("1004");
//        ListIterator<String> stringListIterator = vector.listIterator();
//        ListIterator<String> stringListIterator1 = vector.listIterator(2);
//        print("");

        //26. remove(int index)
        //删除此向量中指定位置的元素。 --E 删除的对象
//        vector.add("1001");
//        vector.add("1002");
//        vector.add("1003");
//        vector.add("1004");
//        Object o=vector.remove(1);
//        print(o);
//        print(vector);

        //remove(Object o)
        //删除此向量中指定元素的第一个出现如果Vector不包含元素，则它不会更改。--Boolean
//        print(vector.remove("1003"));
//        print(vector);
//        print(vector.remove("1005"));

        //removeAll(Collection<?> c)
        //从此Vector中删除指定集合中包含的所有元素。 --boolean
//        ArrayList<String> arrayList = new ArrayList<>();
//        arrayList.add("1001");
//        arrayList.add("1002");
//        ArrayList<String> arrayList1 = new ArrayList<>();
//        arrayList1.add("1006");
//        print(vector.removeAll(arrayList));
//        print(vector);
//        print(vector.removeAll(arrayList1));
//        print(vector);

        //removeAllElements()
        //从该向量中删除所有组件，并将其大小设置为零。 --void
//        print(vector);
//        vector.removeAllElements();
//        print(vector);

        //removeElement(Object obj)
        //从此向量中删除参数的第一个（最低索引）出现次数。 --boolean
        //removeElementAt(int index)
        //删除指定索引处的组件。 --void
//        vector.removeElement("1001");
//        print(vector);
//        vector.removeElementAt(1);
//        print(vector);

        //removeRange(int fromIndex, int toIndex)
        //从此列表中删除所有索引为 fromIndex （含）和 toIndex之间的元素。 --protected void


        //27. removeIf(Predicate<? super E> filter)
        //删除满足给定谓词的此集合的所有元素。--boolean

        //28.replaceAll(UnaryOperator<E> operator)
        //将该列表的每个元素替换为将该运算符应用于该元素的结果。 --void

        //29.retainAll(Collection<?> c)
        //仅保留此向量中包含在指定集合中的元素。 --boolean
//        vector.add("1001");
//        vector.add("1002");
//        vector.add("1003");
//        vector.add("1004");
//        ArrayList<String> arrayList = new ArrayList<>();
//        arrayList.add("1001");
//        arrayList.add("1002");
//        arrayList.add("1005");
//        print(vector.retainAll(arrayList));
//        print(vector);

        //30. set(int index, E element)
        //用指定的元素替换此Vector中指定位置的元素。--E
        //取出被替换的元素
//        vector.add("1001");
//        vector.add("1002");
//        vector.add("1003");
//        vector.add("1004");
//        String set = vector.set(0, "1000");
//        print(set);
//        print(vector);

        //31.setElementAt(E obj, int index)
        //设置在指定的组件 index此向量的要指定的对象。 --void
//        vector.add("1001");
//        vector.add("1002");
//        vector.add("1003");
//        vector.add("1004");
//        vector.setElementAt("1005",3);
//        print(vector);

        //32. setSize(int newSize)
        //设置此向量的大小。--void 相比于 capacity()
        //size() --int
        //返回此向量中的组件数。
//        vector.add("1001");
//        vector.add("1002");
//        vector.add("1003");
//        vector.add("1004");
//        print(vector);
//        print(vector.size());
//        vector.setSize(50);
//        print(vector);
//        print(vector.size());

        //33. sort(Comparator<? super E> c)
        //使用提供的 Comparator对此列表进行排序以比较元素。--void

        //34. spliterator()
        //在此列表中的元素上创建late-binding和故障切换 Spliterator 。--Spliterator<E>

        //35. subList(int fromIndex, int toIndex)
        //返回此列表之间的fromIndex（包括）和toIndex之间的独占视图。 --List<E>
//        vector.add("1001");
//        vector.add("1002");
//        vector.add("1003");
//        vector.add("1004");
//        List<String> strings = vector.subList(0, 3);
//        print(strings);

        //36. toArray()
        //以正确的顺序返回一个包含此Vector中所有元素的数组。 --object[]
//        Object[] objects = vector.toArray();
//        print(objects);
//        Integer[] integers = new Integer[]{111,44,1,22,4,22,33,56};
//        for (Integer integer:integers){
//            vector.add(integer.toString());
//        }
//        Object[] objects1 = vector.toArray();
//        print(objects1);

        //36. toArray(T[] a)
        //以正确的顺序返回一个包含此Vector中所有元素的数组; 返回的数组的运行时类型是指定数组的运行时类型。 --<T> T[]
//        vector.add("1001");
//        vector.add("1002");
//        vector.add("1003");
//        vector.add("1004");
//        String[] strings = vector.toArray(new String[10]);
//        print(strings.toString());

        //37. trimToSize()
        //修改该向量的容量成为向量的当前大小。 --void
//        vector.add("1001");
//        vector.add("1002");
//        vector.add("1003");
//        vector.add("1004");
//        vector.setSize(20);
//        print(vector.size());
//        vector.trimToSize();
//        print(vector.size());

    }














}
