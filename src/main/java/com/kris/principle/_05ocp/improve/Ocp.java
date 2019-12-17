package com.kris.principle._05ocp.improve;

/**
 *  改进思路:
 *      创建shape类做抽象类,并提供一个抽象draw方法,让子类去实现.
 *      这样新建图形种类时,只要让新的图形继承Shape并实现draw方法
 */
public class Ocp {
    public static void main(String[] args) {
        GraphicEditor editor = new GraphicEditor();
        editor.drawShape(new Rectangle());
        editor.drawShape(new Circle());
        editor.drawShape(new Triangle());
        editor.drawShape(new OtherGraphic());
    }
}

//绘制图形的类(使用方)
class GraphicEditor{
    public void drawShape(Shape s){
        s.draw();
    }


}

//基类
abstract class Shape{
    int m_type;
    public abstract void draw();
}

class Rectangle extends Shape {
    Rectangle(){
        super.m_type = 1;
    }

    @Override
    public void draw() {
        System.out.println("绘制矩形");
    }
}

class Circle extends Shape {
    Circle(){
        super.m_type = 2;
    }

    @Override
    public void draw() {
        System.out.println("绘制圆形");
    }
}

class Triangle extends Shape {
    Triangle(){
        super.m_type = 3;
    }

    @Override
    public void draw() {
        System.out.println("绘制三角形");
    }
}

class OtherGraphic extends Shape{
    OtherGraphic() {
        super.m_type = 4;
    }

    @Override
    public void draw() {
        System.out.println("绘制其他图形");
    }
}