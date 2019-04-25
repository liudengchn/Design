package iterator;

public class TestMenu {
    public static void main(String[] args) {
        /*Waitress waitress = new Waitress();
        waitress.printOrder();*/
        CakeMenu cakeMenu = new CakeMenu();
        DinnerMenu dinnerMenu = new DinnerMenu();

        Waitress waitress = new Waitress();
        waitress.addItem(cakeMenu.getIterator());
        waitress.addItem(dinnerMenu.getIterator());
        waitress.printOrder();
    }
}
