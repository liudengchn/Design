package strategy.pattern;

public class Simulate {
    public static void main(String[] args) {
        Duck duckGreen = new GreenDuck();
        Duck duckRed = new RedDuck();
        Duck duckStone = new StoneDuck();

        duckGreen.display();
        duckGreen.shout();
        duckGreen.fly();

        duckRed.display();
        duckRed.shout();
        duckRed.fly();

        duckStone.display();
        duckStone.shout();
        duckStone.fly();
        duckStone.swim();

    }
}
