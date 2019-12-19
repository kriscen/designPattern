package com.kris.designpattern._01single.type1;

/**
 *  优点:
 *      写法简单,在类装载的时候完成实例化,避免了线程同步问题
 *  缺点:
 *      在类装载的时候完成实例化,没有达到懒加载的效果.如果从始至终都没有使用过这个实例,会造成内存浪费
 *
 *      这种方式基于classloder机制避免了多线程的同步问题,不过instance在类装载的时候就实例化,在单例模式中大多数都是
 *      调用getInstance方法,但是导致类装载的原因有很多种,因此不能确定有其他的方式导致类装载,这时候初始化instance
 *      没有达到懒加载效果.
 *
 *  结论:
 *      这种单例模式可以用,可能造成内存浪费.
 */
public class SingletonTest01 {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1==instance2);
        System.out.println("instance1.hascode = "+instance1.hashCode());
        System.out.println("instance2.hascode = "+instance2.hashCode());
    }
}
//饿汉式-静态变量
class Singleton{
    //1.私有化构造器,防止外部new
    private Singleton(){}
    //本类内部创建实例
    private final static Singleton instance = new Singleton();

    public static Singleton getInstance(){
        return instance;
    }
}