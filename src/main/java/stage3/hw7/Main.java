package stage3.hw7;

import java.util.Scanner;

public class Main {
    public static long biggestNumber(long limit) {
        int current = 1;
        long result = 1;
        while (result * current <= limit) {
            result *= current;
            current += 1;
        }
        return current;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long m = scanner.nextLong();
        System.out.println(biggestNumber(m));
    }
}
