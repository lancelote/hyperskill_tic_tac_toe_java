package stage3.hw15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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

        // Convert to a better data structure
        int[][] matrix = new int[rawData.size()][];
        matrix = rawData.toArray(matrix);

        // Construct new matrix
    }
}
