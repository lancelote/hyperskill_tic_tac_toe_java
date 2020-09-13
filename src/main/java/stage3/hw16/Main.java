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

    public static boolean checkCols(int[][] matrix) {
        assert matrix.length == matrix[0].length;

        int[] expectedCol = IntStream.rangeClosed(1, matrix.length).toArray();

        for (int j = 0; j < matrix.length; j++) {
            int[] col = new int[matrix.length];
            for (int i = 0; i < matrix.length; i++) {
                col[i] = matrix[i][j];
            }
            int[] sortedCol = IntStream.of(col).sorted().toArray();
            if (!Arrays.equals(expectedCol, sortedCol)) {
                return false;
            }
        }

        return true;
    }

    public static boolean checkSquares(int[][] matrix) {
        int squaresNum = (int) Math.sqrt(matrix.length);
        int[] expectedLine = IntStream.rangeClosed(1, matrix.length).toArray();

        for (int iSquare = 0; iSquare < squaresNum; iSquare++) {
            for (int jSquare = 0; jSquare < squaresNum; jSquare++) {
                int[] line = new int[matrix.length];
                for (int i = 0; i < squaresNum; i++) {
                    for (int j = 0; j < squaresNum; j++) {
                        line[squaresNum * i + j] = matrix[squaresNum * iSquare + i][squaresNum * jSquare + j];
                    }
                }
                int[] sortedLine = IntStream.of(line).sorted().toArray();
                if (!Arrays.equals(expectedLine, sortedLine)) {
                    return false;
                }
            }
        }
        return true;
    }

    @SuppressWarnings("unused")
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            String line = Arrays.stream(row).mapToObj(String::valueOf).collect(Collectors.joining(" "));
            System.out.println(line);
        }
    }

    public static void main(String[] args) {
        int[][] matrix = readMatrix();
        if (checkRows(matrix) && checkCols(matrix) && checkSquares(matrix)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
