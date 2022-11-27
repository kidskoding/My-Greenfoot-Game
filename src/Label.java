import greenfoot.*;
import java.util.*;

public class Label extends Actor {
    private List<Challenge> challenges;
    private Challenge currentChallenge;
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
    }

    @Override
    public void act() {
        if(Greenfoot.mouseClicked(this)) {
            setCurrentChallenge(currentChallenge);
            Greenfoot.setWorld(getCurrentChallenge());
        }
    }
    public Challenge selectChallenge() {
        Random rand = new Random();
        int index = rand.nextInt(challenges.size());
        return challenges.get(index);
    }

    public Challenge getCurrentChallenge() {
        return currentChallenge;
    }
    public void setCurrentChallenge(Challenge currentChallenge) {
        this.currentChallenge = currentChallenge;
    }
    public List<Challenge> getChallenges() {
        return challenges;
    }
    private void addChallenges() {
        challenges.add(new LeftRightCenter());
        //challenges.add(new Verbatim());
    }
}