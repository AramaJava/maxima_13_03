package lessons.lesson13;

import java.util.ArrayList;
import java.util.LinkedList;

public class Timer {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < 5000; i++) {
            arrayList.add(i);
        }

        for (int i = 0; i < 5000; i++) {
            linkedList.add(i);
        }

        long start1 = System.currentTimeMillis();
        for (int i = 5000; i < 100000; i++) {
            arrayList.add(i, i);
        }
        long end1 = System.currentTimeMillis();
        System.out.println("ArrayList added positions: " + (end1 - start1));

        long start2 = System.currentTimeMillis();
        for (int i = 5000; i < 100000; i++) {
            linkedList.add(i, i);
        }
        long end2 = System.currentTimeMillis();
        System.out.println("LinkedList added positions: " + (end2 - start2));
    }
}
