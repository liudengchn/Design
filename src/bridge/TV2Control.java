package bridge;

public class TV2Control extends TVLabs{
    private int pre = 0;

    public TV2Control(Control control) {
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
        pre = ch;
        ch++;
        if (ch > 200) {
            ch = 0;
        }
        control.setChannel(ch);
    }

    @Override
    public void preChannel() {
        pre = ch;
        ch--;
        if (ch < 0) {
            ch = 200;
        }
        control.setChannel(ch);
    }

    public void setChannel(int chn) {
        control.setChannel(chn);
    }

    public void back() {
        control.setChannel(pre);
    }
}
