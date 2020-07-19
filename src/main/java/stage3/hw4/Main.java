package stage3.hw4;

import java.util.Scanner;

public class Main {
    /**
     * Check if two queens can hit each other
     */
    static boolean isHit(int x1, int y1, int x2, int y2) {
        boolean horizontal = y1 == y2;
        boolean vertical = x1 == x2;
        boolean leftDiagonal = x1 - y1 == x2 - y2;
        boolean rightDiagonal = x1 + y1 == x2 + y2;

        return horizontal || vertical || leftDiagonal || rightDiagonal;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        System.out.println(isHit(x1, y1, x2, y2) ? "YES" : "NO");
    }
}
