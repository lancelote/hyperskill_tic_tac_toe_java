package stage3.project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    void testXWinsHorizontally() {
        String[] matrix = {"X", "X", "X", "O", "O", "_", "_", "O", "_"};
        assertEquals(Main.getStatus(matrix), "X wins");
    }

    @Test
    void testXWinsRightDiagonal() {
        String[] matrix = {"X", "O", "X", "O", "X", "O", "X", "X", "O"};
        assertEquals(Main.getStatus(matrix), "X wins");
    }

    @Test
    void testOWinsVertically() {
        String[] matrix = {"X", "O", "O", "O", "X", "O", "X", "X", "O"};
        assertEquals(Main.getStatus(matrix), "O wins");
    }

    @Test
    void testDraw() {
        String[] matrix = {"X", "O", "X", "O", "O", "X", "X", "X", "O"};
        assertEquals(Main.getStatus(matrix), "Draw");
    }

    @Test
    void testNotFinished() {
        String[] matrix = {"X", "O", "_", "O", "O", "X", "_", "X", "_"};
        assertEquals(Main.getStatus(matrix), "Game not finished");
    }
}

// ToDo: add more tests
