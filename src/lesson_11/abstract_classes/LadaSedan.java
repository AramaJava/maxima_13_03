package lesson_11.abstract_classes;

public class LadaSedan extends Car {
    @Override
    public void gas() {
        System.out.println("LadaSedan start to speed 100 km/h at 10 sec");
    }

    @Override
    public void stop() {
        System.out.println("But stop is not so fast");
    }

}
