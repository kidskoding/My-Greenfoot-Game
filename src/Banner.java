import greenfoot.*;

public class Banner extends Actor {
    private Challenge currentChallenge;
    private StringBuffer c;
    private final String txt = "Upcoming Challenge: ";
    private Banner() {

    }

    public Banner(Challenge currentChallenge) {
        this.currentChallenge = currentChallenge;
        GreenfootImage banner = new GreenfootImage(500, 125);
        banner.drawRect(500, 500, banner.getWidth(), banner.getHeight());
        banner.setColor(Color.RED);
        banner.fill();

        GreenfootImage header = new GreenfootImage(txt, 25, Color.WHITE, null);
        banner.drawImage(header, 160, 20);

        c = new StringBuffer(currentChallenge.toString());
        c.delete(c.indexOf("@"), c.length());
        GreenfootImage text = new GreenfootImage(c.toString(), 50, Color.WHITE, null);
        banner.drawImage(text, 100, 45);
        setImage(banner);
    }

    public Challenge getCurrentChallenge() {
        return currentChallenge;
    }
    public void setCurrentChallenge(Challenge currentChallenge) {
        this.currentChallenge = currentChallenge;
    }
}