package lesson12a;

import java.util.ArrayList;
import java.util.List;

public enum CardsAmount {
    CARDS_36(4),
    CARDS_52(0);

    private final static String[] SUITS = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Валет", "Дама", "Кароль", "Туз"};
    private final static int[] RANK = {2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 11};

    private int position;

    CardsAmount(int position) {
        this.position = position;
    }

    public List<Card> fillingCards() {
        List<Card> cards = new ArrayList<>();
        for (Colour colour : Colour.values()) {
            for (int index = this.position; index < SUITS.length; index++) {
                cards.add(new Card(SUITS[index], RANK[index], colour));
            }
        }
        return cards;
    }
}

