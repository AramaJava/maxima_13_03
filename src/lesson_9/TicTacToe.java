package lesson_9;
import java.util.Random;
import java.util.Scanner;
public class TicTacToe {

    static char[][] board;
    public static int boardSize = 5;
    public static int winCount = 4;
    Scanner scan;
    Random random;


    public TicTacToe() {
        scan = new Scanner(System.in);
        random = new Random();
        board = new char[boardSize][boardSize];
    }



    public static void initializeBoard() {
        // цикл по строкам
        for (int i = 0; i < boardSize; i++) {
            // цикл по столбцам
            for (int j = 0; j < boardSize; j++) {
                board[i][j] = '.';
            }
        }
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

            if (checkWin('o',winCount)) {
                printBoard();
                System.out.println("Компьютер выиграл!");
                break;
            }

        }
    }

    public void turnAI() {
        int x, y;

        while (true) {
            x = random.nextInt(0, 4);
            y = random.nextInt(0, 4);
            if (isTurnValid(x, y)) {
                board[x][y] = 'o';
                break;
            }
        }
    }


    public boolean checkRowsForWin(char symbol, int winCount) {
        return false;
    }
    public boolean checkColumnsForWin(char symbol, int winCount) {
        return false;
    }
    public boolean checkDiagonalsForWin(char symbol, int winCount) {
        return false;
    }
    public boolean checkWin(char symbol, int winCount ) {
      return checkRowsForWin(symbol, winCount) || checkColumnsForWin(symbol, winCount) || checkDiagonalsForWin(symbol, winCount);
                /*
//-- проверка по гориз

        if (table[0][0] == symbol && table[0][1] == symbol && table[0][2] == symbol && table[0][3] == symbol)
            return true;
        if (table[0][1] == symbol && table[0][2] == symbol && table[0][3] == symbol && table[0][4] == symbol)
            return true;
        if (table[1][0] == symbol && table[1][1] == symbol && table[1][2] == symbol && table[1][3] == symbol)
            return true;
        if (table[1][1] == symbol && table[1][2] == symbol && table[1][3] == symbol && table[1][4] == symbol)
            return true;
        if (table[2][0] == symbol && table[2][1] == symbol && table[2][2] == symbol && table[2][3] == symbol)
            return true;
        if (table[2][1] == symbol && table[2][2] == symbol && table[2][3] == symbol && table[2][4] == symbol)
            return true;
        if (table[3][0] == symbol && table[3][1] == symbol && table[3][2] == symbol && table[3][3] == symbol)
            return true;
        if (table[3][1] == symbol && table[3][2] == symbol && table[3][3] == symbol && table[3][4] == symbol)
            return true;
        if (table[4][0] == symbol && table[4][1] == symbol && table[4][2] == symbol && table[4][3] == symbol)
            return true;
        if (table[4][1] == symbol && table[4][2] == symbol && table[4][3] == symbol && table[4][4] == symbol)
            return true;
//-- проверка по верт
        if (table[0][0] == symbol && table[1][0] == symbol && table[2][0] == symbol && table[3][0] == symbol)
            return true;
        if (table[1][0] == symbol && table[2][0] == symbol && table[3][0] == symbol && table[4][0] == symbol)
            return true;

        if (table[0][1] == symbol && table[1][1] == symbol && table[2][1] == symbol && table[3][1] == symbol)
            return true;
        if (table[1][1] == symbol && table[2][1] == symbol && table[3][1] == symbol && table[4][1] == symbol)
            return true;

        if (table[0][2] == symbol && table[1][2] == symbol && table[2][2] == symbol && table[3][2] == symbol)
            return true;
        if (table[1][2] == symbol && table[2][2] == symbol && table[3][2] == symbol && table[4][2] == symbol)
            return true;

        if (table[0][3] == symbol && table[1][3] == symbol && table[2][3] == symbol && table[3][3] == symbol)
            return true;
        if (table[1][3] == symbol && table[2][3] == symbol && table[3][3] == symbol && table[4][3] == symbol)
            return true;

        if (table[0][4] == symbol && table[1][4] == symbol && table[2][4] == symbol && table[3][4] == symbol)
            return true;
        if (table[1][4] == symbol && table[2][4] == symbol && table[3][4] == symbol && table[4][4] == symbol)
            return true;
        //-- проверка по диаг
        if (table[0][0] == symbol && table[1][1] == symbol && table[2][2] == symbol && table[3][3] == symbol)
            return true;
        if (table[1][1] == symbol && table[2][2] == symbol && table[3][3] == symbol && table[4][4] == symbol)
            return true;

        if (table[0][1] == symbol && table[1][2] == symbol && table[2][3] == symbol && table[3][4] == symbol)
            return true;
        if (table[1][0] == symbol && table[2][1] == symbol && table[3][2] == symbol && table[4][3] == symbol)
            return true;

        if (table[3][0] == symbol && table[2][1] == symbol && table[1][2] == symbol && table[0][3] == symbol)
            return true;
        if (table[4][1] == symbol && table[3][2] == symbol && table[2][3] == symbol && table[1][4] == symbol)
            return true;

        if (table[4][0] == symbol && table[3][1] == symbol && table[2][2] == symbol && table[1][3] == symbol)
            return true;
        if (table[3][1] == symbol && table[2][2] == symbol && table[1][3] == symbol && table[0][4] == symbol)
            return true;
        return false;
    }
*/
    }
    public boolean isTableFull() {
        for (int x = 0; x < boardSize; x++) {
            for (int y = 0; y < board[x].length; y++) {
                if (board[x][y] == '.') return false;
            }
        }
        return true;
    }

    public void turnHuman() {
        int x, y;

        while (true) {
            System.out.println("Введите х и y :");
            x = scan.nextInt();
            y = scan.nextInt();
            if (isTurnValid(x, y)) {
                board[x][y] = 'x';
                break;
            }

        }
    }


    public boolean isTurnValid(int x, int y) {
        if (x < 0 || x > boardSize-1 || y < 0 || y > boardSize-1) {
            return false;
        }
        return board[x][y] == '.';
    }


    public void printBoard() {
        System.out.println(" --------------------");

        for (int i = 0; i < boardSize; i++) {
            System.out.print("| ");
            for (int j = 0; j < boardSize; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println(" --------------------");
        }
    }

}


