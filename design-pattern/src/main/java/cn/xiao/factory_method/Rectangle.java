package cn.xiao.factory_method;

/**
 * 矩阵
 */
public class Rectangle implements Shape  {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}
