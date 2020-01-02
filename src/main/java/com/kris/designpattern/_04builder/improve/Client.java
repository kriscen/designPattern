package com.kris.designpattern._04builder.improve;

public class Client {
    public static void main(String[] args) {
        //盖普通房子
        CommonHouse commonHouse = new CommonHouse();
        //准备创建房子指挥者
        HouseDirector houseDirector = new HouseDirector(commonHouse);
        House house = houseDirector.construcHouse();

        //盖高楼
        HighBuilding highBuilding = new HighBuilding();
        //重置建造者
        houseDirector.setHouseBuilder(highBuilding);
        House house1 = houseDirector.construcHouse();

    }
}
