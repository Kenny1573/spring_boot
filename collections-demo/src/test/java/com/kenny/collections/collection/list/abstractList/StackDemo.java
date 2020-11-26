package com.kenny.collections.collection.list.abstractList;

import org.junit.jupiter.api.Test;

import java.util.Stack;

/**
 * @author kenny
 * @version 1.0
 * @date 2020/11/26 7:52
 * 它扩展了类 Vector五操作允许向量被视为一个堆栈。提供了通常的 push和 pop操作，以及一个方法 peek项目在上面的堆栈，一个为栈是否为 empty试验方法，和一个 search堆栈的项目，发现它是从顶部多远的方法。
 * 继承自Vector
 */
public class StackDemo {
    @Test
    protected void constructor(){
        Stack<String> strings = new Stack<>();

    }

    /**
     * 由于继承自Vector，所以会包含父类中的所有方法
     */
    @Test
    protected void method(){
        Stack<String> stack = new Stack<>();

        //push(E item)
        //将一个项目推到这个堆栈的顶部。--E
        String push = stack.push("1001");
        String push1 = stack.push("1002");
        System.out.println(push);
        System.out.println(push1);
        //search(Object o)
        //返回元素一个对象在堆栈中的位置，不是索引。--int
        int search = stack.search("1001");
        System.out.println(search);
        int search1 = stack.search("1002");
        System.out.println(search1);
        //peek()
        //查看此堆栈顶部的对象，而不将它从堆栈中删除。 --E
        String peek = stack.peek();
        System.out.println(peek);
        //empty()
        //测试此堆栈是否为空。 --boolean
        //pop()
        //在这个堆栈的顶部删除对象，并返回该对象的值作为该函数的值。 --E
        String pop = stack.pop();
        System.out.println(pop);
        System.out.println(stack.isEmpty());
        String pop1 = stack.pop();
        System.out.println(pop1);
        System.out.println(stack.isEmpty());

    }
}
