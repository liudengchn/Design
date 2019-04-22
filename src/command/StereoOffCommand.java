package command;

public class StereoOffCommand implements Command {
    private Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        int vol = stereo.getVol();
        if (vol > 0) {
            stereo.setVol(--vol);
        }
    }

    @Override
    public void undo() {
        int vol = stereo.getVol();
        if (vol < 12) {
            stereo.setVol(++vol);
        }
    }
}
