package lesson_12.game.interfaces;

public interface BlackjackGame {
    // добавить игроков в и гру

    void addPlayerInGame(Player player);

    // выдать нам по 2 карты
    void giveTwoCardsToEachPlayerOnStart();
    // выдать доп карту, если нужна
    void giveCardIfNeedToPlayer();
    // определить и распечатать победителя
    void printWinner();
    int setCountOfPlayer();

    // посчитать кол-во игроков в игре
    int countAllPlayersInGame();
}
