package cn.xiao.factory_method.demo04;

public class demo04 {
    public static void main(String[] args) {
        AmericanDessertFactory americanDessertFactory = new AmericanDessertFactory();
        Dessert dessert = americanDessertFactory.createDessert();
        dessert.show();

        AmericanCoffee coffee = americanDessertFactory.createCoffee();
        System.out.println(coffee.getName());
        coffee.addMilk();

    }
}
