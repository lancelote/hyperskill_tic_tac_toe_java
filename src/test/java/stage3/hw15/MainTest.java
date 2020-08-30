package stage3.hw15;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    public void test_3_by_3_matrix() {
        int[][] matrix = {
                {9, 5, 3},
                {0, 7, -1},
                {-5, 2, 9},
        };
        int[][] expected = {
                {3, 21, 22},
                {10, 6, 19},
                {20, 16, -1},
        };
        assertArrayEquals(Main.sumNeighbors(matrix), expected);
    }

    @Test
    public void test_1_by_1_matrix() {
        int[][] matrix = {{1}};
        int[][] expected = {{4}};
        assertArrayEquals(Main.sumNeighbors(matrix), expected);
    }
}
