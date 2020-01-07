package com.kris.designpattern._06bridge;

public class Client {
    public static void main(String[] args) {
        Phone foldedPhone = new FoldedPhone(new Vivo());
        foldedPhone.open();
        foldedPhone.call();
        foldedPhone.close();


    }
}
