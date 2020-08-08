package stage3.hw9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int prev = scanner.nextInt();
        int current = scanner.nextInt();

        boolean ascending = false;
        boolean descending = false;

        while (current != 0) {
            // Check ordering direction
            if (!ascending && !descending) {
                if (prev > current) {
                    descending = true;
                } else if (prev < current) {
                    ascending = true;
                }
            }

            // Make sure ordering is not broken
            if (ascending && prev > current || descending && prev < current) {
                System.out.println(false);
                return;
            }

            prev = current;
            current = scanner.nextInt();
        }

        System.out.println(true);
    }
}
