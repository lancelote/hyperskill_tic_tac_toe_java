package stage3.hw13;

import java.util.Scanner;

public class Main {
    public static String[] rotate(String[] array, int shift) {
        String[] rotated = new String[array.length];

        for (int i = 0; i < array.length; i++) {
            rotated[(i + shift) % array.length] = array[i];
        }

        return rotated;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] array = scanner.nextLine().split(" ");
        int shift = scanner.nextInt();

        String[] rotated = rotate(array, shift);
        System.out.println(String.join(" ", rotated));
    }
}
