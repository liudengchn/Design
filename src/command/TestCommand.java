package command;

public class TestCommand {
    public static void main(String[] args) {
        Light light = new Light("bedroom");
        Stereo stereo = new Stereo();

        Command commandLightOn = new LightOnCommand(light);
        Command commandLightOff = new LightOffCommand(light);
        Command stereoAddCommand = new StereoAddCommand(stereo);
        Command stereoOffCommand = new StereoOffCommand(stereo);

        Command[] onCommands = {commandLightOn, stereoAddCommand};
        Command[] offCommands = {commandLightOff, stereoOffCommand};

        Command onMacro = new MacroCommand(onCommands);
        Command offMacro = new MacroCommand(offCommands);


        CommandModeControl commandModeControl = new CommandModeControl();
        commandModeControl.setCommand(0, commandLightOn, commandLightOff);
        commandModeControl.setCommand(1, stereoAddCommand, stereoOffCommand);

        commandModeControl.setCommand(2, onMacro, offMacro);

        /*commandModeControl.on(0);
        commandModeControl.off(0);
        commandModeControl.on(1);
        commandModeControl.on(1);
        commandModeControl.on(1);
        commandModeControl.undo();
        commandModeControl.on(1);
        commandModeControl.off(1);*/
        System.out.println("-----");

        commandModeControl.on(2);
        commandModeControl.on(2);
        commandModeControl.on(2);
        commandModeControl.off(2);
    }
}
