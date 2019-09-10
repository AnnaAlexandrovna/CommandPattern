import javafx.scene.control.Cell;

public class RemoteControleTest {
    public static void main(String[] args) {
        SimpleRemoteControl remoteControl = new SimpleRemoteControl();

        Light light = new Light("kitchen");
        Light light1 = new Light("living room");
        Stereo stereo = new Stereo();
        NoCommand noCommand = new NoCommand();

        LightOnCommand kitchenLightOn = new LightOnCommand(light);
        Command livingRoomOn = new LightOnCommand(light1);

        LightOffCommand kitchenLightOff = new LightOffCommand(light);
        Command livingRoomOff = new LightOffCommand(light1);

        Command stereoOnWithCDCommand = new StereoOnWithCDCommand(stereo);
        Command stereoOffCommand = new StereoOffCommand(stereo);

        remoteControl.setCommands(0, kitchenLightOn, kitchenLightOff);
        remoteControl.setCommands(1, livingRoomOn, livingRoomOff);
        remoteControl.setCommands(2, stereoOnWithCDCommand, stereoOffCommand);

        CeilingFan ceilingFan = new CeilingFan("Bedroom");
        CelingFanMediumCommand celingFanMediumCommand = new CelingFanMediumCommand(ceilingFan);
        CelingFanOffCommand celingFanOffCommand = new CelingFanOffCommand(ceilingFan);
        CellingFanLowCommand celingFanLowCommand = new CellingFanLowCommand(ceilingFan);
        CelinfFanHighCommand celinfFanHighCommand = new CelinfFanHighCommand(ceilingFan);
        remoteControl.setCommands(3, celinfFanHighCommand, celingFanOffCommand);
        remoteControl.setCommands(4,celingFanMediumCommand, celingFanOffCommand);
        remoteControl.setCommands(5, celingFanLowCommand, celingFanOffCommand);

        System.out.println(remoteControl);

        remoteControl.onButtonWasPressed(0);
        remoteControl.offButtonWasPressed(0);

        System.out.println(remoteControl);

        remoteControl.undoButtonWasPushed();
        remoteControl.offButtonWasPressed(0);
        remoteControl.onButtonWasPressed(1);
        remoteControl.offButtonWasPressed(1);
        remoteControl.onButtonWasPressed(2);
        remoteControl.offButtonWasPressed(2);
        System.out.println(remoteControl);
        System.out.println("-------");
        remoteControl.onButtonWasPressed(3);
        remoteControl.offButtonWasPressed(3);
        System.out.println(remoteControl);
        System.out.println("-------");
        remoteControl.undoButtonWasPushed();

        Command[] partyOn ={livingRoomOn, stereoOnWithCDCommand, celingFanMediumCommand};
        Command[] partyOff = {livingRoomOff,stereoOffCommand, celingFanOffCommand};

        MacroCommand partyOnMacroCommand = new MacroCommand(partyOn);
        MacroCommand partyOMacroCffommand = new MacroCommand(partyOff);

        remoteControl.setCommands(4, partyOnMacroCommand, partyOMacroCffommand);
        System.out.println("----- Pushing Macro On ----------");
        remoteControl.onButtonWasPressed(4);
        System.out.println("----- Pushing Macro Off ----------");
        remoteControl.offButtonWasPressed(4);

    }
}
