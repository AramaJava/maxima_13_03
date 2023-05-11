package lessons.lesson11.abstractclasses;

public class Mazeratti extends Car {
    @Override
    public void gas() {
        System.out.println("Mazeratti start to speed 100 km/h at 10 sec");
    }

    @Override
    public void stop() {
        System.out.println("But stop is not so fast");
    }

}
