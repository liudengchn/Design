package factory;

public abstract class Pizza {
    public String name;

    public abstract void prepare();

    public void bake() {
        System.out.println(name + " bake");
    }

    public void box() {
        System.out.println(name + " box");
    }

    public void setName(String name) {
        this.name = name;
    }
}
