package cn.xiao.factory_method;

public abstract class ShapeFactory{
    // 它定义了一个抽象的工厂方法 createShape，子类将实现这个方法来创建具体的图形对象
    abstract Shape createShape();
}
