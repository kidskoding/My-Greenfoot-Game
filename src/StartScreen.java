import greenfoot.*;

public class StartScreen extends World {
    private Label l;

    public StartScreen() {
        super(1200, 700, 1);
        prepare();
    }

    private void prepare() {
        //create bg
        GreenfootImage bg = new GreenfootImage(getWidth(), getHeight());
        bg.setColor(new Color(153, 230, 255));
        bg.fill();
        setBackground(bg);

        //set text
        GreenfootImage text2 = new GreenfootImage("Welcome to my own Game", 64,
                null, null);
        bg.drawImage(text2, 275, 40);

        //add label
        l = new Label();
        addObject(l, 575, 575);
    }
}