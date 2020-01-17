package com.kris.designpattern._10flyweight;

import java.util.HashMap;

//网站工厂类,根据需求返回网站
public class WebSiteFactory {
    //集合,充当池
    private HashMap<String,ConcreteWebSite> pool = new HashMap<>();

    //根据网站类型,返回网站,如果没有就创建一个网站并放入池中
    public WebSite getWebSiteCategory(String type){
        if(!pool.containsKey(type)){
            pool.put(type,new ConcreteWebSite(type));
        }
        return (WebSite)pool.get(type);
    }

    //获取网站分类的总数
    public int getWebSiteCount(){
        return pool.size();
    }
}
