package lessons.lesson12b;

public class Card {
    // Каждая карта должна иметь масть и ранг (suit and rank)
    private Suit suit;
    private Rank rank;

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public Card(Card card) {
        this.suit = card.getSuit();
        this.rank = card.getRank();
    }

    // сеттеры не нужны (мы не можем менять карты) только геттеры
    public Suit getSuit() {
        return suit;
    }

    public Rank getRank() {
        return rank;
    }

    public int getValue() {
        return rank.rankValue;
    }

    @Override
    public String toString() {
        return ("[" + rank + " " + suit + "] (" + this.getValue() + ")");
    }
}
