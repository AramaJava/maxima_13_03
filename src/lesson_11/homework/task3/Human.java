package lesson_11.homework.task3;

public class Human {
    /*
      Создай класс Human с полями имя(String), пол(boolean), возраст(int), отец(Human), мать(Human).
      */
    private String name;
    private boolean gender;
    private int age;
    private Human father;
    private Human mother;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    @Override
    public String toString() {
        return  name + '\'' +
                ", Пол =" + (gender ? " мужской" : " женский") +
                ", Возраст =" + age +
                ", Отец=" + father.name +
                ", Мать=" + mother.name +
                '}';
    }

    public Human(String name, boolean gender, int age, Human father, Human mother) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.father = father;
        this.mother = mother;
    }

    public Human() {
    }
}
