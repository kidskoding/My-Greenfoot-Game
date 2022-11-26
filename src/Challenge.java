import greenfoot.*;
import java.util.*;

public class Challenge extends World {
    private Player[] players;

    public Challenge() {
        super(1200, 700, 1);
        prepare();
    }

    private void prepare() {
        players = new Player[7];
    }

    public Player[] getPlayers() {
        return players;
    }
}