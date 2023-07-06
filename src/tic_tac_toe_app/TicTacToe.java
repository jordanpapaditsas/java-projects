package tic_tac_toe_app;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Tic-tac-toe is a game for two players who take turns marking the spaces
 * in a three-by-three grid with X or O.
 * The player who succeeds in placing three of their marks in a
 * horizontal, vertical, or diagonal row is the winner.
 *
 */
public class TicTacToe {

    public static int[][] board;
    public static final int BOARD_SIZE = 3;
    public static final int PLAYER1 = 1;
    public static final int PLAYER2 = 2;
    public static int currentPlayer;

    public static void main(String[] args) {
        int row;
        int col;
        setGame();

        while (true) {
            try {

                showBoard();

                // Getting player's move first by row, then by column.
                row = getPlayerMove("Move (row) (0-" + (BOARD_SIZE - 1) +
                        "): " + "Player" + " " + currentPlayer + "\n");
                col = getPlayerMove("Move (column) (0-" + (BOARD_SIZE - 1)
                        + "): " + "Player" + " " + currentPlayer + "\n");

                // Checking if the given move is valid or not.
                if (!isValidMove(row, col)) {
                    System.out.println("Move not valid. Set a valid move please: ");
                    continue;
                }

                makeMove(row, col);

                // Checks with method if the player won the game.
                if (checkIfWin()) {
                    showBoard();
                    System.out.println("Player " + currentPlayer + " won the game!");
                    break;
                }

                // Checks if the board is full, if the board is full then the game is a tie.
                if (isBoardFull()) {
                    showBoard();
                    System.out.println("Draw!");
                    break;
                }

                changePlayer();
            } catch (Exception e) {
                System.out.println("An error occurred: " + e.getMessage());
            }
        }
    }

    public static void setGame() {
        board = new int[BOARD_SIZE][BOARD_SIZE];
        currentPlayer = PLAYER1;
    }

    // Shows board and set Players symbols.
    public static void showBoard() {
        System.out.println();
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                char symbol = ' ';
                if (board[i][j] == PLAYER1) {
                    symbol = 'X';
                } else if (board[i][j] == PLAYER2) {
                    symbol = 'O';
                }
                System.out.print("| " + symbol + " ");
            }

            System.out.println("|");
            System.out.println("-------------");
        }
    }

    // Reads players move.
    public static int getPlayerMove(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        try {

            return scanner.nextInt();

        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid number for move to proceed...");
            scanner.nextLine();
            return getPlayerMove(message);
        }
    }

    // Method for move validation.
    public static boolean isValidMove(int row, int col) {
        return row >= 0 && row < BOARD_SIZE && col >= 0 && col < BOARD_SIZE && board[row][col] == 0;
    }

    // Allows player to make a move by choosing row and column.
    public static void makeMove(int row, int col) {
        board[row][col] = currentPlayer;
    }

    // Checks which player is playing currently.
    public static void changePlayer() {
        if (currentPlayer == PLAYER1) {
            currentPlayer = PLAYER2;
        } else {
            currentPlayer = PLAYER1;
        }
    }

    // Method for searching and checking if the board is full and players out of moves.
    public static boolean isBoardFull() {
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                if (board[i][j] == 0) {
                    return false;
                }
            }
        }
        return true;
    }


    // Iterates each combination to check if a player won by making a 3 line combo.
    public static boolean checkIfWin() {
        for (int i = 0; i < BOARD_SIZE; i++) {
            if (board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer) {
                return true;
            }
        }

        for (int i = 0; i < BOARD_SIZE; i++) {
            if (board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer) {
                return true;
            }
        }

        if (board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) {
            return true;
        }

        return board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer;
    }
}
