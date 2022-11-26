import greenfoot.*;
import java.util.*;

public class Label extends Actor {
    private List<World> availableGames;
    private World currentGame;

    public Label() {
        GreenfootImage rect = new GreenfootImage(300, 75);
        rect.setColor(Color.LIGHT_GRAY);
        rect.drawRect(500, 650, 500, 650);
        rect.fill();
        GreenfootImage textImage
                = new GreenfootImage("START", 40, null, null);
        rect.drawImage(textImage, 100, 20);
        setImage(rect);

        availableGames = new ArrayList<World>();
        addGames();
        currentGame = selectGame();
    }

    public World getCurrentGame() {
        return currentGame;
    }
    public void setCurrentGame(World currentGame) {
        this.currentGame = currentGame;
    }
    @Override
    public void act() {
        if(Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(currentGame);
            setCurrentGame(currentGame);
        }
    }
    private void addGames() {
        availableGames.add(new DiceGame());
    }
    public World selectGame() {
        Random pickGame = new Random();
        int gameInIndex = pickGame.nextInt(availableGames.size());
        return availableGames.get(gameInIndex);
    }
    public List<World> getAvailableGames() {
        return availableGames;
    }
}