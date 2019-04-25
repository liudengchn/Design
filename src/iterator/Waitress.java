package iterator;

import java.util.ArrayList;
import java.util.Iterator;


public class Waitress {
    private ArrayList<Iterator> arrayList;

    public Waitress() {
        arrayList = new ArrayList<>();
    }

    public void addItem(Iterator iterator) {
        arrayList.add(iterator);
    }

    public void printOrder() {
        MenuItem menuItem;
        Iterator iterator;
        for (int i = 0; i < arrayList.size(); i++) {
            iterator = arrayList.get(i);
            while (iterator.hasNext()) {
                menuItem = (MenuItem) iterator.next();
                System.out.println("description:" + menuItem.getDescription() + "-- name:" + menuItem.getName()
                        + "--price:" + menuItem.getPrice());
            }
        }
    }

    /*private CakeMenu cakeMenu;
    private DinnerMenu dinnerMenu;
    private ArrayList<MenuItem> arrayList;
    private MenuItem[] menuItems;

    public Waitress() {
        this.cakeMenu = new CakeMenu();
        this.arrayList = cakeMenu.getCakeMenu();

        this.dinnerMenu = new DinnerMenu();
        this.menuItems = dinnerMenu.getDinnerMenu();
    }

    public void printOrder() {
        MenuItem menuItem;
        for (int i = 0; i < arrayList.size(); i++) {
            menuItem = arrayList.get(i);
            System.out.println("description:" + menuItem.getDescription() + "-- name:" + menuItem.getName()
            + "--price:" + menuItem.getPrice());
        }

        for (int i = 0, len = dinnerMenu.count; i < len; i++) {
            menuItem = menuItems[i];
            System.out.println("description:" + menuItem.getDescription() + "-- name:" + menuItem.getName()
                    + "--price:" + menuItem.getPrice());
        }
    }*/
}
