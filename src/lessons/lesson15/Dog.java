package lessons.lesson15;

public class Dog {
    // fields
    private String name;
    private boolean isCollarOn; // ошейник
    private boolean isLeashOn; // поводок
    private boolean isMuzzleOn; // намордник

    // constructor
    public Dog(String name) {
        this.name = name;
    }

    // methods

    public String getName() {
        return name;
    }

    public boolean isCollarOn() {
        return isCollarOn;
    }

    public boolean isLeashOn() {
        return isLeashOn;
    }

    public boolean isMuzzleOn() {
        return isMuzzleOn;
    }

    public void putCollar() {
        this.isCollarOn = true;
        System.out.println("Ошейник надет!");
    }

    public void putLeash() {
        this.isLeashOn = true;
        System.out.println("Поводок надет!");
    }

    public void putMuzzle() {
        this.isMuzzleOn = true;
        System.out.println("Намордник надет!");
    }

    public void walk() throws DogIsNotReadyToWalkException {
        System.out.println("Собираемся гулять!");
        if (isCollarOn && isLeashOn && isMuzzleOn) {
            System.out.println("Мы готовы, идем гулять!");
        } else {
            throw new DogIsNotReadyToWalkException("Собака "
                    + this.getName() + " не готова гулять!");
        }
    }
}
