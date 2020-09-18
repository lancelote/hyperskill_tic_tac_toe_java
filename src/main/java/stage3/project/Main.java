package stage3.project;

import java.util.Scanner;

public class Main {
    public static boolean isNotFinished(String[] gameState) {
        return true;
    }

    public static boolean isDraw(String[] gameState) {
        return true;
    }

    public static boolean isXWins(String[] gameState) {
        return true;
    }

    public static boolean isOWins(String[] gameState) {
        return true;
    }

    public static boolean isImpossible(String[] gameState) {
        return true;
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
