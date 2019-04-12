package strategy.pattern;

import strategy.pattern.behavior.impl.BadFlyBehavior;
import strategy.pattern.behavior.impl.ZaShout;

public class RedDuck extends Duck {
    public RedDuck() {
        flyBehavior = new BadFlyBehavior();
        shoutBehavior = new ZaShout();
    }

    @Override
    public void display() {
        System.out.println("~~red~~");
    }
}
