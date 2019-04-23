package appearance;

public class Screen {
    private static Screen instance = null;

    private Screen() {

    }

    public static Screen getInstance() {
        if (instance == null) {
            instance = new Screen();
        }
        return instance;
    }

    public void on() {
        System.out.println("screen is on");
    }

    public void close() {
        System.out.println("screen is closed");
    }
}
