package lessons.lesson15;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

/*  1
            Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
            Удалить из множества все числа больше 10.

            Требования:
            •    Программа не должна выводить текст на экран.
            •    Программа не должна считывать значения с клавиатуры.
            •    Класс Solution должен содержать только три метода.
            •    Метод createSet() должен создавать и возвращать
                    множество Set состоящих из 20 различных чисел.
            •    Метод removeAllNumbersGreaterThan10() должен
                    удалять из множества все числа больше 10.
*/
public class Solution {
    public static Set<Integer> createSet() {
        Set<Integer> set = new TreeSet<>();
        Random random = new Random();
        while (set.size() < 20) {
            set.add(random.nextInt(40));
        }
        return set;
    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
        return set.stream().filter(x -> x <= 10).collect(Collectors.toSet());
    }

    public static Set<Integer> removeAllNumbersGreaterThan10Ver2(Set<Integer> set) {
        set.removeIf(n -> (n > 10));
        return set;
    }

    public static void main(String[] args) {
        Set<Integer> integers = createSet();
        System.out.println(integers);
        System.out.println(removeAllNumbersGreaterThan10(integers));
    }
}



