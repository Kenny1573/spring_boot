package com.spring.boot.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

/**
 * 将配置文件中的每一个属性都映射到这个组件中
 * @author Javion
 * @ConfigurationProperties 告诉Spring Boot将本类中的所有属性和配置文件中的配置进行绑定
 *  prefix="person"：配置文件中哪个下面的所有属性和本类相匹配
 *  只有组件是容器中的组件，才能使用容器提供的@ConfigurationProperties功能
 *  默认从全局配置文件中获取值
 */
@Component
@ConfigurationProperties(prefix = "person")
//@PropertySource(value = {"classpath:testPerson.properties"})
public class Person {
    private String lastName;
    private Integer age;
    private boolean boss;
    private LocalDate localDate;

    private Map<String ,Object> maps;
    private List<Object> objectList;

    private Dog dog;

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setBoss(boolean boss) {
        this.boss = boss;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public void setMaps(Map<String, Object> maps) {
        this.maps = maps;
    }

    public void setObjectList(List<Object> objectList) {
        this.objectList = objectList;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    @Override
    public String toString() {
        return "Person{" +
                "lastName='" + lastName + '\'' +
                ", age=" + age +
                ", boss=" + boss +
                ", localDate=" + localDate +
                ", maps=" + maps +
                ", objectList=" + objectList
               ;
    }
}
