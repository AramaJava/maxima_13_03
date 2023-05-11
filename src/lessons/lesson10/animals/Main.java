package lessons.lesson10.animals;

public class Main {
    public static void main(String[] args) {
/*  1. Создать класс Animal и расширяющие его классы Dog, Cat, Horse.
    Класс Animal содержит переменные food, location и методы makeNoise, eat, sleep.
    Метод sleep, например, может выводить на консоль "Такое-то животное спит".

    2. Dog, Cat, Horse переопределяют методы makeNoise, eat.

    3. Добавьте переменные в классы Dog, Cat, Horse, характеризующие только этих животных.

    4. Создайте класс Ветеринар, в котором определите метод void treatAnimal(Animal animal).
       Пусть этот метод распечатывает food и location пришедшего на прием животного.

    5. В методе main создайте массив типа Animal, в который запишите животных всех имеющихся у вас типов.
       В цикле отправляйте их на прием к ветеринару.        */

        Dog dog1 = new Dog();
        dog1.setName("Шарик");
        dog1.setFood("мясо");
        dog1.setLocation("Москва");
        dog1.setClimbingTrees(false);

        Cat cat1 = new Cat();
        cat1.setName("Маруся");
        cat1.setFood("молоко");
        cat1.setLocation("Тверь");
        cat1.setCountOfLife(9);

        Horse horse1 = new Horse();
        horse1.setName("Буцифал");
        horse1.setFood("сено");
        horse1.setLocation("Екатеринбург");
        horse1.setHasHooves(true);

        Animal[] pets = new Animal[3];
        pets[0] = dog1;
        pets[1] = cat1;
        pets[2] = horse1;

        cat1.makeNoise();
        cat1.eat();
        cat1.sleep();

        dog1.makeNoise();
        dog1.eat();
        dog1.sleep();

        horse1.makeNoise();
        horse1.eat();
        horse1.sleep();

        System.out.println();

        for (Animal animal : pets) {
            Veterinarian.treatAnimal(animal);
            System.out.println();
        }

    }
}
