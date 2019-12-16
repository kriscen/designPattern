package com.kris.principle._02interfacesegregation;

/**
 * 类A通过接口Interface1依赖类B，类C通过接口Interface1依赖类D，如果接口Interface1对于类A和类C来说不是最小接口，
 *    那么类B和类D必须去实现他们不需要的方法。
 *  按照隔离原则应做如下处理：
 *      将接口Interface1拆分为独立的几个接口，类A和类C分别与他们需要的接口建立依赖关系。
 */
public class Segregation1 {
    public static void main(String[] args) {

    }
}


interface Interface1{
    void operation1();
    void operation2();
    void operation3();
    void operation4();
    void operation5();
}

class B implements Interface1{

    @Override
    public void operation1() {
        System.out.println("B 实现 operation1");
    }

    @Override
    public void operation2() {
        System.out.println("B 实现 operation2");
    }

    @Override
    public void operation3() {
        System.out.println("B 实现 operation3");
    }

    @Override
    public void operation4() {
        System.out.println("B 实现 operation4");
    }

    @Override
    public void operation5() {
        System.out.println("B 实现 operation5");
    }
}

class D implements Interface1{

    @Override
    public void operation1() {
        System.out.println("D 实现 operation1");
    }

    @Override
    public void operation2() {
        System.out.println("D 实现 operation2");
    }

    @Override
    public void operation3() {
        System.out.println("D 实现 operation3");
    }

    @Override
    public void operation4() {
        System.out.println("D 实现 operation4");
    }

    @Override
    public void operation5() {
        System.out.println("D 实现 operation5");
    }
}

/**
 * A类通过接口Interface1 依赖 B类，但是只会用到1,2,3方法
 */
class A{
    public void depend1(Interface1 i){
        i.operation1();
    }
    public void depend2(Interface1 i){
        i.operation2();
    }
    public void depend3(Interface1 i){
        i.operation3();
    }
}

/**
 * C类通过接口Interface1 依赖 B类，但是只会用到1,4,5方法
 */
class C{
    public void depend1(Interface1 i){
        i.operation1();
    }
    public void depend4(Interface1 i){
        i.operation4();
    }
    public void depend5(Interface1 i){
        i.operation5();
    }
}