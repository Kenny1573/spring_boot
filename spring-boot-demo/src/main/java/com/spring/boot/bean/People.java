package com.spring.boot.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

/**
 * @author Javion
 */
@Component
public class People {
//    @Value("${people.lastName}")
    private String lastName;
    private String pwd;
    @Value("#{11*2}")
    private Integer age;
    private LocalDate localDate;

    @Value("true")
    private boolean boss;

    @Override
    public String toString() {
        return "People{" +
                "lastName='" + lastName + '\'' +
                ", pwd='" + pwd + '\'' +
                ", age=" + age +
                ", localDate=" + localDate +
                ", boss=" + boss +
                '}';
    }
}
