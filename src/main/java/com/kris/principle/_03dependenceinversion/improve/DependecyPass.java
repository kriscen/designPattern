package com.kris.principle._03dependenceinversion.improve;

public class DependecyPass {
    public static void main(String[] args) {

    }
}

/*
 * 方式1 通过接口传递实现依赖
 *  开关的接口
 */

/*
interface IOpenAndClose{
    public void open(ITV tv);
}
interface ITV{
    public void play();
}
class OpenAndClose implements IOpenAndClose{

    @Override
    public void open(ITV tv) {
        tv.play();
    }
}*/

/*
 * 方式2 通过构造方法依赖传递
 */
/*
interface IOpenAndClose{
    public void open();
}
interface ITV{
    public void play();
}
class OpenAndClose implements IOpenAndClose{
    private ITV tv;
    public OpenAndClose(ITV tv){
        this.tv = tv;
    }
    @Override
    public void open() {
        this.tv.play();
    }
}*/


/*
 * 方式3 通过setter
 */
/*
interface IOpenAndClose{
    public void open();
    public void setTv(ITV tv);
}
interface ITV{
    public void play();
}
class OpenAndClose implements IOpenAndClose{
    private ITV tv;

    @Override
    public void setTv(ITV tv) {
        this.tv = tv;
    }

    @Override
    public void open() {
        this.tv.play();
    }
}*/
