import greenfoot.*;

public abstract class Challenge extends World {
    private Player[] players;

    public Challenge() {
        super(1200, 700, 1);
        prepare();
    }

    private void prepare() {
        players = new Player[7];
        playInstructions();
    }

    public Player[] getPlayers() {
        return players;
    }

    protected abstract void playInstructions();
}