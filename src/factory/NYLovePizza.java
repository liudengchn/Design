package factory;

public class NYLovePizza extends Pizza {
    @Override
    public void prepare() {
        super.setName("NY Love Pizza");
        System.out.println(name + " prepare");
    }
}
