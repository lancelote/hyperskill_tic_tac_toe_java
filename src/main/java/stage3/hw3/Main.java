package stage3.hw3;

import java.util.Scanner;

public class Main {
    /**
     * Check if the number if symmetrical
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        String number = String.format("%04d", input);
        assert number.length() == 4;

        if (number.charAt(0) == number.charAt(3) && number.charAt(1) == number.charAt(2)) {
            System.out.println(1);
        } else {
            System.out.println(42);
        }
    }
}
