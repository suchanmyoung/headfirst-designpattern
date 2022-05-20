package designpattern.state_gumballmachine;

public class SoldOutState implements State{
    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("죄송합니다 매진되었습니다.");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("죄송합니다 매진되었습니다.");
    }

    @Override
    public void turnCrank() {
        System.out.println("죄송합니다 매진되었습니다.");
    }

    @Override
    public void dispense() {
        System.out.println("죄송합니다 매진되었습니다.");
    }
}
