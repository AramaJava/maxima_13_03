package lessons.lesson15;

import java.util.Comparator;

public class ReverseIntegers implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return o2 - o1;
    }
}
