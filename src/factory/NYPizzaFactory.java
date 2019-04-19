package factory;

public class NYPizzaFactory implements AbsFactory {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("pepper")) {
            pizza = new  NYPepperPizza();
//            pizza.prepare();
        }
        if (type.equals("love")) {
            pizza = new NYLovePizza();
//            pizza.prepare();
        }
        return pizza;
    }
}
