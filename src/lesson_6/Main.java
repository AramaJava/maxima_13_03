package lesson_6;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


/* ЗАДАЧА
        1.1. Программа вводит строки, пока пользователь не введёт пустую строку (нажав enter).
             Потом она конвертирует строки в верхний регистр (Мама превращается в МАМА) и выводит их на экран.
*/
        /* РЕШЕНИЕ

        String str ="стартовое не пустое значение";
        Scanner scan = new Scanner(System.in);

        int rows = 0;
        String str0[] = new String[100];

        while (!str.isEmpty()) {
            System.out.println("Введите строку");
            str = scan.nextLine();
            if (!str.isEmpty()) {
                str0[rows]=str;
                rows++;
            }
        }

        for (int i = 0; i < rows ; i++) {
            System.out.println(str0[i].toUpperCase());
        }
*/
/*      ЗАДАЧА
        1.2. Новая задача: Программа вводит строки, пока пользователь не введёт пустую строку (нажав enter).
             Если в строке чётное число букв, строка удваивается, если нечётное - утраивается.
             Программа выводит слова на экран.
*/
        /* РЕШЕНИЕ

        String str1 ="стартовое не пустое значение";
        Scanner scan1 = new Scanner(System.in);
        while (!str1.isEmpty()) {
            System.out.println("Введите строку");
            str1 = scan1.nextLine();
            if (str1.length() % 2 == 0) {
                System.out.println(str1.concat(str1));
            }else {System.out.println(str1.concat(str1).concat(str1));}
        }
*/
        /* ЗАДАЧА
        2. Ввести 5 строк с консоли, найти самую короткую и самую длинную строки. Вывести найденные строки и их длину.
*/
       /* РЕШЕНИЕ

        String[] str2 = new String[5];
        Scanner scan2 = new Scanner(System.in);

        for (int i = 0; i < 5 ; i++) {
            System.out.printf("Введите строку %d:",i+1);

            str2[i] = scan2.nextLine();
        }


        String maxStr = "", minStr = str2[0];

        for (int i = 1; i < str2.length; i++) {
            if (str2[i].length() > maxStr.length()) {
                maxStr = str2[i];
            }
            if (str2[i].length() < minStr.length()) {
                minStr = str2[i];
            }

        }
        System.out.printf("Самое длинное слово %s, c длиной %d", maxStr ,maxStr.length());
        System.out.println();
        System.out.printf("Самое короткое слово %s, c длиной %d", minStr ,minStr.length());

        */



        /* ЗАДАЧА 3
          3.1. Создать массив на 10 строк.
          3.2. Ввести с клавиатуры 8 строк и сохранить их в массив.
          3.3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке. Каждый элемент - с новой строки.
        */
        /* РЕШЕНИЕ

        String[] str3 = new String[10];
        Scanner scan3 = new Scanner(System.in);

        for (int i = 0; i < str3.length - 2; i++) {
            System.out.println("Введите строку");
            str3[i] = scan3.nextLine();
        }
        for (int i = str3.length-1; i >= 0; i--) {
            System.out.println(str3[i]);
        }
*/
        /* ЗАДАЧА 4
            4.1. Создать массив на 10 строк.
            4.2. Создать массив на 10 чисел.
            4.3. Ввести с клавиатуры 10 строк, заполнить ими массив строк.
            4.4. В каждую ячейку массива чисел записать длину строки из массива строк, индекс/номер ячейки
                 которой совпадает с текущим индексом из массива чисел.
*/
        // РЕШЕНИЕ - это повтор задачи - сделал в lesson 5

        /* ЗАДАЧА 5
            5.1. Считать 6 строк и заполнить ими массив strings.
            5.2. Удалить повторяющиеся строки из массива strings, заменив их на null (null должны быть не строками "null").


*/
        /* РЕШЕНИЕ

        String[] str5 = new String[6];
        Scanner scan5 = new Scanner(System.in);

        for (int i = 0; i < str5.length; i++) {
            System.out.printf("Введите строку %d:", i + 1);
            System.out.println("Введите строку");
            str5[i] = scan5.nextLine();
        }

        for (int i = 0; i < str5.length - 1; i++) {
            for (int j = i + 1; j < str5.length; j++)
                if (str5[i] != null && str5[i].equals(str5[j])) {
                    str5[j] = null;
                }
        }

        for (String str6 : str5) {
            System.out.println(str6);

        }
*/
    }


}

