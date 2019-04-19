package factory;

public class Test {
    public static void main(String[] args) {
        AbsFactory absFactory = new NYPizzaFactory();
        Order order = new Order(absFactory);
    }
}
