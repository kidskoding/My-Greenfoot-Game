import greenfoot.*;

public class Board extends Actor {
    private GreenfootImage[][] board;

    private Color defaultColor;
    private Color revertedColor;

    public Board() {
        board = new GreenfootImage[5][5];
        prepare();
    }

    private void prepare() {
        defaultColor = new Color(164, 155, 143);
        revertedColor = new Color(255, 255, 255);
        createBoard();
        fill();
    }
    @Override
    public void act() {
        for(int r = 0; r < board.length; r++) {
            for(int c = 0; c < board[r].length; c++) {
                GreenfootImage tile = board[r][c];
                if(Greenfoot.mouseClicked(tile) && tile.getColor() == defaultColor) {
                    tile.setColor(revertedColor);
                    tile.fill();
                }
                else if(Greenfoot.mouseClicked(tile) && tile.getColor() == revertedColor) {
                    tile.setColor(defaultColor);
                    tile.fill();
                }
                setImage(tile);
            }
        }
    }
    private void createBoard() {
        for(int r = 0; r < board.length; r++) {
            for(int c = 0; c < board[r].length; c++) {
                GreenfootImage tile = new GreenfootImage(451, 451);
                tile.drawRect(399, 551, 399, 551);
                board[r][c] = tile;
                setImage(tile);
            }
        }
    }
    private void fill() {
        for(int r = 0; r < board.length; r++) {
            for(int c = 0; c < board[r].length; c++) {
                GreenfootImage tile = board[r][c];
                tile.setColor(defaultColor);
                tile.fill();
                setImage(tile);
            }
        }
    }
}