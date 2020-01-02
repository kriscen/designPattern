package com.kris.designpattern._02factory.absfactory.pizzastore.order;

import com.kris.designpattern._02factory.absfactory.pizzastore.pizza.BJCheesePizza;
import com.kris.designpattern._02factory.absfactory.pizzastore.pizza.BJPepperPizza;
import com.kris.designpattern._02factory.absfactory.pizzastore.pizza.Pizza;

public class BJOrderPizza implements AbsFactory{

    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if("cheese".equals(orderType)){
            pizza = new BJCheesePizza();
        }else if("pepper".equals(orderType)){
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
