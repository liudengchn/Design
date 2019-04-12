package strategy.pattern.behavior.impl;

import strategy.pattern.behavior.ShoutBehavior;

public class ZaShout implements ShoutBehavior {
    @Override
    public void shout() {
        System.out.println("--zaza--");
    }
}
