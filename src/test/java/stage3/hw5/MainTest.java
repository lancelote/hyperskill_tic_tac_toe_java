package stage3.hw5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    public void testPack() {
        assertEquals(Main.classify(5), "pack");
    }

    @Test
    public void testZounds() {
        assertEquals(Main.classify(303), "zounds");
    }

    @Test
    public void testBorder() {
        assertEquals(Main.classify(20), "throng");
    }
}
