package factory;

public class LDLovePizza extends Pizza {
    @Override
    public void prepare() {
        super.setName("LD Love Pizza");
        System.out.println(name + " prepare");
    }
}
