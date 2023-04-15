package lesson_10.animals;

public class Dog extends Animal {
    // 3. Добавьте переменные в классы Dog, Cat, Horse, характеризующие только этих животных.
    private boolean isClimbingTrees;

    public boolean isClimbingTrees() {
        return isClimbingTrees;
    }

    public void setClimbingTrees(boolean climbingTrees) {
        isClimbingTrees = climbingTrees;
    }

    public Dog() {
    }
    // 2. Dog, Cat, Horse переопределяют методы makeNoise, eat.

    @Override
    public void makeNoise() {
        System.out.printf("Собачка %s лает!\n",getName());
    }


    @Override
    public void eat() {
        System.out.printf("Собачка %s ест %s!\n",getName(), getFood());
    }
}
