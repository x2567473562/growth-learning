package cn.xiao.factory_method.demo01;

public class CircleFactory extends ShapeFactory{
    @Override
    Shape createShape() {
        return new Circle();
    }
}
