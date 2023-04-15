package lesson_10.animals;

public class Animal {
    /*
     Класс Animal содержит переменные food, location и методы makeNoise, eat, sleep.
     Метод makeNoise, например, может выводить на консоль "Такое-то животное спит".
    */
    private String name;
    private String food;
    private String location;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void makeNoise() {

    }

    public void eat() {
    }

    public void sleep() {
        System.out.printf("Животное %s спит!\n", typeOfAnimal(this));
    }

    public String typeOfAnimal(Animal animal) {

        switch (animal.getClass().getSimpleName()) {
            case "Dog" -> {
                return "Собака";
            }
            case "Cat" -> {
                return "Кошка";
            }
            case "Horse" -> {
                return "Лошадь";
            }
        }
        return null;
    }
}
