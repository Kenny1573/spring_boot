package com.springdough.entity;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 * @author Kenny
 * @since 1.8
 * 实体Bean
 */
public class Dough {
    private String length;
    private String width;
    private Integer id;
    private String name;
    private LocalTime time;
    private boolean produce;

    public LocalTime getTime() {
        return time;
    }

    public boolean isProduce() {
        return produce;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public void setProduce(boolean produce) {
        this.produce = produce;
    }

    public Dough(LocalTime localTime){
        this.time=localTime;
    }
    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dough{" +
                "length='" + length + '\'' +
                ", width='" + width + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
