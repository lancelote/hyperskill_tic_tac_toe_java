package stage3.project;

import java.util.Arrays;
import java.util.Scanner;

// ToDo: add tests
public class Main {
    public static String[][] getRows(String[] gameState) {
        String[][] rows = new String[3][3];
        for (int i = 0; i < 3; i++) {
            System.arraycopy(gameState, i * 3, rows[i], 0, 3);
        }
        return rows;
    }

    public static boolean isRowOf(String player, String[] gameState) {
        String[] expectedRow = new String[] {player, player, player};
        for (String[] row : getRows(gameState)) {
            if (Arrays.equals(row, expectedRow)) {
                return true;
            }
        }
        return false;
    }

    public static boolean rowOfXs(String[] gameState) {
        return isRowOf("X", gameState);
    }

    public static boolean rowOfOs(String[] gameState) {
        return isRowOf("O", gameState);
    }

    // ToDo: reimplement using the same API as rows
    public static boolean colOf(String player, String[] gameState) {
        String[] expectedCol = new String[] {player, player, player};
        for (int i = 0; i < 3; i++) {
            String[] col = new String[3];
            for (int j = 0; j < 3; j++) {
                col[j] = gameState[i + 3 * j];
            }
            if (Arrays.equals(col, expectedCol)) {
                return true;
            }
        }
        return false;
    }

    public static boolean colOfXs(String[] gameState) {
        return colOf("X", gameState);
    }

    public static boolean colOfOs(String[] gameState) {
        return colOf("O", gameState);
    }

    public static boolean isXWins(String[] gameState) {
        return rowOfXs(gameState) || colOfXs(gameState);
    }

    public static boolean isOWins(String[] gameState) {
        return rowOfOs(gameState) || colOfOs(gameState);
    }

    public static boolean isDraw(String[] gameState) {
        // ToDo: finish using isXWins and isOWinds
        return true;
    }

    public static boolean isNotFinished(String[] gameState) {
        return !isXWins(gameState) && !isOWins(gameState) && !isDraw(gameState);
    }

    public static boolean isImpossible(String[] gameState) {
        return isXWins(gameState) && isOWins(gameState);
    }

    public static String[] readGameState() {
        System.out.print("Enter cells: ");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        return line.strip().split("");
    }

    public static void printBoard(String[] gameState) {
        System.out.println("---------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.printf("%s ", gameState[3 * i + j]);
            }
            System.out.println("|");
        }
        System.out.println("---------");
    }

    public static void printState(String[] gameState) {
        if (isNotFinished(gameState)) {
            System.out.println("Game not finished");
        } else if (isDraw(gameState)) {
            System.out.println("Draw");
        } else if (isXWins(gameState)) {
            System.out.println("X wins");
        } else if (isOWins(gameState)) {
            System.out.println("O wins");
        } else if (isImpossible(gameState)) {
            System.out.println("Impossible");
        } else {
            System.out.println("Unknown game state");
        }
    }

    public static void main(String[] args) {
        String[] gameState = readGameState();
        printBoard(gameState);
        printState(gameState);
    }
}
