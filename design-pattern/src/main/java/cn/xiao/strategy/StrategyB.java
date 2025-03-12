package cn.xiao.strategy;

public class StrategyB  implements Strategy{
    @Override
    public void show() {
        System.out.println("满200元减50元");
    }
}
