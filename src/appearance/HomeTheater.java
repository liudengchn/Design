package appearance;

public class HomeTheater {
    private DVDPlayer dvdPlayer;
    private Screen screen;
    private Stereo stereo;

    public HomeTheater() {
        this.dvdPlayer = DVDPlayer.getInstance();
        this.screen = Screen.getInstance();
        this.stereo = Stereo.getInstance();
    }

    public void on() {
        dvdPlayer.on();
        stereo.setVolume(10);
        screen.on();
    }

    public void close() {
        dvdPlayer.close();
        stereo.subVolume();
        screen.close();
    }
}
