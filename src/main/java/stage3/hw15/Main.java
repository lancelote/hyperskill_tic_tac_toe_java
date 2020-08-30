package stage3.hw15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static int[][] sumNeighbors(int[][] matrix) {
        return matrix;
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
        printMatrix(sumNeighbors(readMatrix()));
    }
}
