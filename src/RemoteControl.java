public class RemoteControl {
    Command slot;
    Command slot2;

    public void setCommand1 (Command command){
        slot = command;
    }

    public void setCommand2 (Command command){
        slot2 = command;
    }

    public void button1Pressed(){
        slot.execute();
    }

    public void button2Pressed(){
        slot2.execute();
    }
}
