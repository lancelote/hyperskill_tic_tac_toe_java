package stage3.hw4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    public void testRightDiagonal() {
        assertTrue(Main.isHit(1, 1, 3, 3));
    }

    @Test
    public void testNoHit() {
        assertFalse(Main.isHit(1, 1, 4, 3));
    }

    @Test
    public void testHorizontalHit() {
        assertTrue(Main.isHit(2, 2, 5, 2));
    }
}
