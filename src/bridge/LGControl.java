package bridge;

public class LGControl implements Control{
    @Override
    public void on() {
        System.out.println("===LG===on===");
    }

    @Override
    public void off() {
        System.out.println("===LG===OFF===");
    }

    @Override
    public void setChannel(int channel) {
        System.out.println("===LG==Channel: " + channel);
    }

    @Override
    public void setVolume(int volume) {
        System.out.println("===LG==Volume: " + volume);
    }
}
