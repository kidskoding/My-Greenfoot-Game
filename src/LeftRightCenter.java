import greenfoot.*;
import java.util.*;
public class LeftRightCenter extends Challenge {
    private Dice die;
    private int numDollars;
    private List<Dollar> dollars;
    private Label next;

    public LeftRightCenter() {
        prepare();
    }

    private void prepare() {
        /* //Make background color green
        GreenfootImage bg = new GreenfootImage(getWidth(), getHeight());
        bg.setColor(Color.GREEN);
        setBackground(bg);
        bg.fill(); */

        //Prepare the Game
        numDollars = getPlayers().length * 3;
        next = new Label();
    }
    @Override
    public void showBanner() {
        GreenfootImage banner = new GreenfootImage(300, 100);
        banner.setColor(Color.RED);
        banner.drawRect(getBackground().getWidth() / 2, getBackground().getHeight() / 2,
                getBackground().getWidth() / 2, getBackground().getHeight() / 2);
        GreenfootImage text = new GreenfootImage(getClass().toString(), 50, Color.WHITE, null);
        banner.drawImage(text, 100, 20);
    }
    public void playInstructions() {

    }
}