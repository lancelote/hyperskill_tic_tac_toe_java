package stage3.hw5;

import java.util.Scanner;

/**
 * Describe a given number of soldiers
 */
public class Main {
    public static String classify(int number) {
        if (number < 1) {
            return "no army";
        } else if (number < 20) {
            return "pack";
        } else if (number < 250) {
            return "throng";
        } else if (number < 1000) {
            return "zounds";
        } else {
            return "legion";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(classify(number));
    }
}
