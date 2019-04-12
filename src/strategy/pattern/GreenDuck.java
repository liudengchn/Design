package strategy.pattern;

import strategy.pattern.behavior.ShoutBehavior;
import strategy.pattern.behavior.impl.GaShout;
import strategy.pattern.behavior.impl.GoodFlyBehavior;

public class GreenDuck extends Duck {
    public GreenDuck() {
        flyBehavior = new GoodFlyBehavior();
        shoutBehavior = new GaShout();
    }

    @Override
    public void display() {
        System.out.println("~~green~~");
    }
}
