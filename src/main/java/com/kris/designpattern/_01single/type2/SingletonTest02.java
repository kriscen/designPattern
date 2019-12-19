package com.kris.designpattern._01single.type2;

/**
 *  与静态变量类似,只是将类实例化的过程放在静态代码块中,优缺点一致
 *
 *  结论:
 *      可以用,但是可能造成内存浪费
 */
public class SingletonTest02 {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1==instance2);
        System.out.println("instance1.hascode = "+instance1.hashCode());
        System.out.println("instance2.hascode = "+instance2.hashCode());
    }
}

//饿汉式-静态代码块
class Singleton{
    //1.私有化构造器,防止外部new
    private Singleton(){}

    private static Singleton instance;

    //本类内部创建实例
    static{
        instance = new Singleton();
    }

    public static Singleton getInstance(){
        return instance;
    }
}