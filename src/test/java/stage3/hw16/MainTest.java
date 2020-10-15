package stage3.hw16;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    public void testBigValidMatrix() {
        int[][] matrix = {
                {5, 8, 9, 6, 7, 4, 2, 1, 3},
                {7, 4, 3, 1, 8, 2, 9, 5, 6},
                {1, 2, 6, 9, 5, 3, 8, 7, 4},
                {9, 3, 5, 4, 2, 1, 7, 6, 8},
                {4, 1, 2, 8, 6, 7, 3, 9, 5},
                {6, 7, 8, 3, 9, 5, 1, 4, 2},
                {8, 6, 4, 2, 1, 9, 5, 3, 7},
                {3, 9, 7, 5, 4, 8, 6, 2, 1},
                {2, 5, 1, 7, 3, 6, 4, 8, 9},
        };
        assertTrue(Main.checkRows(matrix));
        assertTrue(Main.checkCols(matrix));
        assertTrue(Main.checkSquares(matrix));
    }

    @Test
    void testSmallInvalidMatrix() {
        int[][] matrix = {
                {1, 1, 2, 2},
                {1, 1, 2, 2},
                {3, 3, 4, 4},
                {3, 3, 4, 4},
        };
        assertFalse(Main.checkRows(matrix));
        assertFalse(Main.checkCols(matrix));
        assertFalse(Main.checkSquares(matrix));
    }

    @Test
    void testTinyValidMatrix() {
        int[][] matrix = {{1}};
        assertTrue(Main.checkRows(matrix));
        assertTrue(Main.checkCols(matrix));
        assertTrue(Main.checkSquares(matrix));
    }
}
