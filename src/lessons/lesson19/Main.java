package lessons.lesson19;

import lessons.lesson16.Fridge;

public class Main {
    @MethodInfo (purpose = "for example")
    public static void main(String[] args) {
        Season winter = Season.WINTER;

        switch (winter) {
            case WINTER -> System.out.println(winter.getRussianName());
            case SPRING -> System.out.println(winter.getRussianName());
            case SUMMER -> System.out.println(winter.getRussianName());
            case AUTUMN -> System.out.println(winter.getRussianName());
        }

        Fridge fridge = new Fridge();
        fridge.putProducts("Bananas", 2);
        
    }
}