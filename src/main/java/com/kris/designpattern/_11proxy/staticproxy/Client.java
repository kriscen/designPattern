package com.kris.designpattern._11proxy.staticproxy;

public class Client {
    public static void main(String[] args) {
        //创建目标对象
        TeacherDao teacherDao = new TeacherDao();
        //创建代理对象,同时将被代理对象传递给代理对象
        TeacherDaoProcy teacherDaoProcy = new TeacherDaoProcy(teacherDao);
        //通过代理对象,调用被代理对象的方法
        teacherDaoProcy.teach();

    }
}
