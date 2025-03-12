package cn.xiao.strategy;

public class demo {
    public static void main(String[] args) {
        StrategyA strategyA = new StrategyA();
        SalesMan salesMan = new SalesMan(strategyA);
        salesMan.salesManShow();
    }
}
