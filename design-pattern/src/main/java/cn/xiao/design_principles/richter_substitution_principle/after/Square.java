package cn.xiao.design_principles.richter_substitution_principle.after;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Square implements Quadrilateral {
    private double side;


    @Override
    public double getWidth() {
        return side;
    }

    @Override
    public double getHeight() {
        return side;
    }
}
