package com.kris.designpattern._03prototype.improve;


public class Client {
    public static void main(String[] args) {
        Sheep sheep = new Sheep(1, "Jack", "red");
        Sheep sheep2 = (Sheep) sheep.clone();
        Sheep sheep3 = (Sheep) sheep.clone();
        Sheep sheep4 = (Sheep) sheep.clone();

        System.out.println(sheep);
        System.out.println(sheep2);
        System.out.println(sheep3);
    }
}
