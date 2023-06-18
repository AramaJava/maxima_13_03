package lessons.lesson16;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // 1 создание коллекции map
        HashMap<String, Integer> table = new HashMap<>();
        // 2 добавление элементов
        table.put("Dinamo", 11);
        table.put("Shakhtar", 15);
        table.put("Spartak", 19);
//      table.put(null, null);
//      table.put("SKA", null);

        // добавление дубликата ключа невозможно
        table.put("Dinamo", 21);
        // 4 метод containsKey
        System.out.println(table.containsKey("Dinamo"));
        System.out.println(table.containsKey("Zenith"));

        System.out.println("");
        // 5 проход по коллекции
        for (Map.Entry<String, Integer> p : table.entrySet()) {
            System.out.println(p.getKey() + " : " + p.getValue());
        }
        // 6 вернуть сет ключей

        for (String key : table.keySet()) {
            System.out.println("Key : " + key);
        }
        // 7 вернуть значение по ключу
        for (String key : table.keySet()) {
            System.out.println("Value : " + table.get(key));
        }
        }
    }
