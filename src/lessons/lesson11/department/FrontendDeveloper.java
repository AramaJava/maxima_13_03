package lessons.lesson11.department;

public class FrontendDeveloper implements JobOfferInterface  {

    @Override
    public void writeCode() {
        System.out.println("writing the Code on JavaScript");
    }

    @Override
    public void bePunctual() {
        System.out.println("I'm going to 9.00 am");
    }

    @Override
    public void getSalary() {
        System.out.println("salary: 800$");
    }
}

