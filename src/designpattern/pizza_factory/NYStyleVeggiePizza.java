package designpattern.pizza_factory;

public class NYStyleVeggiePizza extends Pizza {
    public NYStyleVeggiePizza(){
        name = "NY Style Sauce and Veggie Pizza";
        dough = "Thin Veggie Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Veggie Cheese");

    }
}
