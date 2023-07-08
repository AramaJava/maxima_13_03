package lessons.lesson19;

import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution {
    public static void main(String[] args) throws Exception {

/*      ЗАГОЛОВОК ЗАДАНИЯ
        Коллекции + Enum
        ТЕКСТ ЗАДАНИЯ

        1. Ввести с клавиатуры число N.
        2. Считать N целых чисел и заполнить ими список - метод getIntegerList.
        3. Найти минимальное число среди элементов списка - метод getMinimum.

        Минимальное из N чисел
*/
        List<Integer> integerList = getIntegerList();
        System.out.println("Минимальное число: " + getMinimum(integerList));

/*
        2

        Внутри класса Solution создать public static классы Cat, Dog
                без конструктора или с конструктором без параметров.

        2. Реализовать метод createCats, который должен возвращать множество с 4 котами.

        3. Реализовать метод createDogs, который должен возвращать множество с 3 собаками.

        4. Реализовать метод join, который должен возвращать
            объединенное множество всех животных - всех котов и собак.

        5. Реализовать метод removeCats, который должен удалять из множества pets всех котов,
            которые есть в множестве cats.

        6. Реализовать метод printPets, который должен выводить
            на экран всех животных, которые в нем есть. Каждое животное с новой строки.

        Множество всех животных
*/

        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();
        Set<Object> pets = join(cats, dogs);
        System.out.println("Печатаем объединенное множество животных");
        printPets(pets);
        System.out.println("Печатаем животных без котов");
        removeCats(pets, cats);
        printPets(pets);
        System.out.println(" ");

/*      3. Инициализируй поле wheels используя данные из loadWheelNamesFromDB.
           Выкинь исключение в случае некорректных данных.

           Подсказка: если что-то не то с колесами, то это не машина!
           Сигнатуры не менять

           Машину на СТО не повезем!
  */

        Car car = new Car();
        System.out.println(car);
        System.out.println(" "); // <- для брекпоинта
    }

    public static int getMinimum(List<Integer> array) {
        // Найти минимум тут
        int minValue = array.get(0);
        for (int i = 1; i < array.size(); i++) {
            if (array.get(i) < minValue) {
                minValue = array.get(i);
            }
        }
        return minValue;
    }

    public static List<Integer> getIntegerList() throws IOException {
        // Создать и заполнить список тут
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число N: ");
        int numberN = scan.nextInt();
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < numberN; i++) {
            System.out.print("Введите " + (i + 1) + " число:");
            result.add(scan.nextInt());
        }
        return result;
    }

    public static class Cat {
        public Cat() {
        }

        @Override
        public String toString() {
            return "Cat{}";
        }
    }

    public static class Dog {
        public Dog() {
        }

        @Override
        public String toString() {
            return "Dog{}";
        }
    }

    public static Set<Cat> createCats() {
        Set<Cat> result = new HashSet<>();
        result.add(new Cat());
        result.add(new Cat());
        result.add(new Cat());
        result.add(new Cat());

        return result;
    }

    public static Set<Dog> createDogs() {
        Set<Dog> result = new HashSet<>();
        result.add(new Dog());
        result.add(new Dog());
        result.add(new Dog());
        return result;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {

        //   Set<Object> mergedSet = new HashSet<>();
        //   Collections.addAll(mergedSet, cats.toArray());
        //   Collections.addAll(mergedSet, dogs.toArray());
        //   return mergedSet;

        // return Stream.concat(cats.stream(), dogs.stream()).collect(Collectors.toSet());

        return Stream.of(cats, dogs).flatMap(Collection::stream).collect(Collectors.toSet());

    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
       // pets.removeIf(obj -> obj instanceof Cat);
        pets.removeAll(cats);
    }

    public static void printPets(Set<Object> pets) {
        pets.forEach(System.out::println);
    }

    public enum Wheel {
        FRONT_LEFT("Переднее левое"),
        FRONT_RIGHT("Переднее правое"),
        BACK_LEFT("Заднее левое"),
        BACK_RIGHT("Заднее правое");

        private String name;

        Wheel(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    public static class Car {
        @SuppressWarnings("VisibilityModifier")
        protected List<Wheel> wheels;

        public Car() {
            //init wheels here
            try {
                this.setWheels(Arrays.stream(loadWheelNamesFromDB()).
                        map(Wheel::valueOf).collect(Collectors.toList()));
            } catch (Exception ex) {
                System.out.println("Что-то не то с колесами, это не машина!");
            }
        }

        public List<Wheel> getWheels() {
            return wheels;
        }

        public void setWheels(List<Wheel> wheels) {
            this.wheels = wheels;
        }

        @Override
        public String toString() {
            return "У машины колеса {" + this.getWheels()
                    + '}';
        }

        protected String[] loadWheelNamesFromDB() {
            //this method returns mock data
            return new String[]{"FRONT_LEFT", "FRONT_RIGHT", "BACK_LEFT", "BACK_RIGHT"};
        }
    }

}
