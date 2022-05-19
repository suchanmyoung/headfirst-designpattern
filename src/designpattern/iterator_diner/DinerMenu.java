package designpattern.iterator_diner;

public class DinerMenu {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu(){
        menuItems = new MenuItem[MAX_ITEMS];
        addItem("BLT", "상추 토마토", true, 2.99);
        addItem("BTT", "베이컨 통밀", false, 2.99);
        addItem("스프", "감자 샐러드 수프", false, 3.29);
        addItem("핫도그", "사워크라우트, 갖은 양념", false, 3.05);
    }

    public Iterator createIterator(){
        return new DinerMenuIterator(menuItems);
    }

    public void addItem(String name, String description, boolean vegetarian, double price){
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (numberOfItems >= MAX_ITEMS) {
            System.out.println("죄송합니다. 메뉴가 꽉 찼습니다");
        }else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems = numberOfItems + 1;
        }
    }
}
