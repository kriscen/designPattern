package com.kris.designpattern._10flyweight;

public class Client {
    public static void main(String[] args) {
        WebSiteFactory factory = new WebSiteFactory();
        WebSite webSite1 = factory.getWebSiteCategory("新闻");
        webSite1.use(new User("tom"));
        WebSite webSite2 = factory.getWebSiteCategory("博客");
        webSite2.use(new User("jerry"));

    }
}
