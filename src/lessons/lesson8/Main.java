package lessons.lesson8;

public class Main {

    public static void main(String[] args) {

        System.out.println(HomeWork.exp3(5));
        System.out.println(HomeWork.isNumberGreater5(6));
        System.out.println(HomeWork.lesserNum(7, 3));
        HomeWork.superOperation(7, 3);

        //  Метод main() - должен считывать 2 числа с помощью getInt()),
        //  считать операцию (с помощью getOperation(),
        //  передать все методу calc() и вывести на экран результат.

        //int a = HomeWork.getInt();
        //int b = HomeWork.getInt();
        //char c = HomeWork.getOperation();
        //calc(a, b, c);

        int n1 = 2, n2 = 9, n3 = -11;

        // nested ternary operator
        // to find the largest number
        int largest = (n1 >= n2) ? ((n1 >= n3) ? n1 : n3) : ((n2 >= n3) ? n2 : n3);
        System.out.println("Largest Number: " + largest);

    }
}
