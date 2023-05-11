package lessons.lesson10.animals;

public class Cat extends Animal {
    // 3. Добавьте переменные в классы Dog, Cat, Horse, характеризующие только этих животных.
    private int countOfLife;

    public Cat() {
    }

    public int getCountOfLife() {
        return countOfLife;
    }

    public void setCountOfLife(int countOfLife) {
        this.countOfLife = countOfLife;
    }
// 2. Dog, Cat, Horse переопределяют методы makeNoise, eat.

    @Override
    public void makeNoise() {
        System.out.printf("Кошечка %s мяукает!\n", getName());
    }

    @Override
    public void eat() {
        System.out.printf("Кошечка %s пьет %s!\n", getName(), getFood());
    }

}
