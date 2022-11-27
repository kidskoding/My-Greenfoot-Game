import greenfoot.*;

public abstract class Challenge extends World {
    private Player player;
    private Player CPU;

    private GreenfootSound instructionSound;
    private GreenfootSound challengeSound;

    public Challenge() {
        super(1200, 700, 1);
        prepare();
    }

    private void prepare() {
        player = new Player();
        CPU = new Player();
        challengeSound = new GreenfootSound("challenge_music.wav");
        playInstructions();
        playGame();
    }

    public Player getPlayer() {
        return player;
    }
    public Player getCPU() {
        return CPU;
    }
    public GreenfootSound getChallengeSound() {
        return challengeSound;
    }
    public void setChallengeSound(GreenfootSound challengeSound) {
        this.challengeSound = challengeSound;
    }

    protected abstract void playGame();
    protected abstract void playInstructions();
}