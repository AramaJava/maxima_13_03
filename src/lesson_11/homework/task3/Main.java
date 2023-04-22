package lesson_11.homework.task3;

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
        Human Vladimir = new Human();
        Vladimir.setName("Владимир Николаевич");
        Human Boris = new Human();
        Boris.setName("Борис Васильевич");
        // бабушки
        Human Nadya = new Human();
        Nadya.setName("Надежда Петровна");
        Human Marina = new Human();
        Marina.setName("Марина Валерьевна");
        // отец
        Human Pavel = new Human("Павел Борисович", true, 38, Boris, Marina);
        // мать
        Human Katya = new Human("Екатерина Владимировна", false, 35, Vladimir, Nadya);
        // трое детей
        Human Igor = new Human("Игорь Павлович", true, 7, Pavel, Katya);
        Human Vadim = new Human("Вадим Павлович", true, 3, Pavel, Katya);
        Human Varvara = new Human("Варвара Павловна", false, 1, Pavel, Katya);

        System.out.printf("Дедушки: %s, %s \n", Vladimir.getName(), Boris.getName());
        System.out.printf("Бабушки: %s, %s \n", Nadya.getName(), Marina.getName());
        System.out.printf("Отец: %s \n", Pavel);
        System.out.printf("Мать: %s \n", Katya);
        System.out.printf("Сын: %s \n", Igor);
        System.out.printf("Сын: %s \n", Vadim);
        System.out.printf("Дочь: %s \n", Varvara);


    }
}
