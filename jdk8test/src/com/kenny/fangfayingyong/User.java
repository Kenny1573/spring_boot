package com.kenny.fangfayingyong;

import java.util.Optional;

/**
 * @author kenny
 * @version 1.0
 * @date 2020/11/26 15:45
 */
public class User {
    private String name;
    private Double money;
    private String position;
    private String email;


    public Optional<String> getPosition(){
        return Optional.ofNullable(position);
    }
    public void setPosition(String position){
        this.position=position;
    }
    User() {
        super();
    }
    public User(String name, Double money) {
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public Double getMoney() {
        return money;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", money=" + money +
                ", position='" + position + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
