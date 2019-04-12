package strategy.pattern.behavior.impl;

import strategy.pattern.behavior.FlyBehavior;

public class GoodFlyBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("--fly good--");
    }
}
