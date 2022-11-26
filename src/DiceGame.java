import greenfoot.*;
public class DiceGame extends World {
    public DiceGame() {
        super(1000, 600, 1);
        prepare();
    }

    private void prepare() {
        //Make background color green
        GreenfootImage img = new GreenfootImage(getWidth(), getHeight());
        img.setColor(Color.GREEN);
        setBackground(img);
        img.fill();
    }
}