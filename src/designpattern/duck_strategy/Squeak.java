package designpattern.duck_strategy;

public class Squeak implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("삑!");
    }
}
