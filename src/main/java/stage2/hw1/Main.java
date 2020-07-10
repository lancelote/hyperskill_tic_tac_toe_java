package stage2.hw1;

import java.util.Scanner;

/**
 * Reverse a given number
 */
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        String reverseInput = new StringBuilder(input).reverse().toString();
        int number = Integer.parseInt(reverseInput);
        System.out.println(number);
    }
}

