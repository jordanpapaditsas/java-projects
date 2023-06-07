package tic_tac_toe_app;

import java.util.Scanner;

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
            showBoard();

            row = getPlayerMove("Move (row) (0-" + (BOARD_SIZE - 1) +
                    "): " + "Player" + " " + currentPlayer + "\n");
            col = getPlayerMove("Move (column) (0-" + (BOARD_SIZE - 1)
                    + "): " + "Player" + " " + currentPlayer + "\n");

            if (!isValidMove(row, col)) {
                System.out.println("Move not valid. Set a valid move please: ");
                continue;
            }

            makeMove(row, col);

            if (checkIfWin()) {
                showBoard();
                System.out.println("Player " + currentPlayer + " won the game!");
                break;
            }

            if (isBoardFull()) {
                showBoard();
                System.out.println("Draw!");
                break;
            }

            changePlayer();
        }
    }

    public static void setGame() {
        board = new int[BOARD_SIZE][BOARD_SIZE];
        currentPlayer = PLAYER1;
    }

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

    public static int getPlayerMove(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        return scanner.nextInt();
    }

    public static boolean isValidMove(int row, int col) {
        return row >= 0 && row < BOARD_SIZE && col >= 0 && col < BOARD_SIZE && board[row][col] == 0;
    }

    public static void makeMove(int row, int col) {
        board[row][col] = currentPlayer;
    }

    public static void changePlayer() {
        if (currentPlayer == PLAYER1) {
            currentPlayer = PLAYER2;
        } else {
            currentPlayer = PLAYER1;
        }
    }

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
