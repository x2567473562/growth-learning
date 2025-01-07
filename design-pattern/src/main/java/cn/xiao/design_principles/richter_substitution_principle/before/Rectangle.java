package cn.xiao.design_principles.richter_substitution_principle.before;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 里氏代换原则
 */
@Setter
@Getter
@ToString
public class Rectangle {
    private double length;
    private double width;
}
