package stage3.project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    void testXWinsHorizontally() {
        String[] gameState = {"X", "X", "X", "O", "O", "_", "_", "O", "_"};
        assertEquals("X wins", Main.getStatus(gameState));
    }

    @Test
    void testXWinsRightDiagonal() {
        String[] gameState = {"X", "O", "X", "O", "X", "O", "X", "X", "O"};
        assertEquals("X wins", Main.getStatus(gameState));
    }

    @Test
    void testOWinsVertically() {
        String[] gameState = {"X", "O", "O", "O", "X", "O", "X", "X", "O"};
        assertEquals("O wins", Main.getStatus(gameState));
    }

    @Test
    void testDraw() {
        String[] gameState = {"X", "O", "X", "O", "O", "X", "X", "X", "O"};
        assertEquals("Draw", Main.getStatus(gameState));
    }

    @Test
    void testNotFinished() {
        String[] gameState = {"X", "O", "_", "O", "O", "X", "_", "X", "_"};
        assertEquals("Game not finished", Main.getStatus(gameState));
    }

    @Test
    void testImpossibleTwoWinners() {
        String[] gameState = {"X", "O", "_", "X", "O", "_", "X", "O", "X"};
        assertEquals("Impossible", Main.getStatus(gameState));
    }

    @Test
    void testImpossibleTooManyXs() {
        String[] gameState = {"_", "O", "_", "X", "_", "_", "X", "_", "X"};
        assertEquals("Impossible", Main.getStatus(gameState));
    }

    @Test
    void testImpossibleTooManyOs() {
        String[] gameState = {"_", "O", "O", "O", "O", "_", "X", "_", "X"};
        assertEquals("Impossible", Main.getStatus(gameState));
    }
}
