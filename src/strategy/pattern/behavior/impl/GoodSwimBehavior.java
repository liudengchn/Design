package strategy.pattern.behavior.impl;

import strategy.pattern.behavior.SwimBehavior;

public class GoodSwimBehavior implements SwimBehavior {
    @Override
    public void swim() {
        System.out.println("--swim--");
    }
}
