import greenfoot.*;

public class StartScreen extends World {
    protected final int players = 7;
    private Label l;

    public StartScreen() {
        super(1000, 600, 1);
        prepare();
    }

    private void prepare() {
        GreenfootImage bg = new GreenfootImage(getWidth(), getHeight());
        setBackground(bg);
        bg.setColor(new Color(153, 230, 255));
        bg.fill();

        l = new Label();
        addObject(l, 500, 500);
    }
}