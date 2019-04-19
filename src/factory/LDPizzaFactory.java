package factory;

public class LDPizzaFactory implements AbsFactory {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type == "pepper") {
            pizza = new LDPepperPizza();
//            pizza.prepare();
        }
        if (type == "love") {
            pizza = new LDLovePizza();
//            pizza.prepare();
        }
        return pizza;
    }
}
