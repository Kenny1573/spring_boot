package com.zenith.springtest.service;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;

//Lambda表达式使用
public class LambdaTest {
    final static String salutation="hello";
    interface test1{
        int addNum(int a,int b);
    }

    interface testPrint{
        void print(String message);
    }
    @Test
    public void test(){
        test1 tt1=(int a,int b)->a + b ;
        test1 tt2=(a,b)->{return  a+b;};
        test1 tt3=(int a,int b)->a - b;

        testPrint tt4=(message)->{
            System.out.println("message is "+message);
        };

        tt4.print("tt4--test1");
        System.out.println("10 + 5 = "+tt1.addNum(10,5));
        System.out.println("10 + 5 = "+tt2.addNum(10,5));
        System.out.println("10 - 5 = "+tt3.addNum(10,5));
    }
    interface greetMessage{
        void sayHello(String string);
    }
    @Test
    public void test2(){
        greetMessage greet=(message)->{
            //不可改变被final修饰的变量
            System.out.println(salutation+" "+message);
        };
        greet.sayHello("mrge");
    }
}

//静态方法引用
//反转字符串
class  MyStringOps{
    interface StringFunc{
        String func(String n);
    }
    //静态方法，反转字符串
    public static String strReserve(String str){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = str.length()-1; i >=0 ; i--) {
            stringBuilder.append(str.charAt(i));
        }
        return stringBuilder.toString();
    }

    public static String stringOp(StringFunc sf,String inStr){
        return sf.func(inStr);
    }

    @Test
    public void test(){
        String inStr="this is a testing input string,wait to process……";
        //MyStringOps::strReserve相当于实现了接口方法func(String n)
        //并在接口方法中做了MyStringOps.strReserve()操作
        String outStr=stringOp(MyStringOps::strReserve, inStr);
        System.out.println("Original String:"+inStr);
        System.out.println("String reserved:"+outStr);
    }
}

//静态方法调用
//找出列表中最大值
class MyClass{
    public   int val;
    MyClass(int val){
        this.val=val;
    }
    public int getVal(){
        return this.val;
    }

    public static int compareM(MyClass a,MyClass b){
        return a.getVal()-b.getVal();
    }

    @Test
    public void test(){
        ArrayList<MyClass> myClasses = new ArrayList<>();
        myClasses.add(new MyClass(1));
        myClasses.add(new MyClass(2));
        myClasses.add(new MyClass(3));
        myClasses.add(new MyClass(4));
        myClasses.add(new MyClass(5));
        MyClass myClass = Collections.max(myClasses,MyClass::compareM);
        System.out.println("max value is :"+myClass.getVal());

    }
}

//特定对象方法的引用
//实例上的实例方法引用
interface StringFunc1{
    String func(String n);
}
class stringOp{
    //反转字符串
    public String strPro(String str){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = str.length()-1; i >=0 ; i--) {
            stringBuilder.append(str.charAt(i));
        }
        return stringBuilder.toString();
    }
}

class Test1{
    public static String stringOp(StringFunc1 sf,String str){
        return sf.func(str);
    }
    @Test
    public void test(){
        String str="this is a test string& ";
        stringOp stringOp = new stringOp();
        String outString = stringOp(stringOp::strPro,str);
        System.out.println("Orginal string:"+str);
        System.out.println("Reserved string:"+outString);
    }
}
//实例方法引用
//超类上的实例方法引用 super::methodName

//实例方法引用
//类型上的实例方法引用


class Test2{
    interface myInter{
         void print(String str);
    }
        @Test
        public void ss(){
            myInter my=(message)->{
                System.out.println(message);
            };
            my.print("this is test message");
        }
}














