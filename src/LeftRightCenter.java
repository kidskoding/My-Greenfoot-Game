import greenfoot.*;
import java.util.*;
public class LeftRightCenter extends Challenge {
    private Dice die;
    private int numDollars;
    private List<Dollar> dollars;

    public LeftRightCenter() {
        prepare();
    }

    private void prepare() {
        //Make background color green
        GreenfootImage bg = new GreenfootImage(getWidth(), getHeight());
        bg.setColor(Color.GREEN);
        bg.fill();
        setBackground(bg);

        //Prepares the Game
        numDollars = 6;
    }
    @Override
    public void playGame() {

    }
    @Override
    public void playInstructions() {

    }
}