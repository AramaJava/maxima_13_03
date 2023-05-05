package lesson_13.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        /*5
        1. Создай список строк.
        2. Добавь в него 5 строк с клавиатуры.
        3. Выполни 13 раз: удалить последнюю строку и вставить её в начало.
        4. Используя цикл выведи содержимое результирующего списка на экран, каждое значение с новой строки.*/

        List<String> arrayList2 = new ArrayList<>();

        Scanner scan = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.printf("Введите %s строку: ", i);
            arrayList2.add(scan.nextLine());
        }

        int n = arrayList2.size();
        for (int i = 0; i < 13; i++) {
            arrayList2.add(0,arrayList2.get(n-1));
            arrayList2.remove(n);
        }

        for (String s : arrayList2) {
            System.out.println(s);
        }


    }
}
