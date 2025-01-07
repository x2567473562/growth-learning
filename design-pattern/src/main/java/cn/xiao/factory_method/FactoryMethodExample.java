package cn.xiao.factory_method;

public class FactoryMethodExample {
    public static void main(String[] args) {
        ShapeFactory circleFactory = new CircleFactory();
        circleFactory.createShape().draw();

        ShapeFactory rectangleFactory = new RectangleFactory();
        rectangleFactory.createShape().draw();
    }
}
