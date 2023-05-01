package lesson_13.homework;

import java.util.ArrayList;
import java.util.Scanner;

public class task7 {
    private static void  printList (ArrayList<Integer> list) {
        System.out.println("-----------------");
        for (Integer num : list) {
            System.out.println(num);
        }
    }

    public static void main(String[] args) {

        /*7

        1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
                a) Число нацело делится на 3 (x%3==0)
                b) нацело делится на 2 (x%2==0)
                c) и все остальные.

                d) Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
                   Порядок объявления списков очень важен.

        1.1 Создай метод printList
        2. Метод printList должен выводить на экран все элементы списка с новой строки.
        3. Используя метод printList выведи эти три списка на экран.
           Сначала тот, который для x%3, потом тот, который для x%2, потом последний.
                */

        ArrayList<Integer> arrayListSource = new ArrayList<>();
        ArrayList<Integer> arrayListDevBy2 = new ArrayList<>();
        ArrayList<Integer> arrayListDevBy3 = new ArrayList<>();
        ArrayList<Integer> arrayListAll = new ArrayList<>();

        Scanner scan = new Scanner(System.in);

        for (int i = 1; i <= 20; i++) {
            System.out.printf("Введите %s число: ", i);
           // arrayListSource.add(scan.nextInt());
            arrayListSource.add(i);
        }




        for (int num:arrayListSource) {

            if ((num % 3 == 0) && (num % 2 == 0)) {
                arrayListDevBy3.add(num);
                arrayListDevBy2.add(num);
            } else if (num % 3 == 0) {
                arrayListDevBy3.add(num);
            } else if (num % 2 == 0) {
                arrayListDevBy2.add(num);
            } else {
                arrayListAll.add(num);
            }

        }

          printList(arrayListDevBy3);
          printList(arrayListDevBy2);
          printList(arrayListAll);

    }




}
