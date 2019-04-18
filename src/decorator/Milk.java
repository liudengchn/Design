package decorator;

public class Milk extends Decorator {
    public Milk(Drink drink) {
        super(drink);
        super.setDescription("Milk");
        super.setPrice(1.1f);
    }
}
