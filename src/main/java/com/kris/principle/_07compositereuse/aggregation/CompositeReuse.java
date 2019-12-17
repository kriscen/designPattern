package com.kris.principle._07compositereuse.aggregation;

/**
 *  聚合
 */
public class CompositeReuse {
}

class A{

}

class B{
    A a;

    public void setA(A a) {
        this.a = a;
    }
}