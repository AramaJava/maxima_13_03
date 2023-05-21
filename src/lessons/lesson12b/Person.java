package lessons.lesson12b;

public abstract class Person {
    private String name;
    private Hand hand;

    public Person() {
        this.name = "";
        this.hand = new Hand();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Hand getHand() {
        return this.hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public void printHand() {
        System.out.println("Карты игрока " + this.name + " :");
        System.out.println(this.hand + " - Сумма очков: " + this.hand.calculatedValue());
    }

    public boolean hasBlackjack() {
        return this.getHand().calculatedValue() == 21;
    }

    public void hit(Deck deck, Deck discard) {
        if (!deck.hasCards()) {
            deck.reloadDeckFromDiscard(discard);
        }
        this.hand.takeCardFromDeck(deck);

        System.out.println("Игрок " + this.name + " берет карту: " + hand.getCard(hand.getHandSize() - 1));

        this.printHand();
    }
}
