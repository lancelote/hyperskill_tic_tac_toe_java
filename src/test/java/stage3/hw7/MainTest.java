package stage3.hw7;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    public void bigNumber() {
        assertEquals(Main.biggestNumber(6188989133L), 13);
    }

    @Test
    public void smallNumber() {
        assertEquals(Main.biggestNumber(6), 4);
    }
}
