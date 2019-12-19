package com.kris.designpattern._01single.type3;

/**
 *  优缺点
 *      1.起到了懒加载作用,但是只能单线程使用
 *      2.在多线程下有线程安全问题
*   结论:
 *      在实际开发中不要用
 */
public class SingletonTest03 {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1==instance2);
        System.out.println("instance1.hascode = "+instance1.hashCode());
        System.out.println("instance2.hascode = "+instance2.hashCode());
    }
}

//懒汉式-线程不安全
class Singleton{
    //1.私有化构造器,防止外部new
    private Singleton(){}

    private static Singleton instance;

    //在用到的时候再去创建instance
    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}