package com.kris.designpattern._11proxy.staticproxy;

//静态代理
public class TeacherDaoProcy implements ITeacherDao {

    private ITeacherDao target;

    public TeacherDaoProcy(ITeacherDao target) {
        this.target = target;
    }

    @Override
    public void teach() {
        System.out.println("代理开始...");
        target.teach();
        System.out.println("代理结束...");
    }
}
