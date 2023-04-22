package lesson_11;

import lesson_11.abstract_classes.LadaSedan;
import lesson_11.abstract_classes.Mazeratti;
import lesson_11.animals.*;

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
