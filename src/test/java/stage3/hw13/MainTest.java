package stage3.hw13;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    public void singleDigitShift() {
        assertArrayEquals(Main.rotate("1 2 3 4 5".split(" "), 1), "5 1 2 3 4".split(" "));
    }

    @Test
    public void twoDigitShift() {
        assertArrayEquals(Main.rotate("1 2 3 4 5".split(" "), 2), "4 5 1 2 3".split(" "));
    }

    @Test
    public void shiftBiggerThanLength() {
        assertArrayEquals(Main.rotate("1 2 3 4 5".split(" "), 8), "3 4 5 1 2".split(" "));
    }

    @Test
    public void veryBigShift() {
        assertArrayEquals(Main.rotate("11 21 1 41 51 78 90".split(" "), 10_000), "41 51 78 90 11 21 1".split(" "));
    }
}
