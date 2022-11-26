import greenfoot.*;
public class LeftRightCenter extends Challenge {
    private Dice die;
    private int numDollars;
    public LeftRightCenter() {
        prepare();
    }

    private void prepare() {
        //Make background color green
        GreenfootImage img = new GreenfootImage(getWidth(), getHeight());
        img.setColor(Color.GREEN);
        setBackground(img);
        img.fill();

        //Prepare the Game
        numDollars = getPlayers().length;
    }
}