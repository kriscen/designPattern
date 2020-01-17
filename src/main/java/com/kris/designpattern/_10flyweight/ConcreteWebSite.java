package com.kris.designpattern._10flyweight;

public class ConcreteWebSite extends WebSite {

    private String type = "";//网站发布的形式

    public ConcreteWebSite(String type) {
        this.type = type;
    }

    @Override
    public void use(User user) {
        System.out.println("网站的发布形式为:"+type+",用户为:"+user.getName());
    }
}
