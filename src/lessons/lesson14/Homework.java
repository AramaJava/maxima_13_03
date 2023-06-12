package lessons.lesson14;

import java.util.*;

public class Homework {
    public static void main(String[] args) {
/*  1: Введи с клавиатуры 5 слов в список строк.
        Удали 3-ий элемент списка, и выведи оставшиеся элементы в обратном порядке.\
*/
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> strings1 = new ArrayList<>();
        System.out.println("Введите 5 слов через пробел: ");
        for (int i = 0; i < 5; i++) {
            strings1.add(scanner.next());
        }
        strings1.remove(2);
        Collections.reverse(strings1);
        System.out.println(strings1);

        /*
    2: 1. Создай список из слов "мама", "мыла", "раму".
       2. После каждого слова вставь в список строку, содержащую слово "именно".
       3. Вывести результат на экран, каждый элемент списка с новой строки.
*/
        List<String> strings2 = new ArrayList<>();
        strings2.add("мама");
        strings2.add("мыла");
        strings2.add("раму");

        for (int i = 0; i <= strings2.size(); i++) {
            if (i % 2 != 0) {
                strings2.add(i, "именно");
            }
        }
        System.out.println(strings2);

        /*
    3:
        1. Создай список слов, заполни его самостоятельно.
        2. Метод fix должен:
        2.1. удалять из списка строк все слова, содержащие букву "р"
        2.2. удваивать все слова содержащие букву "л".
        2.3. если слово содержит и букву "р" и букву "л", то оставить это слово без изменений.
        2.4. с другими словами ничего не делать.

      */

        List<String> strings = new ArrayList<String>();
        strings.add("роза");
        strings.add("лоза");
        strings.add("лира");
        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    /*
     4:   1. Введи с клавиатуры 10 слов в список строк.
          2. Метод doubleValues должен удваивать слова по принципу:
            "альфа","бета","гамма"->"альфа","альфа","бета","бета","гамма","гамма"
          3. Выведи результат на экран, каждое значение с новой строки.
*/
        //Scanner scanner = new Scanner(System.in);
        List<String> strings4 = new ArrayList<>();
        System.out.println("Введите 10 слов через пробел: ");
        for (
                int i = 0;
                i < 10; i++) {
            strings4.add(scanner.next());
        }

        List<String> outList = doubleValues(strings4);

        for (
                String s : outList
        ) {
            System.out.println(s);
        }

        /*
      5:   1. Введи с клавиатуры 10 слов в список строк.
           2. Определить, является ли список упорядоченным по возрастанию длины строки.
           3. В случае отрицательного ответа вывести на экран индекс первого элемента,
           нарушающего такую упорядоченность .*/

        //    Scanner scanner = new Scanner(System.in);
        List<String> strings5 = new ArrayList<>();
        System.out.println("Введите 10 слов через пробел: ");
        for (int i = 0; i < 10; i++) {
            strings5.add(scanner.next());
        }
        boolean isSorted = false;
        for (int i = 0; i < strings5.size() - 1; i++) {
            if (strings5.get(i).length() > strings5.get(i + 1).length()) {
                System.out.println(i + 1);
                isSorted = false;
                break;
            } else {
                isSorted = true;
            }
        }
        System.out.println("Признак упорядоченности списка: " + isSorted);
    }

    public static List<String> fix(List<String> strings) {

        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).contains("р") && !strings.get(i).contains("л")) {
                strings.remove(i);
            }
            if (strings.get(i).contains("л")) {
                strings.set(i, strings.get(i).concat(strings.get(i)));
            }
        }
        return strings;
    }

    public static List<String> doubleValues(List<String> strings) {
        for (int i = 0; i < strings.size(); i++) {
            if (i % 2 == 0) {
                strings.add(i, strings.get(i));
            }
        }
        return strings;
    }
}