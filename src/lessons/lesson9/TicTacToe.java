package lessons.lesson9;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    private static char[][] board;
    private static int boardSize = 4;
    private static int winCount = 3;
    private Scanner scan;
    private Random random;

    public TicTacToe() {
        scan = new Scanner(System.in);
        random = new Random();
        board = new char[boardSize + 1][boardSize + 1];
    }

    public static void initializeBoard() {
        // цикл по строкам
        for (int i = 1; i < boardSize + 1; i++) {
            // цикл по столбцам
            for (int j = 1; j < boardSize + 1; j++) {
                board[i][j] = '.';
            }
        }
    }

    public void printBoard() {
        System.out.println(" ------------------>X");

        for (int i = 1; i < boardSize + 1; i++) {
            System.out.print("| ");
            for (int j = 1; j < boardSize + 1; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println(" --------------------");
        }
        System.out.println("Y");
    }

    public void playGame() {
        System.out.println("Игра стартовала!");
        initializeBoard();
        printBoard();
        while (true) {
            turnHuman();
            if (checkWin('x', winCount)) {
                printBoard();
                System.out.println("Вы победили!");
                break;
            }

            if (isTableFull()) {
                System.out.println("Ничья");
                break;

            }

            turnAI();
            printBoard();

            if (checkWin('o', winCount)) {
                printBoard();
                System.out.println("Компьютер выиграл!");
                break;
            }

        }
    }

    public void turnHuman() {
        int x, y;

        while (true) {
            System.out.println("Введите х и y :");
            y = scan.nextInt();
            x = scan.nextInt();
            if (isTurnValid(x, y, '.')) {
                board[x][y] = 'x';
                break;
            } else {
                System.out.println("Неверный ход!");
            }

        }
    }

    public void turnAI() {
        int x, y;

        while (true) {
            x = random.nextInt(1, 5);
            y = random.nextInt(1, 5);
            if (isTurnValid(x, y, '.')) {
                board[x][y] = 'o';
                break;
            }
        }
    }

    public boolean isTableFull() {
        for (int x = 0; x < boardSize; x++) {
            for (int y = 0; y < board[x].length; y++) {
                if (board[x][y] == '.') {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean checkRowsForWin(char symbol, int winCount) {
        int inRow = 0;
        for (int y = 1; y < boardSize + 1; y++) {
            for (int x = 1; x < boardSize + 1; x++) {
                if (board[y][x] == symbol) {
                    inRow++;
                    if (inRow >= winCount) {
                        return true;
                    }
                } else {
                    inRow = 0;
                }
            }
        }
        return false;
    }

    public boolean checkColumnsForWin(char symbol, int winCount) {
        int inCol = 0;
        for (int y = 1; y < boardSize + 1; y++) {
            for (int x = 1; x < boardSize + 1; x++) {
                if (board[x][y] == symbol) {
                    inCol++;
                    if (inCol >= winCount) {
                        return true;
                    }
                } else {
                    inCol = 0;
                }
            }
        }
        return false;
    }

    public boolean checkDiagonalsForWin(char symbol) {

        for (int i = 1; i < boardSize + 1; i++) {
            for (int j = 1; j < boardSize + 1; j++) {
                if (checkDiagonalForWin(symbol, i, j) || checkOtherDiagonalForWin(symbol, i, j)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean checkDiagonalForWin(char c, int row, int col) {
        for (int inRow = 1; row  < boardSize + 1 && col < boardSize + 1; row++, col++) {
            //Check all the rows for a winner
            if (board[row][col] == c) {
                inRow++;
                if (inRow > winCount) {
                    return true;
                }
            } else {
                inRow = 0;
            }
        }
        return false;
    }

    public boolean checkOtherDiagonalForWin(char c, int row, int col) {
        for (int inRow = 1; row  < boardSize && col >= 0; row++, col--) {
            //Check all the rows for a winner
            if (board[row][col] == c) {
                inRow++;
                if (inRow > winCount) {
                    return true;
                }
            } else {
                inRow = 0;
            }
        }
        return false;
    }

    public boolean checkWin(char symbol, int winCount) {
        return checkRowsForWin(symbol, winCount) || checkColumnsForWin(symbol, winCount)
                || checkDiagonalsForWin(symbol);

    }

    public boolean isTurnValid(int x, int y, char symbol) {

        if (x < 1 || x > boardSize || y < 1 || y > boardSize
                || (board[x][y] != (int) symbol)) {
            return false;
        }
        return board[x][y] == '.';
    }

}


