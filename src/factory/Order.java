package factory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Order {
    public AbsFactory absFactory;

    public Order(AbsFactory factory) {
        setAbsFactory(factory);
    }

    public void setAbsFactory(AbsFactory factory) {
        String type = null;
        Pizza pizza = null;
        this.absFactory = factory;
        do {
            type = getType();
            pizza = factory.createPizza(type);
            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.box();
            } else {
                System.out.println("this flavor is not exsit!");
            }

        } while (true);
    }

    public String getType() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("please input:");
            String str = reader.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }

    }
}
