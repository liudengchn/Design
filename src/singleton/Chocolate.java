package singleton;

public class Chocolate {
    public static void main(String[] args) {
        Chocolate.getInstance().fill();
    }
    private boolean empty;

    private boolean boil;

    public static Chocolate chocolate = null;

    private Chocolate() {
        empty = true;
        boil = false;
    }

    public static Chocolate getInstance() {
        if (chocolate == null) {
            chocolate = new Chocolate();
        }
        return chocolate;
    }
    public void fill() {
        if (empty & !boil) {
            System.out.println(empty);
            empty = false;
            boil = false;
        }
    }

    public void drain() {
        if ((!empty) & boil) {
            empty = true;
            boil = false;
        }
    }
}
