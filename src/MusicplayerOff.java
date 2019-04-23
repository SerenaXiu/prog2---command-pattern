public class MusicplayerOff implements Command {
    MusicPlayer player;

    public MusicplayerOff(MusicPlayer player){
        this.player = player;
    }

    @Override
    public void execute() {
        player.off();
    }
}
