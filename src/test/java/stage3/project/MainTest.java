package stage3.project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    void testXWinsHorizontally() {
        String[] matrix = {"X", "X", "X", "O", "O", "_", "_", "O", "_"};
        assertEquals(Main.getStatus(matrix), "X wins");
    }
}

// ToDo: add more tests
