package com.kenny.collections.entity;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 * @author kenny
 * @version 1.0
 * @date 2020/11/25 13:56
 */
public class User {
    private String userName;
    private String pwd;
    private int age;
    private String address;
    private LocalDate date;

    public User() {
        this.userName = userName;
        this.pwd = pwd;
        this.age = age;
        this.address = address;
        this.date = date;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", pwd='" + pwd + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", date=" + date +
                '}';
    }
}
