package bridge;

public interface Control {
    void on();
    void off();
    void setChannel(int channel);
    void setVolume(int volume);
}
