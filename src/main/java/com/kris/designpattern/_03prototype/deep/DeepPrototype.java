package com.kris.designpattern._03prototype.deep;

import java.io.*;

public class DeepPrototype implements Serializable,Cloneable {
    public String name;
    public DeepCloneableTarget deepCloneableTarget;

    public DeepPrototype() {
    }

    //深拷贝方式1,重写clone方法

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object deep = null;
        //完成对基本数据类型(属性+string)的克隆
        deep = super.clone();
        //对引用类型的属性做单独处理
        DeepPrototype deepPrototype = (DeepPrototype)deep;
        deepPrototype.deepCloneableTarget = (DeepCloneableTarget) deepCloneableTarget.clone();
        return deepPrototype;
    }

    //深拷贝方式2:对象序列化(推荐)
    public Object deepClone(){
        //创建流对象
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;
        try {
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);//当前对象以对象流的方式输出

            //反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            DeepPrototype copyObj = (DeepPrototype)ois.readObject();

            return copyObj;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }finally {
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
