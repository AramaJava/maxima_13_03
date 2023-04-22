package lesson_11.department;

public class JavaDeveloper implements JobOfferInterface {

    @Override
    public void writeCode() {
        System.out.println("writing the Code on Java");

    }

    @Override
    public void bePunctual() {
        System.out.println("I have flexible schedule");
    }

    @Override
    public void getSalary() {
        System.out.println("salary: 1800$");
    }
}

