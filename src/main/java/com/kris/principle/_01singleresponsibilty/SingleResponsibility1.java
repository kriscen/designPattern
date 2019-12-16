package com.kris.principle._01singleresponsibilty;

public class SingleResponsibility1 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("摩托");
        vehicle.run("汽车");
        vehicle.run("飞机");

    }
}

/**
 * 在方式1的run方法中违反单一职责，应该根据交通工具的不同，分解成不同的类
 *
 */
class Vehicle{
    public void run(String vehicle){
        System.out.println(vehicle + "在跑");
    }
}
