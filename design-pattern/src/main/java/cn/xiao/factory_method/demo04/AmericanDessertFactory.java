package cn.xiao.factory_method.demo04;

public class AmericanDessertFactory implements DessertFactory{
    @Override
    public AmericanCoffee createCoffee() {
        return new AmericanCoffee();
    }

    @Override
    public MatchaMousso createDessert() {
        return new MatchaMousso();
    }
}
