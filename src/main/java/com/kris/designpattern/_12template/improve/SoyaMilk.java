package com.kris.designpattern._12template.improve;

public abstract class SoyaMilk {
    //模板方法,做成final不可以重写
    final void make(){
        select();
        if(customerWantCondiments()){
            addCondiments();
        }
        soak();
        beat();
    }

    //选材
    void select(){
        System.out.println("第一步:选则黄豆");
    }

    //添加不同配料,抽象方法,子类具体实现
    abstract void addCondiments();

    //浸泡
    void soak(){
        System.out.println("第三步:黄豆和配料开始浸泡,需要三小时");
    }

    void beat(){
        System.out.println("第四步:将黄豆和配料方豆浆机打碎");
    }

    //钩子方法,决定是否需要添加配料
    boolean customerWantCondiments(){
        return true;
    }

}

