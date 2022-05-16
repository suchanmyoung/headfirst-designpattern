package designpattern.chocolate_singleton;

public class ChocolateBoiler {
    static ChocolateBoiler chocolateBoiler;

    private boolean empty;
    private boolean boiled;

    private ChocolateBoiler(){
        empty = true;
        boiled = false;
    }

    public static ChocolateBoiler getInstance(){
        if(chocolateBoiler == null) return chocolateBoiler = new ChocolateBoiler();
        return chocolateBoiler;
    }

    public void fill(){
        if(isEmpty()){
            empty = false;
            boiled = false;
        }
    }

    public void drain(){
        if (!isEmpty() && isBoiled()) {
            empty = true;
        }
    }

    public void boil(){
        if (!isEmpty() && !isBoiled()) {
            boiled = true;
        }
    }

    public boolean isEmpty(){
        return empty;
    }

    public boolean isBoiled(){
        return boiled;
    }
}
