package lessons.lesson14;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Classwork {
    public static void main(String[] args) {
        // 1 - создание коллекции и добавление в нее элементов
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

        // 2 - LinkedHashSet.
        LinkedHashSet<String> stringLinkedHashSet = new LinkedHashSet<>();
        stringLinkedHashSet.add("AAA");
        stringLinkedHashSet.add("BBB");
        stringLinkedHashSet.add("CCC");
        stringLinkedHashSet.add("CCC");
        stringLinkedHashSet.add("DDD");
        stringLinkedHashSet.add("DDD");
        stringLinkedHashSet.add("EEE");
        stringLinkedHashSet.add("EEE");
        stringLinkedHashSet.add("EEE");

        System.out.println("LinkedHashSet имеет порядок вхождения, но не хранит дубли");

        for (Iterator<String> iter = stringLinkedHashSet.iterator(); iter.hasNext();) {
            System.out.println(iter.next());

        }
        System.out.println("");
    }
}
