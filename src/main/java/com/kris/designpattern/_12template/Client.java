package com.kris.designpattern._12template;

public class Client {
    public static void main(String[] args) {
        //制作红豆豆浆
        SoyaMilk redBeanSoyaMilk = new RedBeanSoyaMilk();
        redBeanSoyaMilk.make();

        SoyaMilk peanutSoyaMilk = new PeanutSoyaMilk();
        peanutSoyaMilk.make();
    }
}
