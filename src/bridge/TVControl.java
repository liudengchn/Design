package bridge;

public class TVControl extends TVLabs{

    public TVControl(Control control) {
        super(control);
    }
    @Override
    public void onOff() {
        if (isOn) {
            isOn = false;
            control.off();
        } else {
            isOn = true;
            control.on();
        }
    }

    @Override
    public void nextChannel() {
        ch++;
        if (ch > 200) {
            ch = 0;
        }
        control.setChannel(ch);
    }

    @Override
    public void preChannel() {
        ch--;
        if (ch < 0) {
            ch = 200;
        }
        control.setChannel(ch);
    }
}
