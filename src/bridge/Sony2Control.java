package bridge;

public class Sony2Control implements Control {
    @Override
    public void on() {
        System.out.println("===Sony2===on===");
    }

    @Override
    public void off() {
        System.out.println("===Sony2===OFF===");
    }

    @Override
    public void setChannel(int channel) {
        System.out.println("===Sony2==Channel: " + channel);
    }

    @Override
    public void setVolume(int volume) {
        System.out.println("===Sony2==Volume: " + volume);
    }
}
