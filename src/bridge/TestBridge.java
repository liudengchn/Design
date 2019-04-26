package bridge;

public class TestBridge {
    public static void main(String[] args) {
        Control lg = new LGControl();
        Control so = new SonyControl();

        TVControl lgTV = new TVControl(lg);
        TVControl soTV = new TVControl(so);

        lgTV.onOff();
        lgTV.nextChannel();
        lgTV.nextChannel();
        lgTV.preChannel();
        lgTV.onOff();

        soTV.onOff();
        soTV.nextChannel();
        soTV.nextChannel();
        soTV.preChannel();
        soTV.onOff();

        Control so2 = new Sony2Control();
        TV2Control so2TV = new TV2Control(so2);
        so2TV.onOff();
        so2TV.nextChannel();
        so2TV.nextChannel();
        so2TV.back();
        so2TV.setChannel(10);
        so2TV.setChannel(20);
        so2TV.back();
        so2TV.onOff();
    }
}
