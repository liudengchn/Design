package strategy.pattern.behavior.impl;

import strategy.pattern.behavior.ShoutBehavior;

public class GaShout implements ShoutBehavior {
    @Override
    public void shout() {
        System.out.println("--gaga--");
    }
}
