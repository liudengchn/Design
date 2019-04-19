package factory;

public class LDPepperPizza extends Pizza {
    @Override
    public void prepare() {
        super.setName("LD Pepper Pizza");
        System.out.println(name + " prepare");
    }
}
