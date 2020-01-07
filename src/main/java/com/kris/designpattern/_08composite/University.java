package com.kris.designpattern._08composite;

import java.util.ArrayList;
import java.util.List;
//composite
public class University extends OrganizationComponent {
    //存的college
    List<OrganizationComponent> organizationComponents = new ArrayList<OrganizationComponent>();

    public University(String name, String des) {
        super(name, des);
    }

    @Override
    protected void print() {
        //输出包含的学院
        System.out.println("--------"+getName()+"--------");
        for (OrganizationComponent organizationComponent : organizationComponents) {
            organizationComponent.print();
        }
    }

    @Override
    protected void add(OrganizationComponent organizationComponent) {
        organizationComponents.add(organizationComponent);
    }

    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        organizationComponents.remove(organizationComponent);
    }


}
