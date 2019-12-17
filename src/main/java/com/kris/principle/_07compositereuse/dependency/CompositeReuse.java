package com.kris.principle._07compositereuse.dependency;

/**
 *  依赖
 */
public class CompositeReuse {
}

class A{
    void func1(){}
}

class B{
    A a;

    void func1(A a){

    }

}