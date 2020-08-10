package stage3.hw11;

import java.util.Scanner;

public class Main {
    public static int firstMaxIndex(int[] array) {
        assert array.length > 0;

        int maxElement = array[0];
        int maxIndex = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxElement) {
                maxElement = array[i];
                maxIndex = i;
            }
        }

        return maxIndex;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] array = new int[length];

        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println(firstMaxIndex(array));
    }
}
