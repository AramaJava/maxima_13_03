package lessons.lesson10.animals;

public class Veterinarian {
    /*
        4. Создайте класс Ветеринар, в котором определите метод void treatAnimal(Animal animal).
           Пусть этот метод распечатывает food и location пришедшего на прием животного.
     */
    public static void treatAnimal(Animal animal) {
        System.out.printf("Информация о животном на приеме у ветеринара: %s по кличке %s, ест -  %s ,  местонахождения:  %s", animal.typeOfAnimal(animal), animal.getName(), animal.getFood(), animal.getLocation());
    }
}
