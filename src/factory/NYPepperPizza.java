package factory;

public class NYPepperPizza extends Pizza {
    @Override
    public void prepare() {
        super.setName("NY Pepper Pizza");
        System.out.println(name + " prepare");
    }
}
