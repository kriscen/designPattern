package com.kris.designpattern._02factory.absfactory.pizzastore.order;

/**
 * 相当于客户端,发出订购任务
 */
public class PizzaStore {
    public static void main(String[] args) {
        new OrderPizza(new LDOrderPizza());
    }
}
