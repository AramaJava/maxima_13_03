package lessons.lesson11;


import lessons.lesson11.animals.Animal;
import lessons.lesson11.animals.Cat;
import lessons.lesson11.animals.Dog;

public class Main {
    public static void main(String[] args) {
        /*Mazeratti mazeratti = new Mazeratti();
        mazeratti.setMark("Mazeratti");
        mazeratti.gas();
        mazeratti.stop();
        mazeratti.drive();

        LadaSedan ladaSedan = new LadaSedan();
        ladaSedan.setMark("Lada Sedan");
        ladaSedan.gas();
        ladaSedan.stop();
        ladaSedan.drive();
*/
        Animal animal = new Animal();
        animal.eat();

        Animal dog = new Dog();
        dog.eat();

        Animal cat = new Cat();
        cat.eat();
    }
}
