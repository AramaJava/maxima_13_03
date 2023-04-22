package lesson_12.game.interfaces;

public interface BlackjackGame {
    // добавить игроков в и гру
    void addPlayerInGame(Player player);
    // выдать нам по 2 карты
    void giveTwoCardsToEachPlayer();
    // выдать доп карту, если нужна
    void giveCardIfNeedToPlayer();
    // определить и распечатать победителя

}
