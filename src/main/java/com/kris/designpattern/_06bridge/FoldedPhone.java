package com.kris.designpattern._06bridge;

/**
 * 折叠手机类,继承抽象类 phone
 */
public class FoldedPhone extends Phone {
    public FoldedPhone(Brand brand) {
        super(brand);
    }

    @Override
    public void open() {
        super.open();
        System.out.println("折叠样式手机");
    }

    @Override
    public void close() {
        super.close();
        System.out.println("折叠样式手机");
    }

    @Override
    public void call() {
        super.call();
        System.out.println("折叠样式手机");
    }
}
