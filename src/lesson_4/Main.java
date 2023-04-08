package lesson_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        1
        Ввести с клавиатуры два числа m и n.
        Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.

        Пример: m=2, n=4
        8888
        8888
*/
/*
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число m: ");
        int m = scan.nextInt();
        System.out.println("Введите число n: ");
        int n = scan.nextInt();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j <= n; j++) {
                if (j == n ) {
                    System.out.println("");
                } else
                    System.out.print("*");
            }
        }

*/

        /*
        2
        Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.

        Пример вывода на экран:
        8
        88
        888
        8888
        88888
        888888
        8888888
        88888888
        888888888
        8888888888
*/
  /*
        int row = 1;
          for (int i = 0; i < 10; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print("8");
            }
            row++;
              System.out.println("");
        }
*/
        /*
        3

        Ввести с клавиатуры три числа, вывести на экран среднее из них.
                Т.е. не самое большое и не самое маленькое. Если все числа равны, вывести любое из них.

*/

        /*

        // объявляем массив чтобы сложить в него все введеные числа
        int[] m;
        m = new int[3];

        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Введите " + (i + 1) + " число:");
            m[i] = scan.nextInt();
        }

        if (((m[0] > m[1]) && (m[0] < m[2])) || ((m[0] < m[1]) && (m[0] > m[2]))) {
            System.out.println("Среднее число: " + m[0]);

        } else if (((m[1] > m[0]) && (m[0] < m[2])) || ((m[1] < m[0]) && (m[1] > m[2]))) {
            {
                System.out.println("Среднее число: " + m[1]);
            }
        } else {
            System.out.println("Среднее число: " + m[2]);
        }
*/

        /*
        4
        Вывести на экран таблицу умножения 10х10 используя цикл while.
        Числа разделить пробелом.

                Пример вывода на экран:
        1 2 3 4 5 6 7 8 9 10
        2 4 6 8 10 12 14 16 18 20
        3 6 9 12 15 18 21 24 27 30
        4 8 12 16 20 24 28 32 36 40
        5 10 15 20 25 30 35 40 45 50
        6 12 18 24 30 36 42 48 54 60
        7 14 21 28 35 42 49 56 63 70
        8 16 24 32 40 48 56 64 72 80
        9 18 27 36 45 54 63 72 81 90
        10 20 30 40 50 60 70 80 90 100
*/
  /*
        int row = 1;
        while (row < 11) {
            for (int i = 1; i <= 10; i++) {
                System.out.print(" " + row * i);
                if (i == 10) {
                    System.out.println();
                }
            }
            row++;
        }
*/

        /*
        5 Ввести с клавиатуры строку name.
          Ввести с клавиатуры дату рождения (три числа): y, m, d.
          Вывести на экран текст:

        "Меня зовут name.
        Я родился d.m.y"

        Пример вывода:
        Меня зовут Вася.
        Я родился 15.2.1988
*/

        Scanner scan = new Scanner(System.in);

        System.out.print("Введите имя :");
        String name = scan.next();

        System.out.print("Ввести дату рождения (три числа): y, m, d. :");
        String dateFromConsole = scan.next();

        System.out.println("Меня зовут " + name);

        String[] result = dateFromConsole.split("\\.");
        System.out.println("Я родился " + result[2] + "." + result[1] + "." + result[0]);


    }


}

