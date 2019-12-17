package com.kris.principle._04liskovsubstitution.improve;

public class Liskov {
    public static void main(String[] args) {

    }
}

class Base{
    public int func1(int a,int b){
        return a - b;
    }
}

class A extends Base{

}

class B extends Base {
    //如果B需要使用A类的方法,使用组合关系
    private A a = new A();
    //如果使用A的方法
    public int func3(int a,int b){
        return this.a.func1(a,b);
    }

    public int func2(int a,int b){
        return func1(a,b)+9;
    }
}
