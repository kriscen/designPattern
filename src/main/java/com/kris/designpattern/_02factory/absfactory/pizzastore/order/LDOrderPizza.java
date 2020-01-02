package com.kris.designpattern._02factory.absfactory.pizzastore.order;


import com.kris.designpattern._02factory.absfactory.pizzastore.pizza.LDCheesePizza;
import com.kris.designpattern._02factory.absfactory.pizzastore.pizza.LDPepperPizza;
import com.kris.designpattern._02factory.absfactory.pizzastore.pizza.Pizza;

public class LDOrderPizza implements AbsFactory{
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if("cheese".equals(orderType)){
            pizza = new LDCheesePizza();
        }else if("pepper".equals(orderType)){
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}
