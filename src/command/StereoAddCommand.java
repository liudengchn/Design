package command;

public class StereoAddCommand implements Command {
    private Stereo stereo;

    public StereoAddCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        int vol = stereo.getVol();
        if (vol < 12) {
            stereo.setVol(++vol);
        }
    }

    @Override
    public void undo() {
        int vol = stereo.getVol();
        if (vol > 0) {
            stereo.setVol(--vol);
        }
    }
}
