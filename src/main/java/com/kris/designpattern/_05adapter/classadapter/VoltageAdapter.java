package com.kris.designpattern._05adapter.classadapter;

public class VoltageAdapter extends Voltage220V implements IVoltage5V {
    @Override
    public int output5V() {
        //获取220V电压
        int srcV = output220V();
        //转换
        int dstV = srcV / 44;
        return dstV;
    }
}
