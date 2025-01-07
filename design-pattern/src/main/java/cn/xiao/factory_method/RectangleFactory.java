package cn.xiao.factory_method;

public class RectangleFactory extends ShapeFactory{
    @Override
    Shape createShape() {
        return new Rectangle();
    }
}
