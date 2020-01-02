package com.kris.designpattern._03prototype;

public class Sheep {
    private Integer age;
    private String name;
    private String color;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Sheep(Integer age, String name, String color) {
        this.age = age;
        this.name = name;
        this.color = color;
    }
}
