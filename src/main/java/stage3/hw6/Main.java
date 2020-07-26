package stage3.hw6;

import java.util.Scanner;

/**
 * Print all squares from 1 to the given limit
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int limit = scanner.nextInt();
        int current = 1;

        while (current * current <= limit) {
            System.out.println(current * current);
            current++;
        }
    }
}
