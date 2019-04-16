package decorator.pattern;

public class Sugar extends Decorator {
    public Sugar(Drink drink) {
        super(drink);
        super.setDescription("sugar");
        super.setPrice(1f);
    }
}
