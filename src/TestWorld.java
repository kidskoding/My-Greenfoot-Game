import greenfoot.*;

public class TestWorld extends World {
    public TestWorld() {
        super(1200, 700, 1);
        Board b = new Board();
        addObject(b, 100, 100);
    }
}
