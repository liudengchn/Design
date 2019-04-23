package appearance;

public class Stereo {
    private static Stereo instance = null;
    private int volume = 0;

    private Stereo() {

    }

    public static Stereo getInstance() {
        if (instance == null) {
            instance = new Stereo();
        }
        return instance;
    }

    public void setVolume(int volume) {
         this.volume = volume;
        System.out.println("the volume is set:" + volume);
    }

    public void addVolume() {
        if (volume < 12) {
            volume++;
        }
        setVolume(volume);
    }

    public void subVolume() {
        if (volume > 0) {
            volume--;
        }
        setVolume(volume);
    }
}
