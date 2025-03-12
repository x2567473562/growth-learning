package cn.xiao.factory_method.demo04;

public class ItalyDessertFactory implements DessertFactory{
    @Override
    public LatteCoffee createCoffee() {
        return new LatteCoffee();
    }

    @Override
    public Tiramisu createDessert() {
        return new Tiramisu();
    }
}
