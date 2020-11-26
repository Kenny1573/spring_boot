package com.kenny.lambada;

/**
 * @author kenny
 * @version 1.0
 * @date 2020/11/26 13:43
 */

/**
 * 检查是否为函数式接口
 */
@FunctionalInterface
interface InDemo{
    void run();
}
public class Demo1 {

    static InDemo inDemo = new InDemo() {
        @Override
        public void run() {
            System.out.println("程式启动");
        }
    };

    public static void main(String[] args) {
        inDemo.run();
        InDemo inDemo1=()-> System.out.println("Lambda程式启动");
        inDemo1.run();
    }

}
