package stage3.hw12;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    public void twoElements() {
        assertEquals(Main.maxProduct(new int[] {5, 3}), 15);
    }

    @Test
    public void threeElements() {
        assertEquals(Main.maxProduct(new int[] {10, 8, 4}), 80);
    }
}
