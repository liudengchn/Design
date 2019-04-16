package decorator.pattern;

public class TestDrink {
    public static void main(String[] args) {
        Drink drink;
        drink = new LongCoffee();
        drink = new Milk(drink);
        drink = new Milk(drink);
        drink = new Sugar(drink);
        System.out.println("消费：" + drink.cost());
        System.out.println("描述：" + drink.getDescription());
    }
}
