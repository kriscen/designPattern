package com.kris.designpattern._07decorator;

public class Milk extends Decorator {
    public Milk(Drink obj) {
        super(obj);
        setDesc(" 牛奶 ");
        setPrice(2f);
    }
}
