package designpattern.duck_strategy;

public class DuckHunter {

    private QuackBehavior quackBehavior;

    public DuckHunter() {
        this.quackBehavior = new Quack();
        quackBehavior.quack();
    }
}
