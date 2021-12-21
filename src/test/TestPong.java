
import main.Sprite;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPong {
    @Test
    void testxBoundaries() {
        Sprite sprite = new Sprite();
        testxBoundary(sprite, -1, 600, 0);
        testxBoundary(sprite, 0, 600, 0);
        testxBoundary(sprite, 500, 600, 500);
        testxBoundary(sprite, 600, 600, 600);
        testxBoundary(sprite, 700, 600, 600);
    }

    private void testxBoundary(Sprite sprite, int newX, int panelWidth, int expectedX) {
        sprite.setXPosition(newX, panelWidth);
        int resultantX = sprite.getXPosition();
        assertEquals(resultantX, expectedX);
    }

    @Test
    void testyBoundaries() {
        Sprite sprite = new Sprite();
        testyBoundary(sprite, -1, 400, 0);
        testyBoundary(sprite, 0, 400, 0);
        testyBoundary(sprite, 300, 400, 300);
        testyBoundary(sprite, 400, 400, 400);
        testyBoundary(sprite, 700, 400, 400);
    }

    private void testyBoundary(Sprite sprite, int newY, int panelHeight, int expectedY) {
        sprite.setYPosition(newY, panelHeight);
        int resultantY = sprite.getYPosition();
        assertEquals(resultantY, expectedY);
    }
}
