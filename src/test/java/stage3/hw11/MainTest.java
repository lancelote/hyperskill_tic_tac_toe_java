package stage3.hw11;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    public void secondBiggest() {
        assertEquals(Main.firstMaxIndex(new int[] {2, 5, 3, 4, 5}), 1);
    }

    @Test
    public void lastBiggest() {
        assertEquals(Main.firstMaxIndex(new int[] {1000, 10, 1000, 10, 10, 1001}), 5);
    }
}
