package stage3.hw8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int limit = scanner.nextInt();

        for (int i = 1;; i++) {
            for (int j = 0; j < i; j++) {
                if (limit == 0) {
                    return;
                }
                System.out.printf("%s ", i);
                limit--;
            }
        }
    }
}
