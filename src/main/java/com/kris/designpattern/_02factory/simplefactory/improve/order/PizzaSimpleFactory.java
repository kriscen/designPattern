package com.kris.designpattern._02factory.simplefactory.improve.order;


import com.kris.designpattern._02factory.simplefactory.improve.pizza.CheesePizza;
import com.kris.designpattern._02factory.simplefactory.improve.pizza.GreekPizza;
import com.kris.designpattern._02factory.simplefactory.improve.pizza.Pizza;

/**
 * 简单工厂
 */
public class PizzaSimpleFactory {
    //根据orderType返回Pizza
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        System.out.println("使用简单工厂模式");
        if ("greek".equals(orderType)) {
            pizza = new GreekPizza();
            pizza.setName("希腊披萨");
        } else if ("cheese".equals(orderType)) {
            pizza = new CheesePizza();
            pizza.setName("奶酪披萨");
        }
        return pizza;
    }
    /*
        简单工厂模式也叫静态工厂模式,因为经常将创造方法改为静态方法
     */
    public static Pizza createPizza2(String orderType) {
        Pizza pizza = null;
        System.out.println("使用简单工厂模式");
        if ("greek".equals(orderType)) {
            pizza = new GreekPizza();
            pizza.setName("希腊披萨");
        } else if ("cheese".equals(orderType)) {
            pizza = new CheesePizza();
            pizza.setName("奶酪披萨");
        }
        return pizza;
    }
}
