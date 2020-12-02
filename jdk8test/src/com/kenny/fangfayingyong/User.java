package com.kenny.fangfayingyong;

import java.io.Serializable;
import java.util.Objects;
import java.util.Optional;

/**
 * @author kenny
 * @version 1.0
 * @date 2020/11/26 15:45
 */
public class User implements Serializable {
    private static final long serialVersionUID = 4980659523082601664L;
    private String name;
    private Double money;
    private String position;
    private String email;


    public Optional<String> getPosition() {
        return Optional.ofNullable(position);
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public User() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return name.equals(user.name) &&
                money.equals(user.money) &&
                position.equals(user.position) &&
                email.equals(user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, money, position, email);
    }


}
