package com.kris.designpattern._13command;

public class RemoteController {
    //开按钮的命令数组
    Command[] onCommands;
    Command[] offCommands;
    //执行撤销的命令
    Command undoCommand;
    //按钮初始化
    public RemoteController(){
        onCommands = new Command[5];
        offCommands = new Command[5];
        for (int i = 0; i < 5; i++) {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }
    //按钮设置需要的命令
    public void setCommand(int no,Command onCommand,Command offCommond){
        onCommands[no] = onCommand;
        offCommands[no] = offCommond ;
    }

    public void onButtonWasPushed(int no){
        onCommands[no].execute();
        undoCommand = onCommands[no];
    }

    public void offButtonWasPushed(int no){
        offCommands[no].execute();
        undoCommand = offCommands[no];
    }

    public void undoButtonPushed(){
        undoCommand.undo();
    }

}
