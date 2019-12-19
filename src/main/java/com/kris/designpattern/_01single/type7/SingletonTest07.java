package com.kris.designpattern._01single.type7;

/**
 *  优缺点
 *      1.这种方式采用类装载机制来保证初始化实例时只有一个线程
 *      2.静态内部类在Singleton装载的时候不会立即实例化,耳屎在调用getInstance的时候才会装载
 *      3.类的静态属性只会第一次加载类的时候初始化,所以JVM保证了线程安全,在类初始化的时候,别的线程无法进入
 *      4.避免了线程不安全,利用静态内部类的特点实现了懒加载,效率高
 *  结论:
 *      推荐
 */
public class SingletonTest07 {
    public static void main(String[] args) {
    }
}

/*
    静态内部类
        在singleton在装载的时候,静态内部类不会装载,在调用的时候,会导致内部类装置,因此是线程安全的
 */
class Singleton{
    //1.私有化构造器,防止外部new
    private Singleton(){}

    private static class SingletonInstance{
        private static final Singleton INSTANCE = new Singleton();
    }
    private static Singleton getInstance(){
        return SingletonInstance.INSTANCE;
    }

}