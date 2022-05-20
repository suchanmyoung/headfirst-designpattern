package designpattern.state_gumballmachine;

public class GumballMachineTestDrive {
    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(5);

        gumballMachine.toStr();

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        gumballMachine.toStr();

        gumballMachine.insertQuarter();
        gumballMachine.toStr();
        gumballMachine.insertQuarter();
        gumballMachine.toStr();

        gumballMachine.toStr();
    }
}
