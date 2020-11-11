package com.zenith.springtest.entity;

import java.time.LocalDate;

public class User {
    private int id;
    private String userName;
    private String pwd;
    private LocalDate register;

    public User(int id, String userName, String pwd, LocalDate register) {
        this.id = id;
        this.userName = userName;
        this.pwd = pwd;
        this.register = register;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public LocalDate getRegister() {
        return register;
    }

    public void setRegister(LocalDate register) {
        this.register = register;
    }
}
