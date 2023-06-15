package lessons.lesson15;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        // TreeSet - убирает дубликаты и сортирует вашу коллекцию
        TreeSet<String> strings = new TreeSet<>();
        strings.add("a");
        strings.add("b");
        strings.add("b");
        strings.add("c");
        strings.add("e");
        strings.add("d");

        System.out.println(strings);

        TreeSet<Integer> integers = new TreeSet<>(new ReverseIntegers());
        integers.add(125);
        integers.add(227);
        integers.add(227);
        integers.add(12);
        integers.add(345);
        integers.add(74);
        System.out.println(integers);

    }
}
