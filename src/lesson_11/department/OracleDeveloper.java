package lesson_11.department;

public class OracleDeveloper implements JobOfferInterface{

    @Override
    public void writeCode() {
        System.out.println("writing the Code on JavaScript");
    }

    @Override
    public void bePunctual() {
        System.out.println("I'm going to 17.00 pm");
    }

    @Override
    public void getSalary() {
        System.out.println("salary: 700$");
    }
}

