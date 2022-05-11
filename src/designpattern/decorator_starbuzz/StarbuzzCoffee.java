package designpattern.decorator_starbuzz;

public class StarbuzzCoffee {
    public static void main(String[] args) {
    Beverage beverage2 = new DarkRoast();
    beverage2 = new Mocha(beverage2);
    beverage2 = new Mocha(beverage2);
    beverage2.getDescription();
    }
}
