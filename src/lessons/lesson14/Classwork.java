package lessons.lesson14;

import java.util.HashSet;

public class Classwork {
    public static void main(String[] args) {
        //создание коллекции и добавление в нее элементов
        HashSet<String> strings = new HashSet<>();

        strings.add("AAA");
        strings.add("BBB");
        strings.add("BBB");
        strings.add("BBB");
        strings.add("CCC");
        strings.add("DDD");
        strings.add("DDD");
        strings.add("DDD");
        strings.add("EEE");
        strings.add("EEE");
        System.out.println("HashSet не иммет порядка вхождения и не хранит дубли");
    }
}
