package com.kenny.collections.test;

import org.junit.jupiter.api.Test;

import java.util.Stack;

/**
 * @author kenny
 * @version 1.0
 * @date 2020/11/26 8:12
 */
public class StackTest {
    @Test
    protected void test(){
        Stack<String> stack = new Stack<>();
        stack.push("1001");
        stack.push("1002");
        System.out.println(stack.indexOf("1001"));//--0
        System.out.println(stack.search("1001"));//--2 索引和位置不一样
    }
}
