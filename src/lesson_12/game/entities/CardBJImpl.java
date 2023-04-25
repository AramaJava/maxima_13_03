package lesson_12.game.entities;

import lesson_12.game.interfaces.CardBJ;

public class CardBJImpl implements CardBJ {
    private String nameOfCard;

    private int value;

    public CardBJImpl(String nameOfCard, int value) {
        this.nameOfCard = nameOfCard;
        this.value = value;
    }

    @Override
    public void printCard() {
        System.out.println(nameOfCard);
    }

    @Override
    public int getValue() {
        return value;
    }

    @Override
    public String getNameCard() {
        return null;
    }
}
