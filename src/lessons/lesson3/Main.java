package lessons.lesson3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

/*        Задача:
        1 Написать программу, чтобы она:
        - выводила на экран строку "Число меньше 5", если число, которое мы ей подадим меньше 5,
                - выводил строку "Число больше 5", если число, которое мы ей подадим больше 5,
                - выводил строку "Число равно 5", если число, которое мы ей подадим равен 5.

 */
        // орф. ошибка - выводилА
        // закоментил чтобы выполнялся код ниже

        Scanner scan = new Scanner(System.in);
        int fromconsole = scan.nextInt();
        if (fromconsole < 5) {
            System.out.println("Число меньше 5");
        } else if (fromconsole > 5) {
            System.out.println("Число больше 5");
        } else {
            System.out.println("Число равно5 5");
        }

/*
        2 Напиши программу. которая будет проверять попало ли целое число, которое мы ей подадим
        в интервал от 50 до 100 и сообщить результат на экран в следующем виде:
        "Число number не содержится в интервале." или "Число number содержится в интервале.", где number - число, которое мы ей подадим.

                Пример для числа 112:
        Число 112 не содержится в интервале.

        Пример для числа 60:
        Число 60 содержится в интервале.
*/

        Scanner scan1 = new Scanner(System.in);
        int fromconsole1 = scan1.nextInt();
        if (fromconsole1 > 50 && fromconsole1 < 100) {
            System.out.println("Число " + fromconsole1 + " содержится в интервале");
        } else {
            System.out.println("Число " + fromconsole1 + " не содержится в интервале");
        }

/*
        3 Напиши программу, которая по номеру месяца должна
        определить время года (зима, весна, лето, осень) и вывести на экран.

        Пример для номера месяца 2:
        зима

        Пример для номера месяца 5:
        весна
*/
        System.out.println("Введите число месяца");
        Scanner scan2 = new Scanner(System.in);
        int fromconsole2 = scan2.nextInt();
        switch (fromconsole2) {
            case 12, 1, 2:
                System.out.println("Зима");
                break;
            case 3, 4, 5:
                System.out.println("Весна");
                break;
            case 6, 7, 8:
                System.out.println("Лето");
                break;
            case 9, 10, 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Неопределенность!");
        }

/*

        4
        Написать программу, которая будет проверять число, которое мы подадим ей.
                Если число положительное, то увеличить его в два раза.
                Если число отрицательное, то прибавить единицу.
        Если введенное число равно нулю, необходимо вывести ноль.
        Вывести результат в консоль.
*/

        System.out.println("Введите положительное или отрицательное число:");
        Scanner scan3 = new Scanner(System.in);
        int aaa;
        int fromconsole3 = scan3.nextInt();
        if (fromconsole3 > 0) {
            aaa = fromconsole3 * 2;
        } else if (fromconsole3 < 0) {
            aaa = ++fromconsole3;
        } else {
            aaa = 0;
        }
        System.out.println(aaa);

        /*

        6
        Написать программу, которая, в зависимости от того числа, которое мы ей подадим (год)
                , будет определять количество дней в году. Результат вывести на экран в следующем виде:
        количество дней в этом году: x
                , где
        х - 366 для високосного года,
                х - 365 для обычного года.

                Подсказка:
        В високосном году - 366 дней, тогда как в обычном - 365.
        1) если год делится без остатка на 400 это високосный год;
        2) в оставшихся годах после этого, если год делится без остатка на 100, то это обычный год;
        3) в оставшихся годах после этого, если год делится без остатка на 4, то это високосный год;
        4) все оставшиеся года невисокосные.
        Так, годы 1700, 1800 и 1900 не являются високосными, так как они кратны 100 и не кратны 400.
        Годы 1600 и 2000 - високосные, так как они кратны 100 и кратны 400.
        Годы 2100, 2200 и 2300 - не високосные.

*/

        System.out.println("Введите год:");
        Scanner scan4 = new Scanner(System.in);
        int yearFromConsole = scan4.nextInt();

        if ((yearFromConsole % 400 == 0) || ((yearFromConsole % 100 != 0) && (yearFromConsole % 4 == 0))) {
            System.out.println("количество дней в этом году: 366");
        } else {
            System.out.println("количество дней в этом году: 365");
        }

/*
        7
        Объявить три переменных (a, b, c) - стороны предполагаемого треугольника.
        Определить возможность существования треугольника по сторонам.
        Результат вывести на экран в следующем виде:
        "Треугольник существует." - если треугольник с такими сторонами существует.
        "Треугольник не существует." - если треугольник с такими сторонами не существует.

        Подсказка:
        Треугольник существует только тогда, когда сумма двух его сторон больше третьей.
        Требуется сравнить каждую сторону с суммой двух других.
        Если хотя бы в одном случае сторона окажется больше либо равна сумме двух других,
        то треугольника с такими сторонами не существует.
*/

        System.out.println("Введите сторону а треугольника:");
        Scanner scan5 = new Scanner(System.in);
        int a = scan5.nextInt();
        System.out.println("Введите сторону b треугольника:");
        int b = scan5.nextInt();
        System.out.println("Введите сторону c треугольника:");
        int c = scan5.nextInt();

        if ((a + b > c) && (b + c > a) && (c + a > b)) {
            System.out.println("Треугольник существует.");
        } else {
            System.out.println("Треугольник не существует.");
        }
 /*       8
        Работа светофора для пешеходов запрограммирована следующим образом:
        в начале каждого часа в течение 3 минут горит зелёный сигнал,
                затем в течение 1 минуты - жёлтый,
                а потом в течение 1 минуты - красный,
                затем опять зелёный горит три минуты и т. д.
                Подать программе вещественное число t, означающее время в минутах, прошедшее с начала очередного часа.
        Определить, сигнал какого цвета горит для пешеходов в этот момент.
        Результат вывести на экран в следующем виде:
        "зелёный" - если горит зелёный цвет,
                "жёлтый" - если горит жёлтый цвет,
                "красный" - если горит красный цвет.

                Пример для числа 2.5: зелёный;  Пример для числа 3: жёлтый; Пример для числа 4: красный; Пример для числа 5: зелёный*/

        System.out.println("Введите время в минутах, от 0 до 60: (дробная часть через запятую)");
        Scanner scan6 = new Scanner(System.in);
        float time = scan6.nextFloat();
        int timeGreen = 3;
        int timeYellow = 1;
        int timeRed = 1;

        int ab = (int) time % (timeGreen + timeYellow + timeRed);

        if ((ab >= 0) && (a < 3)) {
            System.out.println("зелёный");
        } else if (ab == 3) {
            System.out.println("жёлтый");
        } else {
            System.out.println("красный");
        }
    }
}