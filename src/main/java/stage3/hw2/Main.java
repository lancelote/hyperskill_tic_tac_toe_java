package stage3.hw2;

import java.util.Scanner;

public class Main {
    /**
     * Check if only one number is positive
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        boolean onlyA = a > 0 && b <= 0 && c <= 0;
        boolean onlyB = b > 0 && a <= 0 && c <= 0;
        boolean onlyC = c > 0 && a <= 0 && b <= 0;

        System.out.println(onlyA || onlyB || onlyC);
    }
}
