package com.kenny.fangfayingyong;

/**
 * @author kenny
 * @version 1.0
 * @date 2020/11/26 15:45
 */
public class User {
    private String name;
    private Double money;

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
}
