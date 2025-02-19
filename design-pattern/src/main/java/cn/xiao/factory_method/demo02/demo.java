package cn.xiao.factory_method.demo02;

public class demo {
    public static void main(String[] args) {
        CoffeeStore coffeeStore = new CoffeeStore();
        Coffee american = coffeeStore.orderCoffee("american");

        System.out.println(american.getName());
    }
}
