package com.kenny.collections.collection.list;

/**
 * @author kenny
 * @version 1.0
 * @date 2020/11/26 8:26
 * 有序的集合，存储元素和取出元素的顺序是一致的（存储123 取出123）
 * 有索引，包含了一些带索引的方法
 * 允许存储重复的元素
 */
public class ListDemo {
    /**
     * boolean add(E e)
     * 将指定的元素到这个列表的末尾（可选操作）。
     * void add(int index, E element)
     * 在列表中指定的位置上插入指定的元素（可选操作）。
     * boolean addAll(Collection<? extends E> c)
     * 追加指定集合的所有元素到这个列表的末尾，按他们的指定集合的迭代器返回（可选操作）。
     * boolean addAll(int index, Collection<? extends E> c)
     * 将指定的集合中的所有元素插入到指定位置的列表中（可选操作）。
     * void clear()
     * 从这个列表中移除所有的元素（可选操作）。
     * boolean contains(Object o)
     * 返回 true如果这个列表包含指定元素。
     * boolean containsAll(Collection<?> c)
     * 返回 true如果这个列表包含指定集合的所有元素。
     * boolean equals(Object o)
     * 将指定的对象与此列表进行比较，以进行相等性。
     * E get(int index)
     * 返回此列表中指定位置的元素。
     * int hashCode()
     * 返回此列表的哈希代码值。
     * int indexOf(Object o)
     * 返回此列表中指定元素的第一个出现的索引，或-如果此列表不包含元素，或- 1。
     * boolean isEmpty()
     * 返回 true如果此列表不包含元素。
     * Iterator<E> iterator()
     * 在这个列表中的元素上返回一个正确的顺序。
     * int lastIndexOf(Object o)
     * 返回此列表中指定元素的最后一个发生的索引，或-如果此列表不包含元素，或- 1。
     * ListIterator<E> listIterator()
     * 返回列表元素的列表迭代器（在适当的顺序）。
     * ListIterator<E> listIterator(int index)
     * 在列表中的元素上返回列表迭代器（在适当的顺序），从列表中的指定位置开始。
     * E remove(int index)
     * 移除此列表中指定位置的元素（可选操作）。
     * boolean remove(Object o)
     * 从该列表中移除指定元素的第一个发生，如果它是存在的（可选操作）。
     * boolean removeAll(Collection<?> c)
     * 从这个列表中移除包含在指定集合中的所有元素（可选操作）。
     * default void replaceAll(UnaryOperator<E> operator)
     * 用将运算符应用到该元素的结果替换此列表中的每个元素。
     * boolean retainAll(Collection<?> c)
     * 仅保留包含在指定集合中的列表中的元素（可选操作）。
     * E set(int index, E element)
     * 用指定元素替换此列表中指定位置的元素（可选操作）。
     * int size()
     * 返回此列表中元素的数目。
     * default void sort(Comparator<? super E> c)
     * 分类列表使用提供的 Comparator比较元素。
     * default Spliterator<E> spliterator()
     * 创建此列表中的元素的 Spliterator。
     * List<E> subList(int fromIndex, int toIndex)
     * 返回一个视图之间的指定 fromIndex，包容，和 toIndex这份名单的部分，独家。
     * Object[] toArray()
     * 返回一个数组，包含在这个列表中的所有元素在适当的顺序（从第一个到最后一个元素）。
     * <T> T[] toArray(T[] a)
     * 返回一个数组，包含在这个列表中的所有元素在适当的顺序（从第一到最后一个元素）；返回数组的运行时类型是指定的数组的运行时类型。
     */
}
