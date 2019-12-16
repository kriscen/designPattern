package com.kris.principle._01singleresponsibilty;

public class SingleResponsibility2 {
    public static void main(String[] args) {
        Vehicle2 vehicle = new Vehicle2();
        vehicle.runLoad("摩托");
        vehicle.runAir("飞机");
        vehicle.runWater("轮船");
    }
}

/**
 *  方式3分析
 *      1.这种修改没有对原来类做大修改，只是增加了方法
*       2.虽然在类级别没有遵守单一职责，但是方法级别遵守了
 */
class Vehicle2{
    public void runAir(String vehicle){
        System.out.println(vehicle + "在天上跑");
    }
    public void runWater(String vehicle){
        System.out.println(vehicle + "在水里跑");
    }
    public void runLoad(String vehicle){
        System.out.println(vehicle + "在公路跑");
    }
}

