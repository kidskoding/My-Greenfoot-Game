import greenfoot.*;
import java.util.*;
public class Label extends Actor {
    private List<World> availableGames;
    private World currentGame;

    public Label() {
        GreenfootImage rect = new GreenfootImage(150, 50);
        rect.setColor(Color.LIGHT_GRAY);
        rect.drawRect(500, 600, rect.getWidth(), rect.getHeight());
        rect.drawString("START", rect.getWidth() / 2, rect.getHeight() / 2);
        rect.fill();
        setImage(rect);

        availableGames = new ArrayList<World>();
        addGames();
        currentGame = selectGame();
    }

    @Override
    public void act() {
        if(Greenfoot.mouseMoved(this)) {
            System.out.println(getCurrentGame());
            Greenfoot.setWorld(currentGame);
            setCurrentGame(currentGame);
            System.out.print(getCurrentGame().toString());
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

    public World getCurrentGame() {
        return currentGame;
    }
    public void setCurrentGame(World currentGame) {
        this.currentGame = currentGame;
    }
    public List<World> getAvailableGames() {
        return availableGames;
    }
}