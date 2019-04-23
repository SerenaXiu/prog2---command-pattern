public class Main {

    public static void main(String[] args){
        RemoteControl remote = new RemoteControl();
        Light light = new Light();
        MusicPlayer player = new MusicPlayer();
        remote.setCommand1(new LightOnCommand(light));
        remote.setCommand2(new LightOffCommand(light));
        remote.button1Pressed();
        remote.button2Pressed();
        remote.setCommand1(new MusicplayerOnWithCD(player));
        remote.setCommand2(new MusicplayerOff(player));
        remote.button1Pressed();
        remote.button2Pressed();
        remote.setCommand1(new MusicplayerOnWithRadio(player));
        remote.setCommand2(new MusicplayerOff(player));
        remote.button1Pressed();
        remote.button2Pressed();
    }

}
