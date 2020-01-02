package com.kris.designpattern._04builder.improve;

/**
 * 指挥者,动态地指定制作流程,返回具体产品
 */
public class HouseDirector {
    HouseBuilder houseBuilder = null;
    //1.构造器传入
    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    //2.settrt传入
    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    //如何处理建造房子的流程,交给指挥者
    public House construcHouse(){
        houseBuilder.buildBasic();
        houseBuilder.buildWalls();
        houseBuilder.roofed();
        return houseBuilder.buildHouse();
    }

}
