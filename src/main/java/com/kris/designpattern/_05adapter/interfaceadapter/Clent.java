package com.kris.designpattern._05adapter.interfaceadapter;

public class Clent {
    public static void main(String[] args) {
        new AbsAdapter(){
            @Override
            public void m1() {
                System.out.println("m1");
            }
        };
    }
}
