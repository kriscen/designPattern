package com.kris.designpattern._11proxy.dynamic;

public class Client {
    public static void main(String[] args) {
        //创建一个目标对象
        ITeacherDao target = new TeacherDao();
        //给目标对象创建代理对象
        ProxyFactory factory = new ProxyFactory(target);
        ITeacherDao proxy = (ITeacherDao)factory.getProxyInstance();
        proxy.teach();
    }
}
