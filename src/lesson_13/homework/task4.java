package lesson_13.homework;

import java.util.ArrayList;
import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
       /* 4

        1. Создай список строк в методе main.
        2. Добавь в него 10 строчек с клавиатуры, но только добавлять не в конец списка, а в начало.
        3. Используя цикл выведи содержимое на экран, каждое значение с новой строки.*/

        ArrayList<String> arrayList1 = new ArrayList<>();

        arrayList1.add("Строка1");
        arrayList1.add("Строка2");
        arrayList1.add("Строка3");

        Scanner scan = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            System.out.printf("Введите %s строку: ", i);
            arrayList1.add(0,scan.nextLine());
            //arrayList1.add(i-1,scan.nextLine());

        }

        for(String s : arrayList1){
            System.out.println(s);
        }
    }
}
