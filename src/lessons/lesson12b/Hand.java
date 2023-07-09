package lessons.lesson12b;

import java.util.ArrayList;

public class Hand {
    private ArrayList<Card> hand;

    public Hand() {
        hand = new ArrayList<Card>();
    }

    public Card getCard(int idx) {
        return hand.get(idx);
    }

    public void takeCardFromDeck(Deck deck) {
        hand.add(deck.takeCard());
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        for (Card card: hand) {
            output.append(card).append(" | ");
        }
        return output.toString();
    }

    public int calculatedValue() {
        int value = 0;
        int aceCount = 0;

        // бежим в цикле по картам на руке и суммируем их значения
        for (Card card: hand) {
            value += card.getValue();
            // сколько тузов на руке
            if (card.getValue() == 11) {
                aceCount++;
            }
        }

        // если на руке несколько тузов и очков получается больше 21,
        // то возвращаемся и меняем значение тузов = 1
        if (value > 21 && aceCount > 0) {
            while (aceCount > 0 && value > 21) {
                aceCount--;
                value -= 10;
            }
        }
        return value;
    }

    public void discardHandToDeck(Deck discarDeck) {
        discarDeck.addCards(hand);
        hand.clear();
    }

    public int getHandSize() {
        return hand.size();
    }
}
