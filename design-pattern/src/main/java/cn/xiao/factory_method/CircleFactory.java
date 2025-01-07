package cn.xiao.factory_method;

public class CircleFactory extends ShapeFactory{
    @Override
    Shape createShape() {
        return new Circle();
    }
}
