package cn.xiao.design_principles.richter_substitution_principle.before;

public class Square extends Rectangle {
    @Override
    public void setWidth(double width) {
        super.setLength(width);
        super.setWidth(width);
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
        super.setWidth(length);
    }
}
