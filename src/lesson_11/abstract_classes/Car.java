package lesson_11.abstract_classes;

public abstract class Car {
    private String mark;
    private String color;
    private int maxSpeed;

    public abstract void gas();

    public abstract void stop();

    public void drive() {
        System.out.println(getMark() + " start to drive!");
    }
    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
