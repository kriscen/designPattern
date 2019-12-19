package com.kris.designpattern._02factory.simplefactory.pizzastore.pizza;

public class GreekPizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("给希腊披萨准备原材料");
    }
}
