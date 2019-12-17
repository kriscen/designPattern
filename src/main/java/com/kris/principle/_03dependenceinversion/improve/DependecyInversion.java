package com.kris.principle._03dependenceinversion.improve;

public class DependecyInversion {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
        person.receive(new WeiXin());
    }
}

interface IReceiver{
    String getInfo();
}

class Person{
    public void receive(IReceiver iReceiver){
        System.out.println(iReceiver.getInfo());
    }
}

class Email implements IReceiver {
    @Override
    public String getInfo(){
        return "电子邮件：hello world";
    }
}

class WeiXin implements IReceiver {
    @Override
    public String getInfo(){
        return "微信：hello world";
    }
}