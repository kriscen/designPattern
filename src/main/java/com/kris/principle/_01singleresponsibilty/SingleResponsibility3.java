package com.kris.principle._01singleresponsibilty;

public class SingleResponsibility3 {
    public static void main(String[] args) {
        RoadVehicle roadVehicle = new RoadVehicle();
        roadVehicle.run("摩托");
        AirVehicle airVehicle = new AirVehicle();
        airVehicle.run("飞机");
        WaterVehicle waterVehicle = new WaterVehicle();
        waterVehicle.run("轮船");
    }
}

/**
 * 方案二
 *      1.遵守了单一职责原则
 *      2.但是这样改动能打，既要分解类，又要修改客户端
 *      3.直接改动Vehicle类
 */
class RoadVehicle{
    public void run(String vehicle){
        System.out.println(vehicle + "在公路跑");
    }
}

class AirVehicle{
    public void run(String vehicle){
        System.out.println(vehicle + "在天上跑");
    }
}

class WaterVehicle{
    public void run(String vehicle){
        System.out.println(vehicle + "在水里跑");
    }
}
