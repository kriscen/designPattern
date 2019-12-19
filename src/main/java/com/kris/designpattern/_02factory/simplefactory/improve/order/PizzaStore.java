package com.kris.designpattern._02factory.simplefactory.improve.order;

/**
 * 相当于客户端,发出订购任务
 */
public class PizzaStore {
    public static void main(String[] args) {
        new OrderPizza(new PizzaSimpleFactory());
        System.out.println("退出程序");
    }
}
