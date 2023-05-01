package lesson_12.game.interfaces;

public interface Player {
    // взять карту из колоды
    void takeCard(CardBJ card);

    // посчитать сумму карт на руке
    int countValuesAllCardsOnHand();

    // ответит нужна ли дополнительная карта
    boolean needCard();

    // показывать все карты на руках
    void showCardsOnHand();

    boolean isInGame();
    void setInGame(boolean inGame);
}
