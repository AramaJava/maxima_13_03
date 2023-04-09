package lesson_8;

public class Main {

    public static void main(String[] args) {

        System.out.println(HomeWork.exp3(5));
        System.out.println(HomeWork.isNumberGreater5(6));
        System.out.println(HomeWork.lesserNum(7, 3));
        HomeWork.SuperOperation(7, 3);

        //  Метод main() - должен считывать 2 числа с помощью getInt()),
        //  считать операцию (с помощью getOperation(),
        //  передать все методу calc() и вывести на экран результат.

        int a = HomeWork.getInt();
        int b = HomeWork.getInt();
        char c = HomeWork.getOperation();
        HomeWork.calc(a, b, c);
    }
}
