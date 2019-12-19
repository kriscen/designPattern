package com.kris.designpattern._01single.type4;

/**
 *  优缺点
 *      1.解决了线程不安全问题
 *      2.效率低,每个线程想要获得实例的时候,都要进行同步.其实这个方法只执行一次实例化代码就行了,方法进行同步效率太低
 *
 *  结论:
 *      在实际开发中,不推荐
 */
public class SingletonTest04 {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1==instance2);
        System.out.println("instance1.hascode = "+instance1.hashCode());
        System.out.println("instance2.hascode = "+instance2.hashCode());
    }
}

//懒汉式-线程安全,同步方法
class Singleton{
    //1.私有化构造器,防止外部new
    private Singleton(){}

    private static Singleton instance;

    //在用到的时候再去创建instance
    //假如synchronized,解决线程安全问题
    public static synchronized Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}