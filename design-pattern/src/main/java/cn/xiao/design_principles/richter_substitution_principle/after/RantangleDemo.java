package cn.xiao.design_principles.richter_substitution_principle.after;

public class RantangleDemo {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(10);
        rectangle.setWidth(5);
        resize(rectangle);

        System.out.println("====================================");

        Square square = new Square();
        square.setSide(10);
        System.out.println("width: " + square.getWidth() + ", height: " + square.getHeight());

    }

    public static void resize(Rectangle rectangle) {
        while (rectangle.getWidth() <= rectangle.getHeight()) {
            rectangle.setWidth(rectangle.getWidth() + 1);
            System.out.println("width: " + rectangle.getWidth() + ", height: " + rectangle.getHeight());
        }
        System.out.println("resize finish, width: " + rectangle.getWidth() + ", height: " + rectangle.getHeight());
    }
}
