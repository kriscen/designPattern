package com.kris.designpattern._11proxy.cglib;

import com.kris.designpattern._11proxy.dynamic.ITeacherDao;

public class TeacherDao implements ITeacherDao {
    @Override
    public void teach() {
        System.out.println("老师在教书");
    }
}
