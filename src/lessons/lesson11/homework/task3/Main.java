package lessons.lesson11.homework.task3;

public class Main {
    public static void main(String[] args) {
        /*
        ЗАДАЧА 3

        Создай класс Human с полями имя(String), пол(boolean), возраст(int), отец(Human), мать(Human).
        Создай объекты и заполни их так, чтобы получилось:
        Два дедушки, две бабушки, отец, мать, трое детей.
        Вывести объекты на экран.

        Примечание:
        Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.

        Пример вывода:
        Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
        Имя: Катя, пол: женский, возраст: 55
        Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
        ...
        */
        // дедушки
        Human vladimir = new Human();
        vladimir.setName("Владимир Николаевич");
        Human boris = new Human();
        boris.setName("Борис Васильевич");
        // бабушки
        Human nadya = new Human();
        nadya.setName("Надежда Петровна");
        Human marina = new Human();
        marina.setName("Марина Валерьевна");
        // отец
        Human pavel = new Human("Павел Борисович", true, 38, boris, marina);
        // мать
        Human katya = new Human("Екатерина Владимировна", false, 35, vladimir, nadya);
        // трое детей
        Human igor = new Human("Игорь Павлович", true, 7, pavel, katya);
        Human vadim = new Human("Вадим Павлович", true, 3, pavel, katya);
        Human varvara = new Human("Варвара Павловна", false, 1, pavel, katya);

        System.out.printf("Дедушки: %s, %s \n", vladimir.getName(), boris.getName());
        System.out.printf("Бабушки: %s, %s \n", nadya.getName(), marina.getName());
        System.out.printf("Отец: %s \n", pavel);
        System.out.printf("Мать: %s \n", katya);
        System.out.printf("Сын: %s \n", igor);
        System.out.printf("Сын: %s \n", vadim);
        System.out.printf("Дочь: %s \n", varvara);

    }
}
