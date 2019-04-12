package strategy.oo;

import strategy.pattern.Duck;

public class GreenDuck extends Duck {
    @Override
    public void display() {
        System.out.println("~~green~~");
    }
}
