package stage3.project;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static String[][] getRows(String[] gameState) {
        String[][] rows = new String[3][3];
        for (int i = 0; i < 3; i++) {
            System.arraycopy(gameState, i * 3, rows[i], 0, 3);
        }
        return rows;
    }

    public static String[][] getCols(String[] gameState) {
        String[][] cols = new String[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                cols[i][j] = gameState[i + 3 * j];
            }
        }
        return cols;
    }

    public static boolean isLineOf(String player, String[][] lines) {
        String[] expectedLine = new String[] {player, player, player};
        for (String[] line : lines) {
            if (Arrays.equals(line, expectedLine)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isRowOf(String player, String[] gameState) {
        return isLineOf(player, getRows(gameState));
    }

    public static boolean isColOf(String player, String[] gameState) {
        return isLineOf(player, getCols(gameState));
    }

    public static boolean isRowOfXs(String[] gameState) {
        return isRowOf("X", gameState);
    }

    public static boolean isRowOfOs(String[] gameState) {
        return isRowOf("O", gameState);
    }

    public static boolean isColOfXs(String[] gameState) {
        return isColOf("X", gameState);
    }

    public static boolean isColOfOs(String[] gameState) {
        return isColOf("O", gameState);
    }

    public static boolean isXWins(String[] gameState) {
        return isRowOfXs(gameState) || isColOfXs(gameState);
    }

    public static boolean isOWins(String[] gameState) {
        return isRowOfOs(gameState) || isColOfOs(gameState);
    }

    public static boolean isDraw(String[] gameState) {
        return !isXWins(gameState) && !isOWins(gameState);
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

    public static String getStatus(String[] gameState) {
        String status = "Unknown game state";

        if (isNotFinished(gameState)) {
            status = "Game not finished";
        } else if (isDraw(gameState)) {
            status = "Draw";
        } else if (isXWins(gameState)) {
            status = "X wins";
        } else if (isOWins(gameState)) {
            status = "O wins";
        } else if (isImpossible(gameState)) {
            status = "Impossible";
        }

        return status;
    }

    public static void main(String[] args) {
        String[] gameState = readGameState();
        printBoard(gameState);  // ToDo: remove before submitting
        String status = getStatus(gameState);
        System.out.println(status);
    }
}
