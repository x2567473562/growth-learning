package cn.xiao.design_principles.richter_substitution_principle.after;


import lombok.Setter;

@Setter
public class Rectangle implements Quadrilateral{


    private double height;

    private double width;


    @Override
    public double getWidth() {
        return width;
    }

    @Override
    public double getHeight() {
        return height;
    }
}
