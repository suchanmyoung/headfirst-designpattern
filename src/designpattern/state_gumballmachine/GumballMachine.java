package designpattern.state_gumballmachine;

public class GumballMachine {
//    final static int SOLD_OUT = 0; // 매진
//    final static int NO_QUARTER = 1; // 동전이 투입되지 않음
//    final static int HAS_QUARTER = 2; // 동전이 투입되어 있음
//    final static int SOLD = 3; //판매상태

    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;

    State state = soldOutState; // 현재 상태를 관리하기 위한 변수
    int count = 0; // 기계에 들어있는 알맹이의 개수


    public GumballMachine(int numberGumballs){
        soldState = new SoldState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldOutState = new SoldOutState(this);

        this.count = numberGumballs;
        if (numberGumballs > 0) {
            state = noQuarterState;
        }
    }

    public void insertQuarter(){
        state.insertQuarter();
    }

    public void ejectQuarter(){
       state.ejectQuarter();
    }

    public void turnCrank(){
        state.turnCrank();
        state.dispense();
    }

    void setState(State state) {
        this.state = state;
    }

    void releaseBall(){
        System.out.println("A gumball comes rolling out the slot..");
        if (count != 0) {
            count = count -1;
        }
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getState() {
        return state;
    }

    public int getCount() {
        return count;
    }

    public void toStr(){
        System.out.println();
        System.out.println("주식 회사 왕뽑기");
        System.out.println("자바로 돌아가는 2004년형 뽑기 기계");
        System.out.println("남은 개수 : " + count);
        System.out.println("동전 뽑기 대기 중");
        System.out.println();
    }
}
