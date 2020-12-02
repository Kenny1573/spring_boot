package com.kenny.springboot.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

/**
 * @author Kenny
 * @version 1.0
 * @description: Model-User
 * @date 2020/12/1 14:43
 */
public class UserBean implements Serializable {
    private static final long serialVersionUID = 1443169228686129873L;
    private String name;
    private String sex;
    private LocalDate birth;
    private Double money;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UserBean userBean = (UserBean) o;
        return name.equals(userBean.name) &&
                sex.equals(userBean.sex) &&
                birth.equals(userBean.birth) &&
                money.equals(userBean.money);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sex, birth, money);
    }

    public UserBean(){
        super();
    }

    public UserBean(String name, String sex, LocalDate birth, Double money) {
        this.name = name;
        this.sex = sex;
        this.birth = birth;
        this.money = money;
    }

    @Override
    public String toString() {
        return "UserBean{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", birth=" + birth +
                ", money=" + money +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }
}
