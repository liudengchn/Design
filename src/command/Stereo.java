package command;

public class Stereo {
    private int vol = 0;

    public void on() {
        System.out.println("stereo on");
    }

    public void off() {
        System.out.println("stereo off");
    }

    public void setVol(int vol) {
        this.vol = vol;
        System.out.println("this volume:" + vol) ;
    }

    public int getVol() {
        return this.vol;
    }

}
