package stage3.hw15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static int[][] sumNeighbors(int[][] matrix) {
        int[][] result = new int[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int top = 0;
                int right = 0;
                int bottom = 0;
                int left = 0;

                result[i][j] = top + right + bottom + left;
            }
        }

        return result;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            String line = Arrays.stream(row).mapToObj(String::valueOf).collect(Collectors.joining(" "));
            System.out.println(line);
        }
    }

    public static int[][] readMatrix() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<int[]> rawData = new ArrayList<>();

        // Read matrix
        while (true) {
            String line = scanner.nextLine();
            if (line.equals("end")) {
                break;
            }
            int[] row = Arrays.stream(line.strip().split(" ")).mapToInt(Integer::parseInt).toArray();
            rawData.add(row);
        }

        // Convert to a faster data structure
        int[][] matrix = new int[rawData.size()][];
        matrix = rawData.toArray(matrix);
        return matrix;
    }

    public static void main(String[] args) {
        int[][] matrix = readMatrix();
        int[][] result = sumNeighbors(matrix);
        printMatrix(result);
    }
}
