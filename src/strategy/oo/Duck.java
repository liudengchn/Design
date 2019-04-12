package strategy.oo;

public abstract class Duck {
    public abstract void display();

    public void swim() {
        System.out.println("---swim----");
    }

    public void shout() {
        System.out.println("===gaga===");
    }

    public void fly() {
        System.out.println("++fly++");
    }

}
