package com.kenny.collections.collection.list.abstractList.abstractSequentialList;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;

/**
 * @author kenny
 * @version 1.0
 * @date 2020/11/26 8:20
 * LinkedList继承自AbstractSequentialList抽象类
 * AbstractSequentialList 继承自 AbstractList，是 LinkedList 的父类，是 List 接口 的简化版实现。
 * 简化在哪儿呢？简化在 AbstractSequentialList 只支持按次序访问，而不像 AbstractList 那样支持随机访问。
 * 实现了：
 * Serializable， Cloneable， Iterable ， Collection ， Deque ， List ， Queue
 */
public class LinkedListDemo {
    public void constructor(){
        LinkedList<String> strings = new LinkedList<>();
        LinkedList<Object> objects = new LinkedList<>(strings);
    }

    @Test
    public void method(){
        /**
         * boolean add(E e)
         * 将指定的元素列表的结束。
         * void add(int index, E element)
         * 在列表中指定的位置上插入指定的元素。
         * boolean addAll(Collection<? extends E> c)
         * 追加指定集合的所有元素到这个列表的末尾，按他们的指定集合的迭代器返回。
         * boolean addAll(int index, Collection<? extends E> c)
         * 将指定集合中的所有元素插入到该列表中，从指定位置开始。
         * void addFirst(E e)
         * 在此列表的开始处插入指定的元素。
         * void addLast(E e)
         * 将指定的元素列表的结束。
         * void clear()
         * 从这个列表中移除所有的元素。
         * Object clone()
         * 返回该 LinkedList浅拷贝。
         * boolean contains(Object o)
         * 返回 true如果这个列表包含指定元素。
         * Iterator<E> descendingIterator()
         * 返回在反向顺序在deque容器元素的迭代器。
         * E element()
         * 检索，但不删除，此列表的头（第一个元素）。
         * E get(int index)
         * 返回此列表中指定位置的元素。
         * E getFirst()
         * 返回此列表中的第一个元素。
         * E getLast()
         * 返回此列表中的最后一个元素。
         * int indexOf(Object o)
         * 返回此列表中指定元素的第一个出现的索引，或-如果此列表不包含元素，或- 1。
         * int lastIndexOf(Object o)
         * 返回此列表中指定元素的最后一个发生的索引，或-如果此列表不包含元素，或- 1。
         * ListIterator<E> listIterator(int index)
         * 返回此列表中元素的列表迭代器（在适当的顺序），从列表中的指定位置开始。
         * boolean offer(E e)
         * 将指定的元素添加到列表的尾部（最后一个元素）。
         * boolean offerFirst(E e)
         * 在列表的前面插入指定的元素。
         * boolean offerLast(E e)
         * 在列表的结尾插入指定的元素。
         * E peek()
         * 检索，但不删除，此列表的头（第一个元素）。
         * E peekFirst()
         * 检索，但不删除该列表的第一个元素，或返回 null如果这个列表是空的。
         * E peekLast()
         * 检索，但不删除该列表的最后一个元素，或返回 null如果这个列表是空的。
         * E poll()
         * 检索并删除此列表的头（第一个元素）。
         * E pollFirst()
         * 检索并移除此列表的第一个元素，或返回 null如果这个列表是空的。
         * E pollLast()
         * 检索并移除此列表的最后一个元素，或返回 null如果这个列表是空的。
         * E pop()
         * 从这个列表所表示的堆栈中弹出一个元素。
         * void push(E e)
         * 将一个元素推到由该列表所表示的堆栈上。
         * E remove()
         * 检索并删除此列表的头（第一个元素）。
         * E remove(int index)
         * 移除此列表中指定位置的元素。
         * boolean remove(Object o)
         * 从该列表中移除指定元素的第一个发生，如果它是存在的。
         * E removeFirst()
         * 移除并返回此列表中的第一个元素。
         * boolean removeFirstOccurrence(Object o)
         * 删除此列表中指定元素的第一个出现（当遍历从头到尾的列表）。
         * E removeLast()
         * 移除并返回此列表中的最后一个元素。
         * boolean removeLastOccurrence(Object o)
         * 删除此列表中指定元素的最后一次（当遍历从头到尾的列表时）。
         * E set(int index, E element)
         * 用指定元素替换此列表中指定位置的元素。
         * int size()
         * 返回此列表中元素的数目。
         * Spliterator<E> spliterator()
         * 创建一个后期绑定和快速失败 Spliterator超过此列表中的元素。
         * Object[] toArray()
         * 返回一个数组，包含在这个列表中的所有元素在适当的顺序（从第一个到最后一个元素）。
         * <T> T[] toArray(T[] a)
         * 返回一个数组，包含在这个列表中的所有元素在适当的顺序（从第一到最后一个元素）；返回数组的运行时类型是指定的数组的运行时类型。
         */

        //void addFirst(E e)
        //在此列表的开始处插入指定的元素。
        //void addLast(E e)
        //将指定的元素列表的结束。
        LinkedList<String> strings = new LinkedList<>();
        strings.add("1001");
        strings.add("1002");
        strings.add("1003");
        strings.add("1004");
        strings.add("1005");
//        System.out.println(strings.toString());
//        strings.addFirst("1111");
//        strings.addLast("2222");
//        System.out.println(strings.toString());



    }

}
