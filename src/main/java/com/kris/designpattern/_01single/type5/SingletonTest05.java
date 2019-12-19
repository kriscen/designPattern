package com.kris.designpattern._01single.type5;

/**
 *  优缺点
 *      1.实际上是第四种方法的改进
 *      2.但是这种同步不能起到线程同步作用.如果线程进入判断语句,还没往下执行,另一个线程也通过这个判断语句,会有线程安全问题
 *  结论:
 *      在实际开发中,不推荐
 */
public class SingletonTest05 {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1==instance2);
        System.out.println("instance1.hascode = "+instance1.hashCode());
        System.out.println("instance2.hascode = "+instance2.hashCode());
    }
}

//懒汉式-线程安全,同步代码块
class Singleton{
    //1.私有化构造器,防止外部new
    private Singleton(){}

    private static Singleton instance;

    //在用到的时候再去创建instance
    //假如synchronized,解决线程安全问题
    public static Singleton getInstance(){
        if(instance == null){
            synchronized(Singleton.class){
                instance = new Singleton();
            }
        }
        return instance;
    }
}