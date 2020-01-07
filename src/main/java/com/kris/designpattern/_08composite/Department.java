package com.kris.designpattern._08composite;

/**
 *  add和remove不需要写,因为是叶子节点,所以也没有集合
 */
public class Department extends OrganizationComponent {

    public Department(String name, String des) {
        super(name, des);
    }

    @Override
    protected void print() {
        System.out.println(getName());
    }
}
