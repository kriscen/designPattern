package com.kris.designpattern._01single.type8;

/**
 *  优缺点
 *      1.借助JDK1.5添加的枚举来实现单例,不仅能避免多线程同步问题,
 *          还可以防止反序列化重新创建新的对象
 *      2.这种方式是Effective Java作者提倡的方式
 *  结论:
 *      推荐
 */
public class SingletonTest08 {
    public static void main(String[] args) {
        Singleton instance = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;
        System.out.println(instance==instance2);
    }
}

/*
    使用枚举实现单例
 */
enum  Singleton{
    INSTANCE;
    public void sayOK(){
        System.out.println("ok");
    }
}