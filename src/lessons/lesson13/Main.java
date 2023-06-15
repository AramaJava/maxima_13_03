package lessons.lesson13;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        /* ArrayList<Integer> -это безразмерная коллекция,
            реализация изменяемого массива интерфейса List.
            *Изменяет размер динамически, но может включать в себя элементы только одного типа.
            *Примитивные типы нельзя хранить внутри коллекций.
            Для этого есть ссылочные типы примитивов:
            int Integer
            byte Byte
            short Short
            char Character */

        ArrayList<Integer> arrayList = new ArrayList<>();

        // 1. Добавление объектов в коллекцию
        arrayList.add(11);
        arrayList.add(22);
        arrayList.add(33);
        arrayList.add(44);
        // 2. Получение объектов
        System.out.println("print first element " + arrayList.get(0));
        System.out.println("print fourth element " + arrayList.get(3));
        // 3. Печать списка
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
        for (Integer var : arrayList) {
            System.out.println(var);
        }
        // 4.Удаление элементов коллекции
        // по индексу
        arrayList.remove(0);
        // по объекту
        arrayList.remove(Integer.valueOf(44));
        System.out.println(arrayList);
        // очиска всей коллекции
        arrayList.clear();
        System.out.println(arrayList);

        // 5. проверка на наличие элемента
        ArrayList<String> strings = new ArrayList<>();
        strings.add("AAA");
        strings.add("BBB");
        strings.add("CCC");
        strings.add("DDD");
        System.out.println(strings.contains("EEE"));
        // 6. Добавление элемента коллекции на определенный индекс
        strings.add(3, "EEE");
        System.out.println(strings);
        // 7. Замена элемента коллекции
        strings.set(3, "NNN");
        System.out.println(strings);
        // 8. Узнать разер коллекции
        System.out.println(strings.size());
        // 9. Преобразование коллекции в массив
        Object[] array = strings.toArray();

        // 10. добавить все элементы в новую коллекцию
        ArrayList<String> copyArrayList = new ArrayList<>();
        copyArrayList.addAll(strings);

        // 11. проверка на наличие элементов
        System.out.println(strings.isEmpty());
        copyArrayList.clear();
        System.out.println(copyArrayList.isEmpty());

        // 12. Возвращать индекс элемента в коллекции

        strings.add("NNN");
        System.out.println("index of element NNN is " + strings.indexOf("NNN"));

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(111);
        linkedList.add(222);
        linkedList.add(333);
        linkedList.add(444);
        linkedList.add(555);

        System.out.println("");
    }
}
