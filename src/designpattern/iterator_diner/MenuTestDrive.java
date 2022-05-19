package designpattern.iterator_diner;

public class MenuTestDrive {
    public static void main(String[] args) {
        DinerMenu dinerMenu = new DinerMenu();

        Iterator iterator = dinerMenu.createIterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            MenuItem menuItem = (MenuItem) next;
            System.out.println(menuItem.getDescription());
        }
    }
}
