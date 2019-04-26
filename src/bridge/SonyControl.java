package bridge;

public class SonyControl implements Control{
    @Override
    public void on() {
        System.out.println("===Sony===on===");
    }

    @Override
    public void off() {
        System.out.println("===Sony===OFF===");
    }

    @Override
    public void setChannel(int channel) {
        System.out.println("===Sony==Channel: " + channel);
    }

    @Override
    public void setVolume(int volume) {
        System.out.println("===Sony==Volume: " + volume);
    }
}
