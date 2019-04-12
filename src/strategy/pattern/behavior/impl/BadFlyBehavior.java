package strategy.pattern.behavior.impl;

import strategy.pattern.behavior.FlyBehavior;

public class BadFlyBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("--bad fly--");
    }
}
