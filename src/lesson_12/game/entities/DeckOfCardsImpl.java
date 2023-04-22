package lesson_12.game.entities;

import lesson_12.game.interfaces.CardBJ;
import lesson_12.game.interfaces.DeckOfCards;

public class DeckOfCardsImpl implements DeckOfCards {
    CardBJ[] cards = new CardBJ[52];

    public DeckOfCardsImpl() {
        cards[0] = new CardBJImpl("Двойка треф", 2);


    }

    @Override
    public CardBJ getRandomCard() {

        return null;
    }
}
