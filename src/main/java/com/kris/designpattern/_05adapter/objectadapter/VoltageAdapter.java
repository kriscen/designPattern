package com.kris.designpattern._05adapter.objectadapter;

public class VoltageAdapter implements IVoltage5V {
    private Voltage220V voltage220V;//聚合关系

    public VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5V() {
        int dst = 0;
        if(null != voltage220V){
            int src = voltage220V.output220V();
            System.out.println("对象适配器开始适配");
            dst = src / 44;
            System.out.println("适配完成");
        }
        return dst;
    }
}
