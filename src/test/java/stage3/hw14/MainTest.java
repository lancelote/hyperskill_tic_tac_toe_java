package stage3.hw14;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    public void success() {
        int[][] cinema = {
                {0, 1, 0, 1},
                {1, 1, 0, 1},
                {1, 0, 0, 1}
        };
        assertEquals(Main.findRow(cinema, 2), 3);
    }

    @Test
    public void failure() {
        int[][] cinema = {
                {0, 1, 0},
                {1, 0, 0},
                {1, 1, 1}
        };
        assertEquals(Main.findRow(cinema, 3), 0);
    }

    @Test
    public void nextRow() {
        int[][] cinema = {
                {1, 0, 0},
                {0, 1, 1},
                {1, 1, 1}
        };
        assertEquals(Main.findRow(cinema, 3), 0);
    }
}
