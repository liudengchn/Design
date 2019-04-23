package appearance;

public class DVDPlayer {
    private static DVDPlayer instance = null;

    private DVDPlayer() {

    }

    public static DVDPlayer getInstance() {
        if (instance == null) {
            instance = new DVDPlayer();
        }
        return instance;
    }

    public void on() {
        System.out.println("DVDPlayer is on");
    }

    public void close() {
        System.out.println("DVDPlayer is closed");
    }
}
