package com.kris.designpattern._02factory.absfactory.pizzastore.order;

import com.kris.designpattern._02factory.absfactory.pizzastore.pizza.Pizza;

//一个抽象工厂模式的抽象层
public interface AbsFactory {
    public Pizza createPizza(String orderType);
}
