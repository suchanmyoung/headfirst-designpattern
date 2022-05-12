package designpattern.pizza_factory;

public class NYStylePepperoniPizza extends Pizza {
    public NYStylePepperoniPizza(){
        name = "NY Style Sauce and cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
    }
}
