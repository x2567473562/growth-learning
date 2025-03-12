package cn.xiao.decorator.demo;

//培根配量表
public class Bacon extends Garnish{

    public Bacon(FastFood fastFood) {
        super(fastFood, 0.5f, "培根");
    }
    @Override
    public float cost() {
        return 0;
    }

    @Override
    public String getDesc() {
        return super.getDesc();
    }
}
