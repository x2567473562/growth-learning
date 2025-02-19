package cn.xiao.factory_method.demo01;

public class RectangleFactory extends ShapeFactory{
    @Override
    Shape createShape() {
        return new Rectangle();
    }
}
