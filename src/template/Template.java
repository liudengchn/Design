package template;

public abstract class Template {
    public void menu() {
        boil();
        add();
        pour();
    }

    public void boil() {
        System.out.println("boil--");
    }

    public void pour() {
        System.out.println("pour--");
    }

    public abstract void add();
}
