package lessons.lesson19;

public enum Season {
    WINTER(1, "Зима"), SPRING(2, "Весна"), SUMMER(3, "Лето"), AUTUMN(4, "Осень");
    private int numberOfSeason;
    private String russianName;

    Season(int numberOfSeason, String russianName) {
        this.numberOfSeason = numberOfSeason;
        this.russianName = russianName;
    }

    public int getNumberOfSeason() {
        return numberOfSeason;
    }

    public String getRussianName() {
        return russianName;
    }
}
