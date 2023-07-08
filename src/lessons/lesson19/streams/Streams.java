package lessons.lesson19.streams;


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Streams {
    private static final List<Employee> emps = List.of(
            new Employee("Michael", "Smith", 243, 43, Position.CHEF),
            new Employee("Jane", "Smith", 523, 40, Position.MANAGER),
            new Employee("Jury", "Gagarin", 6423, 26, Position.MANAGER),
            new Employee("Jack", "London", 5543, 53, Position.WORKER),
            new Employee("Eric", "Jackson", 2534, 22, Position.WORKER),
            new Employee("Andrew", "Bosh", 3456, 44, Position.WORKER),
            new Employee("Joe", "Smith", 723, 30, Position.MANAGER),
            new Employee("Jack", "Gagarin", 7423, 35, Position.MANAGER),
            new Employee("Jane", "London", 7543, 42, Position.WORKER),
            new Employee("Mike", "Jackson", 7534, 31, Position.WORKER),
            new Employee("Jack", "Bosh", 7456, 54, Position.WORKER),
            new Employee("Mark", "Smith", 123, 41, Position.MANAGER),
            new Employee("Jane", "Gagarin", 1423, 28, Position.MANAGER),
            new Employee("Sam", "London", 1543, 52, Position.WORKER),
            new Employee("Jack", "Jackson", 1534, 27, Position.WORKER),
            new Employee("Eric", "Bosh", 1456, 32, Position.WORKER)
    );

    private static final List<Department> deps = List.of(
            new Department(1, 0, "Head"),
            new Department(2, 1, "West"),
            new Department(3, 1, "East"),
            new Department(4, 2, "Germany"),
            new Department(5, 2, "France"),
            new Department(6, 3, "China"),
            new Department(7, 3, "Japan")
    );

    public static void main(String[] args) {
        // 1 создание стримов
     // источниками для стримов  могут примитивные типы int, long, byte
        IntStream intStream = IntStream.of(1, 2, 3, 4);
        DoubleStream doubleStream = DoubleStream.of(1.2, 3.4);

        IntStream.range(10, 100); // 10..99
        IntStream.rangeClosed(10, 100); // 10..100

        Stream<String> stringStream = Stream.of("1", "2", "3");

        //можем создать билдер
        Stream<String> build = Stream.<String>builder()
                .add("Mike")
                .add("Joe")
                .build();

        Stream<Employee> stream2 = emps.stream();
        Stream<Integer> iterate = Stream.iterate(1950, val -> val + 3);

        Stream<String> concat = Stream.concat(stringStream, build);

        // 2 Действия со стримами
        System.out.println(emps.stream().count()); // количество - терминальная операция

        emps.stream().forEach(employee -> System.out.println(employee.getAge()));
        emps.forEach(employee -> System.out.println("Возрасты сотрудников: " + employee.getAge()));

        emps.stream().collect(Collectors.toList());
        emps.stream().toArray();

        Map<Integer, String> collect = emps.stream().collect(Collectors.toMap(
                Employee::getId,
                emp -> String.format("%s %s", emp.getFirstName(), emp.getLastName())
        ));

        IntStream intStream1 = IntStream.of(100, 200, 300, 400);

        System.out.println("Сумма элементов стрима: "
                + intStream1.reduce((Integer::sum)).orElse(0));

       // System.out.println(deps.stream().reduce(this::reducer));

        IntStream.of(100, 200, 300, 400).max();
        IntStream.of(100, 200, 300, 400).average();
        IntStream.of(100, 200, 300, 400).min();
        IntStream.of(100, 200, 300, 400).sum();
        IntStream.of(100, 200, 300, 400).summaryStatistics();

        emps.stream().max(Comparator.comparingInt(Employee::getAge));

        emps.stream().findFirst();
        emps.stream().findAny();

        emps.stream().noneMatch(employee -> employee.getAge() > 60); //true
        emps.stream().allMatch(employee -> employee.getAge() > 18); //true
        emps.stream().anyMatch(employee -> employee.getPosition() == Position.CHEF);

        // 3 трансформации
        IntStream distinct = IntStream.of(100, 200, 300, 400, 100, 300).distinct();
        distinct.forEach(System.out::println);

        Stream<Employee> employeeStream = emps.stream()
                .filter(employee -> employee.getPosition() != Position.WORKER);
        employeeStream.forEach(employee -> System.out.println(employee.getPosition()));

        emps.stream()
                .skip(3)
                .limit(5);

        IntStream.of(100, 200, 300, 400)
                .flatMap(value -> IntStream.of(value - 50, value))
                .forEach(System.out::println);

        // Реальное применение
        Stream<Employee> empl = emps.stream()
                .filter(employee -> employee.getAge() <= 30
                        && employee.getPosition() != Position.WORKER)
                .sorted(Comparator.comparing(Employee::getLastName));

        print(empl);

        Stream<Employee> sorted = emps.stream()
                .filter(employee -> employee.getAge() > 40)
                .sorted((o1, o2) -> o2.getAge() - o1.getAge())
                .limit(4);

        print(sorted);

        IntSummaryStatistics statistics = emps.stream().mapToInt(Employee::getAge)
                .summaryStatistics();

        System.out.println(statistics);
    }

    public Department reducer(Department parent, Department child) {
        if (child.getParent() == parent.getId()) {
            parent.getChild().add(child);
        } else {
            parent.getChild().forEach(subParent -> reducer(subParent, child));
        }
        return parent;
    }

    public static void print(Stream<Employee> stream) {
        stream
                .map(emp -> String.format(
                        "%4d | %-15s %-10s age %s %s",
                        emp.getId(),
                        emp.getLastName(),
                        emp.getFirstName(),
                        emp.getAge(),
                        emp.getPosition()
                ))
                .forEach(System.out::println);
        System.out.println();
    }
}