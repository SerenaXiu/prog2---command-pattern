public class Main {

    public static void main(String[] args){
        RemoteControl remote = new RemoteControl();
        Light light = new Light();
        remote.setCommand(new LightOnCommand(light));
        remote.buttonPressed();
        remote.setCommand(new LightOffCommand(light));
        remote.buttonPressed();
    }

}
