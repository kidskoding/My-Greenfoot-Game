import greenfoot.*;
import java.util.*;

public class Label extends Actor {
    private List<Challenge> challenges;
    private Challenge currentChallenge;
    private Banner b;

    public Label() {
        GreenfootImage rect = new GreenfootImage(300, 75);
        rect.setColor(Color.LIGHT_GRAY);
        rect.drawRect(500, 650, 500, 650);
        rect.fill();

        GreenfootImage textImage
                = new GreenfootImage("START", 40, null, null);
        rect.drawImage(textImage, 100, 20);
        setImage(rect);

        challenges = new ArrayList<Challenge>();
        addChallenges();
        currentChallenge = selectChallenge();
        b = new Banner(currentChallenge);
    }

    //Called when hit run button
    @Override
    public void act() {
        if(Greenfoot.mouseClicked(this)) {
            b.setCurrentChallenge(currentChallenge);
            makeTransparent();
           
            getWorld().addObject(b, getWorld().getWidth() / 2, getWorld().getHeight() / 2);
            getWorld().removeObject(this);
            Greenfoot.delay(100);
            Greenfoot.setWorld(currentChallenge);
        }
    }
    //helper methods
    public Challenge selectChallenge() {
        Random rand = new Random();
        int index = rand.nextInt(challenges.size());
        return challenges.get(index);
    }
    private void makeTransparent() {
        GreenfootImage bg = new GreenfootImage(getWorld().getWidth(), getWorld().getHeight());
        getWorld().setBackground("blurred_bg.png");
    }
    private void addChallenges() {
        //challenges.add(new LeftRightCenter());
        challenges.add(new PatternMatching());
    }

    //Accessor, Mutator methods
    public Banner getBanner() {
        return b;
    }
    public void setBanner(Banner b) {
        this.b = b;
    }
}