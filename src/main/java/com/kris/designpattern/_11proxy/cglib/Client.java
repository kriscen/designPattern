package com.kris.designpattern._11proxy.cglib;

public class Client {
    public static void main(String[] args) {
        //创建目标对象
        TeacherDao target = new TeacherDao();
        //获取代理对象,并且将目标传递给代理对象
        TeacherDao proxy = (TeacherDao)new ProxyFactory(target).getProxyInstance();
        //执行代理对象的方法,触发intercept,从而实现代理
        proxy.teach();
    }
}
