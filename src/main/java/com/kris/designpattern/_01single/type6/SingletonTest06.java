package com.kris.designpattern._01single.type6;

/**
 *  优缺点
 *      1.double-check在多线程开发中经常用到
 *      2.线程安全,懒加载,效率高
 *  结论:
 *      推荐
 */
public class SingletonTest06 {
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

    private static volatile Singleton instance;

    //在用到的时候再去创建instance
    public static Singleton getInstance(){
        if(instance == null){
            synchronized(Singleton.class){
                if(instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}