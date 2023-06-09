package lessons.lesson12;

public class Card {
    private final String suit;
    private final int rank;
    private final Colour colour;

    String getSuit() {
        return suit;
    }

    int getRank() {
        return rank;
    }

    Card(String suit, int rank, Colour colour) {
        this.suit = suit;
        this.rank = rank;
        this.colour = colour;
    }

    @Override
    public String toString() {
        return String.format("%s %s", this.colour, this.suit);
    }
}

