package com.kris.designpattern._02factory.simplefactory.pizzastore.order;

import com.kris.designpattern._02factory.simplefactory.pizzastore.pizza.CheesePizza;
import com.kris.designpattern._02factory.simplefactory.pizzastore.pizza.GreekPizza;
import com.kris.designpattern._02factory.simplefactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {
    //根据披萨种类生成披萨
    public OrderPizza() {
        Pizza pizza = null;
        String orderType;
        do {
            orderType = getType();
            if("greek".equals(orderType)){
                pizza = new GreekPizza();
                pizza.setName("希腊披萨");
            }else if("cheese".equals(orderType)){
                pizza = new CheesePizza();
                pizza.setName("奶酪披萨");
            }else {
                break;
            }
            //输出披萨制作过程
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
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
