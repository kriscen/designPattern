package com.kris.designpattern._02factory.simplefactory.improve.order;


import com.kris.designpattern._02factory.simplefactory.improve.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {
    public OrderPizza(PizzaSimpleFactory pizzaSimpleFactory) {
        setPizzaSimpleFactory(pizzaSimpleFactory);
    }
    //定义一个简单工厂对象
    PizzaSimpleFactory pizzaSimpleFactory;
    Pizza pizza = null;
    public void setPizzaSimpleFactory(PizzaSimpleFactory pizzaSimpleFactory) {
        String orderType = "";
        this.pizzaSimpleFactory = pizzaSimpleFactory;
        do {
            orderType = getType();
            pizza = this.pizzaSimpleFactory.createPizza(orderType);
            if(pizza != null){
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else {
                System.out.println("预定失败");
                break;
            }
        }while (true);
    }

    //从控制台输入披萨种类
    private String getType(){
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza type :" );
            String str = strin.readLine();
            return str;
        }catch (IOException e){
            e.printStackTrace();
        }
        return "";
    }
}
