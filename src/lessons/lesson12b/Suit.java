package lessons.lesson12b;
public enum Suit {
    //масти
    HEART("♥ Черви"),
    DIAMOND("♦ Буби"),
    CLUB("♣ Трефы"),
    SPADE("♠ Пики");
    private final String suitName;

    Suit(String suitName) {
        this.suitName = suitName;
    }

    @Override
    public String toString() {
        return suitName;
    }
}
