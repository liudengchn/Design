package decorator.pattern;

public class Coffee extends Drink{
    @Override
    public float cost() {
        return super.getPrice();
    }
}
