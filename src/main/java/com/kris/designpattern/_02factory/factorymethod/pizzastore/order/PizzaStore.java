package com.kris.designpattern._02factory.factorymethod.pizzastore.order;

/**
 * 相当于客户端,发出订购任务
 */
public class PizzaStore {
    public static void main(String[] args) {
        OrderPizza orderPizza = new BJOrderPizza();
    }
}
