package stage3.hw16;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static int[][] readMatrix() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[][] matrix = new int[n*n][n*n];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        return matrix;
    }

    public static boolean checkRows(int[][] matrix) {
        int[] expectedRow = IntStream.rangeClosed(1, matrix.length).toArray();

        for (int[] row : matrix) {
            int[] sortedRow = IntStream.of(row).sorted().toArray();
            if (!Arrays.equals(expectedRow, sortedRow)) {
                return false;
            }
        }
        return true;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            String line = Arrays.stream(row).mapToObj(String::valueOf).collect(Collectors.joining(" "));
            System.out.println(line);
        }
    }

    public static void main(String[] args) {
        int[][] matrix = readMatrix();
        printMatrix(matrix);
    }
}
