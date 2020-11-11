package com.spring.boot.bean;

import org.springframework.stereotype.Component;

/**
 * @author Javion
 */
@Component
public class Pets {
    public  String name;
    public  Integer age;

    @Override
    public String toString() {
        return "Pets{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
