package com.kris.designpattern._07decorator;

public class Chocolate extends Decorator {
    public Chocolate(Drink obj) {
        super(obj);
        setDesc("巧克力");
        setPrice(3.0f);
    }
}
