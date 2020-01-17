package com.kris.designpattern._13command;

/**
 * 没有任何命令,即控制性,初始化每个按钮
 */
public class NoCommand implements Command {

    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }
}
