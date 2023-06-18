package lessons.lesson16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Homework {

    public static void main(String[] args) throws IOException {
       /* HashMap
        1.1. Создать словарь Map (<String, String>)
             и добавить туда 10 человек в виде "Фамилия"-"Имя".
        1.2. Пусть среди этих 10 человек есть люди с одинаковыми именами.
        1.3. Пусть среди этих 10 человек есть люди с одинаковыми фамилиями.
        1.4. Вывести содержимое Map на экран.
*/
        HashMap<String, String> peoples = new HashMap<>();
        peoples.put("Иванов", "Василий");
        peoples.put("Романов", "Василий");
        peoples.put("Свердлов", "Василий");
        peoples.put("Сычев", "Егор");
        peoples.put("Петров", "Василий");
        peoples.put("Голубев", "Василий");
        peoples.put("Игнатов", "Василий");
        peoples.put("Абрамов", "Василий");
        peoples.put("Игумнов", "Василий");
        peoples.put("Сычев", "Василий");

        for (Map.Entry<String, String> p : peoples.entrySet()) {
            System.out.println(p.getKey() + " : " + p.getValue());
        }
    /*
        2. Программа вводит с клавиатуры имя месяца и выводит его номер на экран
        в виде: "May is the 5 month". Используй коллекции.
*/
        Map<String, Integer> months = new HashMap<>();
        months.put("january", 1);
        months.put("february", 2);
        months.put("march", 3);
        months.put("april", 4);
        months.put("may", 5);
        months.put("june", 6);
        months.put("july", 7);
        months.put("august", 8);
        months.put("september", 9);
        months.put("october", 10);
        months.put("november", 11);
        months.put("december", 12);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название месяца: ");
        String monthName = scanner.next().toLowerCase();
        if (months.containsKey(monthName)) {
            System.out.println(monthName.substring(0, 1).toUpperCase() + monthName.substring(1)
                    + " is the " + months.get(monthName) + " month");
        } else {
            System.out.println("Такого названия месяца нет!");
        }
        /*
        3. Задача: Программа определяет, какая семья (фамилию) живёт в доме с указанным номером.
        Новая задача: Программа должна работать не с номерами домов, а с городами:

        Пример ввода:
        Москва - Ивановы
        Киев - Петровы
        Лондон - Абрамовичи
        Пример ввода: Лондон
        Пример вывода: Абрамовичи
*/
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, String> map1 = new HashMap<>();

        while (true) {
            System.out.println("Введите название города: ");
            String city = reader.readLine();
            if (city.isEmpty()) {
                System.out.println("Ввод завершен!");
                break;
            }
            System.out.println("Введите фамилию, проживающих в городе: ");
            String family = reader.readLine();
            map1.put(city, family);
        }

        System.out.println("Введите название города: ");
        String city = reader.readLine();

        if (map1.containsKey(city)) {
            String familyName = map1.get(city);
            System.out.println("В городе проживают с фамилией " + familyName);
        }
    /*
        4. Создать коллекцию Map<String, String> (реализация HashMap), занести туда 10 пар строк:
                арбуз - ягода,
                банан - трава,
                вишня - ягода,
                груша - фрукт,
                дыня - овощ,
                ежевика - куст,
                жень-шень - корень,
                земляника - ягода,
                ирис - цветок,
                картофель - клубень.
        Вывести содержимое коллекции на экран, каждый элемент с новой строки.

        Пример вывода (тут показана только одна строка):
        картофель - клубень
*/
        Map<String, String> natureProducts = new HashMap<>();
        natureProducts.put("арбуз", "ягода");
        natureProducts.put("банан", "трава");
        natureProducts.put("вишня", "ягода");
        natureProducts.put("груша", "фрукт");
        natureProducts.put("дыня", "овощь");
        natureProducts.put("ежевика", "куст");
        natureProducts.put("жень-шень", "корень");
        natureProducts.put("земляника", "ягода");
        natureProducts.put("ирис", "цветок");
        natureProducts.put("картофель", "клубень");

        for (Map.Entry<String, String> np : natureProducts.entrySet()) {
            System.out.println(np.getKey() + " - " + np.getValue());
        }

      /* 5
        Есть коллекция Map<String, Object> (реализация HashMap),
        туда занесли 10 различных пар объектов.
        Вывести содержимое коллекции на экран, каждый элемент с новой строки.

        Пример вывода (тут показана только одна строка):
        Sim - 5
*/

        Map<String, Object> map = new HashMap<>();

        map.put("Sim", 5);
        map.put("Tom", 5.5);
        map.put("Arbus", false);
        map.put("Baby", null);
        map.put("Cat", "Cat");
        map.put("Eat", new Long(56));
        map.put("Food", new Character('3'));
        map.put("Gevey", '6');
        map.put("Hugs", 111111111111L);
        map.put("Comp", (double) 123);

        //напишите тут ваш код
        for (Map.Entry<String, Object> mapObj : map.entrySet()) {
            System.out.println(mapObj.getKey() + " - " + mapObj.getValue());
        }
    }

}

