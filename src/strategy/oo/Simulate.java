package strategy.oo;

public class Simulate {
    public static void main(String[] args) {
        GreenDuck greenDuck = new GreenDuck();
        RedDuck redDuck = new RedDuck();

        greenDuck.display();
        greenDuck.shout();
//        greenDuck.swim();
        greenDuck.fly();

        System.out.println();

        redDuck.display();
        redDuck.shout();
//        redDuck.swim();
        redDuck.fly();
    }
}
