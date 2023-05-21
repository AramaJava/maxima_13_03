package lessons.lesson12b;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {
    private ArrayList<Card> deck;

    public Deck() {
        deck = new ArrayList<Card>();
    }

    public Deck(boolean makeDeck) {
        deck = new ArrayList<Card>();
        if (makeDeck) {
            for (Suit suit : Suit.values()) {
                for (Rank rank : Rank.values()) {
                    deck.add(new Card(suit, rank));
                }
            }
        }
        this.deck = deck;
    }

    public void addCard(Card card) {
        deck.add(card);
    }

    private ArrayList<Card> getCards() {
        return deck;
    }

    @Override
    public String toString() {
        String output = "";
        for (Card card : deck) {
            output += card;
            output += "\n";
        }
        return output;
    }

    public void shuffle() {
        Collections.shuffle(deck, new Random());
    }

    public Card takeCard() {
        Card cardToTake = new Card(deck.get(0));
        deck.remove(0);
        return cardToTake;
    }

    public boolean hasCards() {
        return deck.size() > 0;
    }

    public void emptyDesk() {
        deck.clear();
    }

    public void addCards(ArrayList<Card> cards) {
        deck.addAll(cards);
    }

    public void reloadDeckFromDiscard(Deck discard) {
        this.addCards(discard.getCards());
        this.shuffle();
        discard.emptyDesk();
        System.out.println("Колода пуста, создаем новую, перетасовываем.");
    }

    public int cardsLeft() {
        return deck.size();
    }

}
