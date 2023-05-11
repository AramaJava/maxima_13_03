package lessons.lesson11.homework.task2;

public class Main {
    public static void main(String[] args) {
        /*
        ЗАДАЧА 2

        Создать класс Person, который содержит:

        переменные fullName, age;
        методы move() и talk(), в которых просто вывести на консоль сообщение -"Такой-то  Person говорит".
        Добавьте два конструктора  - Person() и Person(fullName, age).
        Создайте два объекта этого класса. Один объект инициализируется конструктором Person(), другой - Person(fullName, age).
        */

        Person Nikita = new Person();
        Nikita.setFullName("Петров Никита Борисович");

        Person Marina = new Person("Никитина Марина Адольфовна", 59);
        Nikita.talk();
        Marina.move();
    }
}
