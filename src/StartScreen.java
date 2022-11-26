import greenfoot.*;

public class StartScreen extends World {
    protected final int players = 7;
    private Label l;

    public StartScreen() {
        super(1200, 700, 1);
        prepare();
    }

    private void prepare() {
        //create bg
        GreenfootImage bg = new GreenfootImage(getWidth(), getHeight());
        setBackground(bg);
        bg.setColor(new Color(153, 230, 255));
        bg.fill();

        //set text
        GreenfootImage text2 = new GreenfootImage("Welcome to my own Game", 64,
                null, null);
        bg.drawImage(text2, 275, 40);

        //add label
        l = new Label();
        addObject(l, 575, 575);
    }
}