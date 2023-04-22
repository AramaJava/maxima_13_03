package lesson_9;


import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    Scanner scan;
    char[][] table;
    Random random;

    public TicTacToe() {
        scan = new Scanner(System.in);
        random = new Random();
        table = new char[5][5];

    }

    public void playGame() {
        System.out.println("Игра стартовала!");
        initTable();
        printTable();
        while (true) {
            turnHuman();
            if (checkWin('x', 4)) {
                printTable();
                System.out.println("Вы победили!");
                break;
            }


            if (isTableFull()) {
                System.out.println("Ничья");
                break;

            }

            turnAI();
            printTable();

            if (checkWin('o',4)) {
                printTable();
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
                table[x][y] = 'o';
                break;
            }
        }
    }

    public boolean checkWin(char symbol, int winCount ) {
        // проверка по гориз
        for (int x = 0; x < (table.length-winCount + 1); x++) {
            for (int y = 0; y < winCount; y++) {
                if (table[x][y] == '.') return false;
            }
        }

        return false;


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
        for (int x = 0; x < table.length; x++) {
            for (int y = 0; y < table[x].length; y++) {
                if (table[x][y] == '.') return false;
            }
        }
        return true;
    }

    public void turnHuman() {
        int x, y;

        while (true) {
            System.out.println("Введите х и y [0..4]");
            x = scan.nextInt();
            y = scan.nextInt();
            if (isTurnValid(x, y)) {
                table[x][y] = 'x';
                break;
            }

        }
    }


    public boolean isTurnValid(int x, int y) {
        if (x < 0 || x > 4 || y < 0 || y > 4) {
            return false;
        }
        return table[x][y] == '.';
    }

    private void printTable() {
        System.out.println("    0  1  2  3  4  Y");
        System.out.println("   ______________");
        for (int y = 0; y < table.length; y++) {
            System.out.printf("%d | ", y);
            for (int x = 0; x < table[y].length; x++) {
                System.out.print(table[y][x] + "  ");
            }
            System.out.println();
        }
        System.out.println("X");
    }

    public void initTable() {
        for (int x = 0; x < table.length; x++) {
            for (int y = 0; y < table[x].length; y++) {
                table[x][y] = '.';
            }
        }
    }
}


