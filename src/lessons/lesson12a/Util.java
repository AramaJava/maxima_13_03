package lessons.lesson12a;

public class Util {
    public static  int findFactotial(int x) {
        int result  = 0;

        while (x > 1) {
            result *= x * (x - 1);
            x--;
        }
        return result;
    }
}
