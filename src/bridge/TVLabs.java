package bridge;

public abstract class TVLabs {
    public int ch = 5;
    public boolean isOn;
    public Control control;

    public TVLabs(Control control) {
        this.control = control;
    }

    public abstract void onOff();
    public abstract void nextChannel();
    public abstract void preChannel();

}
