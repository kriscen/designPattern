package com.kris.designpattern._08composite;

public class Client {
    public static void main(String[] args) {
        //从大到小创建对象
        OrganizationComponent university = new University("清华", "顶级大学");

        OrganizationComponent college1 = new College("计算机学院", "描述计算机学院");
        OrganizationComponent college2 = new College("信息工程学院", "描述信息工程学院");

        college1.add(new Department("软件工程","软件工程11"));
        college1.add(new Department("网络工程","网络工程11"));
        college1.add(new Department("计科工程","计科工程11"));

        college2.add(new Department("通信工程","通信难"));
        college2.add(new Department("信息工程","信息难"));

        university.add(college1);
        university.add(college2);

        college2.print();

    }
}
