public class MusicplayerOnWithCD implements Command {
    MusicPlayer player;

    public MusicplayerOnWithCD(MusicPlayer player){
        this.player = player;
    }

    @Override
    public void execute() {
        player.on();
        player.cd();
    }
}
