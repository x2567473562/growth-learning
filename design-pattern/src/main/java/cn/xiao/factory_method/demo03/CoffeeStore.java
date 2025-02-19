package cn.xiao.factory_method.demo03;

public class CoffeeStore {

    private CoffeeFactory factory;

    public void setCoffeeStore(CoffeeFactory factory) {
        this.factory = factory;
    }

    public Coffee orderCoffee() {
        Coffee coffee = factory.createCoffee();
        coffee.addMilk();
        coffee.addsugar();
        return coffee;
    }

}
