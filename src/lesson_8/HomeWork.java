package lesson_8;

import java.util.Scanner;

public class HomeWork {


    /* Задача 1. Напишите метод, с помощью которого можно было бы возводить число, переданное в сигнатуру метода, в куб.
     */
    public static int exp3(int num) {
        return num * num * num;
    }

    /* Задача 2
       Напишите метод, который бы возвращал в консоль:
       true, если число больше 5
       и false, если число меньше 5
*/
    public static boolean isNumberGreater5(int num) {
        return num > 5;
    }

    /* Задача 3
3    Необходимо написать метод, который бы возвращал из 2 чисел меньшее число. Например, из двух чисел 7 и 3 метод должен вывести в консоль 3.
    */
    public static int lesserNum(int x, int y) {
        return Math.min(x, y);
    }

    /* Задача 4
       Необходимо написать метод, который бы возводил число в квадрат.
       И далее два числа, возведенные в квадрат, должны быть просуммированы, а результат выведены в консоль.
*/
    public static int numSquare(int num) {
        return num * num;
    }

    public static void SuperOperation(int x, int y) {
        int result = numSquare(x) + numSquare(y);
        System.out.println(result);
    }

    /* Задача 5
5   Условие задачи:
    Необходимо написать простой консольный калькулятор на Java.

    Метод int getInt() - должен считывать с консоли целое число и возвращать его
    Метод char getOperation() - должен считывать с консоли какое-то значение и возвращать символ с операцией (+, -, * или /)
    Метод int calc(int num1, int num2, char operation) - должен выполнять над числами num1 и num2 арифметическую операцию, заданную operation.
    Метод main() - должен считывать 2 числа (с помощью getInt()), считать операцию (с помощью getOperation(), передать все методу calc() и вывести на экран результат.

*/
    public static int getInt() {
        System.out.print("Введите число: ");
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }

    public static char getOperation() {
        System.out.print("Введите оператор: +, -, *, or / : ");
        Scanner scan = new Scanner(System.in);
        return scan.next().charAt(0);

    }

    public static void calc(int num1, int num2, char operation) {
        double res = 0;
        switch (operation) {
            case '*' -> res = num1 * num2;
            case '+' -> res = num1 + num2;
            case '-' -> res = num1 - num2;
            case '/' -> res = (double) num1 / num2;
            default -> System.out.println("Не понятная операция!");
        }
        System.out.printf("Результат операции: %f", res);
    }

}

