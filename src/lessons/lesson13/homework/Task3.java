package lessons.lesson13.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
      /*  3
        1. Создай список строк.
        2. Считай с клавиатуры 5 строк и добавь в список.
        3. Используя цикл, найди самую короткую строку в списке.
        4. Выведи найденную строку на экран.
        5. Если таких строк несколько, выведи каждую с новой строки.*/

        List<String> array1 = new ArrayList<>();
        List<String> list = new ArrayList<>();

        Scanner scan = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.printf("Введите %s строку: ", i);
            array1.add(scan.nextLine());
        }

        int min = array1.get(0).length();
        list.add(array1.get(0));

        int n = array1.size();

        for (int i = 1; i < n; i++) {
            if (array1.get(i).length() < min) {
                min = array1.get(i).length();
                list.remove(0);
                list.add(array1.get(i));
            } else if (array1.get(i).length() == min) {
                list.add(array1.get(i));
            }
        }
        for (String s : list) {
            if (s != null) {
                System.out.println(s);
            }
        }

    }
}


