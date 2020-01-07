package com.kris.designpattern._05adapter.classadapter;

public class Voltage220V {
    //输出220V电压
    public int output220V(){
        int src = 220;
        System.out.println("电压=" + src + "V");
        return src;
    }
}
