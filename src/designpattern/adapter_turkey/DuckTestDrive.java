package designpattern.adapter_turkey;

public class DuckTestDrive {
    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();

        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("Turkey says...");
        turkey.gobble();
        turkey.fly();

        System.out.println("\nDuck says...");
        testDuck(duck);

        System.out.println("\n TurkeyAdapter Says...");
        testDuck(turkeyAdapter);
    }

    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
