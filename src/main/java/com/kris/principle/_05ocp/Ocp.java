package com.kris.principle._05ocp;

public class Ocp {
    public static void main(String[] args) {
        /*
             优缺点:
                1.好理解,简单易操作
                2.缺点是违反ocp原则,对外扩展开放(提供方),对修改关闭(使用方).
                3.假如新增图形种类,需修改地方太多
         */
        GraphicEditor editor = new GraphicEditor();
        editor.drawShape(new Rectangle());
        editor.drawShape(new Circle());
        //新增
        editor.drawShape(new Triangle());
    }
}
//绘制图形的类(使用方)
class GraphicEditor{
    //根据type绘制不同的图形
    public void drawShape(Shape s){
        if(s.m_type == 1){
            drawRectangle(s);
        }else if(s.m_type == 2){
            drawCircle(s);
        }else if(s.m_type == 3){
            //新增
            drawTriangle(s);
        }
    }

    public void drawRectangle(Shape s){
        System.out.println("绘制矩形");
    }
    public void drawCircle(Shape s){
        System.out.println("绘制圆形");
    }
    //新增
    public void drawTriangle(Shape s){
        System.out.println("绘制三角形");
    }

}
//基类
class Shape{
    int m_type;
}

class Rectangle extends Shape{
    Rectangle(){
        super.m_type = 1;
    }
}
class Circle extends Shape{
    Circle(){
        super.m_type = 2;
    }
}
//新增画三角形
class Triangle extends Shape{
    Triangle(){
        super.m_type = 3;
    }
}