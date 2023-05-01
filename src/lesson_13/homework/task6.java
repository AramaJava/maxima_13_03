package lesson_13.homework;

import java.util.ArrayList;
import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
      /*  6
        1. Создай список строк.
        2. Добавь в него 10 строчек с клавиатуры.
        3. Узнай, какая строка в списке встретится раньше: самая короткая или самая длинная.
                Если таких строк несколько, то должны быть учтены самые первые из них.
        4. Выведи на экран строку из п.3. Должна быть выведена одна строка.*/

        ArrayList<String> arrayList2 = new ArrayList<>();

        Scanner scan = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            System.out.printf("Введите %s строку: ", i);
            arrayList2.add(scan.nextLine());
        }

        int min = arrayList2.get(0).length();
        int max = arrayList2.get(0).length();
        int indexOfMax = 0;
        int indexOfMin = 0;
        int n = arrayList2.size();

        for (int i = 1; i < n; i++) {
            if (arrayList2.get(i).length() < min) {
                min = arrayList2.get(i).length();
                indexOfMin = i;
            }
        }


        for (int i = 1; i < n; i++) {
            if (arrayList2.get(i).length() > max) {
                max = arrayList2.get(i).length();
                indexOfMax = i;
            }
        }

        if (indexOfMin < indexOfMax) {
            System.out.println("Самая короткая раньше " + arrayList2.get(indexOfMin));
        }
        else System.out.println("Самая длинная раньше " + arrayList2.get(indexOfMax));


    }
}
