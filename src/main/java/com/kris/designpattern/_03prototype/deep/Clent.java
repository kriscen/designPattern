package com.kris.designpattern._03prototype.deep;

public class Clent {
    public static void main(String[] args) throws CloneNotSupportedException {
        DeepPrototype p = new DeepPrototype();
        p.name = "jack";
        p.deepCloneableTarget = new DeepCloneableTarget("jerry","jerry's class");

        DeepPrototype clone = (DeepPrototype)p.clone();
        System.out.println(p.name + p.deepCloneableTarget.hashCode());
        System.out.println(clone.name + clone.deepCloneableTarget.hashCode());
    }
}
