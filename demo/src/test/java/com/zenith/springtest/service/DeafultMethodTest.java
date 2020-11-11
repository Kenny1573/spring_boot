package com.zenith.springtest.service;

import org.junit.jupiter.api.Test;

public class DeafultMethodTest {
    interface Vehicle{
        default void print(){
            System.out.println("我是交通工具");
        }

        static void blowHorn(){
            System.out.println("按喇叭");
        }
    }

    interface FourVehicle{
        default void print(){
            System.out.println("我是四轮车");
        }
    }

    class Car implements Vehicle,FourVehicle{

        @Override
        public void print() {
            Vehicle.super.print();
            Vehicle.blowHorn();
            FourVehicle.super.print();
            System.out.println("我是一辆汽车");
        }
    }
    @Test
    public void test(){
        Car car = new Car();
        car.print();

    }
}
