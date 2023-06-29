package lessons.lesson19;

public class Main {
    public static void main(String[] args) {
        Season winter = Season.WINTER;

        switch (winter) {
            case WINTER -> System.out.println(winter.getRussianName());
            case SPRING -> System.out.println(winter.getRussianName());
            case SUMMER -> System.out.println(winter.getRussianName());
            case AUTUMN -> System.out.println(winter.getRussianName());
        }
    }
}
