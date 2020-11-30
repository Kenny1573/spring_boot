package com.kenny.optional;

import java.util.Optional;

/**
 * @author kenny
 * @version 1.0
 * @date 2020/11/30 15:14
 */
public class Admin {
    private Address address;
    private String name;
    private Double money;
    private String position;
    private String email;

    public Admin() {
        super();
    }

    public Admin(Address address, String name, Double money, String position, String email) {
        this.address = address;
        this.name = name;
        this.money = money;
        this.position = position;
        this.email = email;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Optional<Address> getAddress() {
        return Optional.ofNullable(address);
    }

    @Override
    public String toString() {
        return "Admin{" +
                "address=" + address +
                ", name='" + name + '\'' +
                ", money=" + money +
                ", position='" + position + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
