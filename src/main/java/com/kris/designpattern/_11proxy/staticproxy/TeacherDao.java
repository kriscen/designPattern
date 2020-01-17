package com.kris.designpattern._11proxy.staticproxy;

public class TeacherDao implements ITeacherDao {

    @Override
    public void teach() {
        System.out.println("老师在上课");
    }
}
