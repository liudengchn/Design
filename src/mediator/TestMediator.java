package mediator;

public class TestMediator {
    public static void main(String[] args) {
        ConcreteMediator concreteMediator = new ConcreteMediator();
        Alarm alarm = new Alarm(concreteMediator, "mA");
        TV tv = new TV(concreteMediator, "mtv");

        alarm.sendMessage(0);
        alarm.sendMessage(1);
    }
}
