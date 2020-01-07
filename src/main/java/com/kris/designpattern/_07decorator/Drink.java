package com.kris.designpattern._07decorator;

public abstract class Drink {
    public String desc;
    private float price = 0.0f;

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    //计算方法由子类实现
    public abstract float cost();
}
