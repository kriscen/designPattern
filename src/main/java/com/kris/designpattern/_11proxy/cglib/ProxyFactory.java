package com.kris.designpattern._11proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class ProxyFactory implements MethodInterceptor {

    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object getTarget() {
        return target;
    }

    public Object getProxyInstance(){
        //1 创建工具类
        Enhancer enhancer = new Enhancer();
        //2 设置父类
        enhancer.setSuperclass(target.getClass());
        //3 返回回调函数
        enhancer.setCallback(this);
        //4 创建子对象
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("Cglib代理模式开始");
        Object invoke = method.invoke(target,args);
        System.out.println("Cglib代理模式提交");
        return invoke;
    }
}
