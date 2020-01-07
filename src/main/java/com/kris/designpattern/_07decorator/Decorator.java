package com.kris.designpattern._07decorator;

public class Decorator extends Drink {
    private Drink obj;

    public Decorator(Drink obj) {
        this.obj = obj;
    }

    @Override
    public float cost() {
        //getPrice 自己的价格
        return super.getPrice() + obj.cost();
    }

    @Override
    public String getDesc() {
        return super.desc + " "+ super.getPrice() + " && "+obj.getDesc();
    }
}

