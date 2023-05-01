package lesson_13.homework;

import java.util.ArrayList;
import java.util.Collection;

public class task1 {
    public static void main(String[] args) {
     /*1

        1. Создай список строк.
        2. Добавь в него 5 различных строк.
        3. Выведи его размер на экран.
        4. Используя цикл выведи его содержимое на экран, каждое значение с новой строки. */

        Collection<String> array = new ArrayList<>();
        array.add("Строка1");
        array.add("Строка2");
        array.add("Строка3");
        array.add("Строка4");
        array.add("Строка5");
        System.out.println("Размер коллекции: " + array.size());

        for(String s : array){
            System.out.println(s);
        }
    }
}
