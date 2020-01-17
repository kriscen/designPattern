package com.kris.designpattern._13command;

public class Client {
    public static void main(String[] args) {
        //创建点灯对象(接受者)
        LightReceiver lightReceiver = new LightReceiver();
        //创建点灯相关的命令
        LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);
        LightOffCommand lightOffCommand = new LightOffCommand(lightReceiver);
        //创建遥控器控制
        RemoteController remoteController = new RemoteController();

        remoteController.setCommand(0,lightOnCommand,lightOffCommand);

        System.out.println("-----电灯开-------");
        remoteController.onButtonWasPushed(0);
        System.out.println("-----电灯关-------");
        remoteController.offButtonWasPushed(0);

        remoteController.undoButtonPushed();
    }
}
