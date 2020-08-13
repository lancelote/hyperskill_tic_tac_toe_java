package stage3.hw12;

import java.util.Scanner;

public class Main {
    public static int maxProduct(int[] numbers) {
        assert numbers.length > 1;

        int biggestProduct = numbers[0] * numbers[1];

        for (int i = 2; i < numbers.length; i++) {
            int product = numbers[i - 1] * numbers[i];
            if (product > biggestProduct) {
                biggestProduct = product;
            }
        }

        return biggestProduct;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int[] numbers = new int[len];

        for (int i = 0; i < len; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println(maxProduct(numbers));
    }
}
