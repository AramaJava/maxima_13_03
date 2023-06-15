package lessons.lesson15;

public class DogMain {
    public static void main(String[] args) {
        Dog dog = new Dog("Шарик");

        dog.putLeash();
        dog.putMuzzle();

        try {
            dog.walk();
        } catch (DogIsNotReadyToWalkException e) {
            e.printStackTrace();
            System.err.println("Проверка готовности к прогулке: ");
            System.err.println("Ошейник надет? " + dog.isCollarOn());
            System.err.println("Поводок надет? " + dog.isLeashOn());
            System.err.println("Намордник надет? " + dog.isMuzzleOn());

        }
    }
}
