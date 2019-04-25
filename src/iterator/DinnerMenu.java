package iterator;
import java.util.Iterator;


public class DinnerMenu {
    public int count = 0;
    private MenuItem[] menuItems;
    private static final int MAX_ITEM = 5;

    public DinnerMenu() {
        menuItems = new MenuItem[MAX_ITEM];
        addItem("44", "444", 1.4f, true);
        addItem("55", "555", 1.5f, true);
        addItem("66", "666", 1.6f, true);
    }

    public void addItem(String name, String description, float price, boolean vegetable) {
        MenuItem menuItem = new MenuItem(name , description, price, vegetable);
        if (count > MAX_ITEM) {
            System.out.println("the menu is full, please delete some");
        } else {
            menuItems[count] = menuItem;
            count++;
        }
    }

    public MenuItem[] getDinnerMenu() {
        return menuItems;
    }

    public Iterator getIterator() {
        return new DinnerIterator();
    }

    class DinnerIterator implements Iterator{

        @Override
        public boolean hasNext() {
            if (position < count) {
                return true;
            }
            return false;
        }

        @Override
        public void remove() {

        }

        private int position;
        public DinnerIterator() {
            position = 0;
        }

       /* @Override
        public boolean hasnext() {
            if (position < count) {
                return true;
            }
            return false;
        }*/

        @Override
        public Object next() {
            MenuItem menuItem = menuItems[position];
            position++;
            return menuItem;
        }
    }
}
