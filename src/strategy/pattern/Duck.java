package strategy.pattern;

import strategy.pattern.behavior.FlyBehavior;
import strategy.pattern.behavior.ShoutBehavior;
import strategy.pattern.behavior.SwimBehavior;

public abstract class Duck {
    FlyBehavior flyBehavior;
    ShoutBehavior shoutBehavior;
    SwimBehavior swimBehavior;

    public abstract void display();

    public void fly() {
        flyBehavior.fly();
    }

    public void shout() {
        shoutBehavior.shout();
    }

    public void swim() {
        swimBehavior.swim();
    }

    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    public void setShoutBehavior(ShoutBehavior sb) {
        shoutBehavior = sb;
    }

    public void setSwimBehavior(SwimBehavior swb) {
        swimBehavior = swb;
    }

    /*public void swim() {
        System.out.println("---swim----");
    }

    public void shout() {
        System.out.println("===gaga===");
    }

    public void fly() {
        System.out.println("++fly++");
    }*/

}
