package com.kris.designpattern._03prototype.deep;

import java.io.Serializable;

public class DeepCloneableTarget implements Serializable,Cloneable {
    private static final long serialVersionUID = 1L;
    private String cloneName;
    private String cloneClass;

    public DeepCloneableTarget(String cloneName, String cloneClass) {
        this.cloneName = cloneName;
        this.cloneClass = cloneClass;
    }
    //因为属性都是string,所以使用默认clone即可
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
