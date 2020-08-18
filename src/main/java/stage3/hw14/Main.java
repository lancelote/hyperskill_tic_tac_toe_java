package stage3.hw14;

import java.util.Scanner;

public class Main {
    public static int findRow(int[][] cinema, int toBuy) {
        int consecutive = 0;

        for (int i = 0; i < cinema.length; i++) {
            for (int item : cinema[i]) {
                if (item == 0) {
                    consecutive += 1;
                    if (consecutive == toBuy) {
                        return i + 1;
                    }
                } else {
                    consecutive = 0;
                }
            }
            consecutive = 0;
        }

        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int seats = scanner.nextInt();

        int[][] cinema = new int[rows][seats];

        for (int row = 0; row < rows; row++) {
            for (int seat = 0; seat < seats; seat++) {
                cinema[row][seat] = scanner.nextInt();
            }
        }

        int toBuy = scanner.nextInt();

        System.out.println(findRow(cinema, toBuy));
    }
}
