public class MusicplayerOnWithRadio implements Command {
    MusicPlayer player;

    public MusicplayerOnWithRadio(MusicPlayer player){
        this.player = player;
    }

    @Override
    public void execute() {
        player.on();
        player.radio();
    }
}