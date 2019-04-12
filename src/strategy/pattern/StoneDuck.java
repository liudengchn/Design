package strategy.pattern;

import strategy.pattern.behavior.impl.BadFlyBehavior;
import strategy.pattern.behavior.impl.GaShout;
import strategy.pattern.behavior.impl.GoodSwimBehavior;

public class StoneDuck extends Duck {
    @Override
    public void display() {
        System.out.println("--stone duck--");
    }

    public StoneDuck() {
        flyBehavior = new BadFlyBehavior();
        shoutBehavior = new GaShout();
        swimBehavior = new GoodSwimBehavior();
    }
}
