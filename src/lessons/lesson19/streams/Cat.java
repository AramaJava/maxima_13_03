package lessons.lesson19.streams;

public class Cat {
    // поля
    private String name;
    private int age;
    private Breed breed;
    //конструктор

    public Cat(String name, int age, Breed breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    //методы

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Breed getBreed() {
        return breed;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Cat{"
                + "name='" + name + '\''
                + ", age=" + age
                + ", breed=" + breed
                + '}';
    }
}
