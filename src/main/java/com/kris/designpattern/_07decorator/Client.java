package com.kris.designpattern._07decorator;

public class Client {
    public static void main(String[] args) {
        //下订单:2份巧克力一份牛奶的longblack
        Drink order = new LongBlack();
        System.out.println("费用1:"+order.cost());
        System.out.println("描述1:"+order.getDesc());

        //加入牛奶
        order = new Milk(order);
        System.out.println("费用2:"+order.cost());
        System.out.println("描述2:"+order.getDesc());

        //加入巧克力
        order = new Chocolate(order);
        System.out.println("费用3:"+order.cost());
        System.out.println("描述3:"+order.getDesc());

        //加入巧克力
        order = new Chocolate(order);
        System.out.println("费用4:"+order.cost());
        System.out.println("描述4:"+order.getDesc());
    }
}
