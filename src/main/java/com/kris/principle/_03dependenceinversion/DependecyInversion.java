package com.kris.principle._03dependenceinversion;

public class DependecyInversion {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
    }
}

/**
 * 完成Person接受消息功能
 * 方式1：
 *  1.简单，比较容易想到
 *  2.如果我们获取的对象不止短信，就需要新增类，同时Person也需要增加接受方法
 *  3.解决思路：引入一个抽象接口IReceiver，表示接受者，Person类与接口发生依赖
 *      短信，邮件都属于接收范围，个子受限了接口，符合依赖倒转原则DependecyInversion.java
 */

class Person{
    public void receive(Email email){
        System.out.println(email.getInfo());
    }
}

class Email{
    public String getInfo(){
        return "电子邮件：hello world";
    }
}