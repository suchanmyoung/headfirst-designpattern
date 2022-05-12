package designpattern.pizza_factory;

public class NYStyleCheesePizza extends Pizza {
    public NYStyleCheesePizza(){
        name = "NY Style cheese Pizza";
        dough = "Thin cheese Dough";
        sauce = "cheese Sauce";

        toppings.add("Cheese");

    }
}
