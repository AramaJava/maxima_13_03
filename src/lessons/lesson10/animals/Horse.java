package lessons.lesson10.animals;

public class Horse extends Animal {
    // 3. Добавьте переменные в классы Dog, Cat, Horse, характеризующие только этих животных.
    private boolean hasHooves;

    public boolean isHasHooves() {
        return hasHooves;
    }

    public void setHasHooves(boolean hasHooves) {
        this.hasHooves = hasHooves;
    }

    public Horse() {
    }
   // 2. Dog, Cat, Horse переопределяют методы makeNoise, eat.

    @Override
    public void makeNoise() {
        System.out.printf("Лошадка %s ржёт!\n", getName());
    }

    @Override
    public void eat() {
        System.out.printf("Лошадка %s ест %s!\n", getName(), getFood());
    }
}
