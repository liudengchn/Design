package iterator;

import java.util.ArrayList;
import java.util.Iterator;


public class CakeMenu {
    private ArrayList<MenuItem> arrayList;

    public CakeMenu() {
        arrayList = new ArrayList<>();
        addItem("11", "111", 1.1f, true);
        addItem("22", "222", 1.2f, true);
        addItem("33", "333", 1.3f, true);
    }

    public void addItem(String name, String description, float price, boolean vegetable) {
        MenuItem menuItem = new MenuItem(name, description, price, vegetable);
        arrayList.add(menuItem);
    }

    public ArrayList getCakeMenu() {
        return arrayList;
    }

    public Iterator getIterator() {
        return arrayList.iterator();
//        return new CakeIterator();
    }

    /*class CakeIterator implements Iterator{
        private int position;
        public CakeIterator() {
            position = 0;
        }

        @Override
        public boolean hasnext() {
            if (position < arrayList.size()) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            MenuItem menuItem = arrayList.get(position);
            position++;
            return menuItem;
        }
    }*/
}
