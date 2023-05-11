package lessons.lesson12a.game.interfaces;

public interface BlackjackGame {

    // добавить игроков в и гру
    void addPlayerInGame(Player player);

    // выдать нам по 2 карты
    void giveTwoCardsToEachPlayerOnStart();

    // выдать по доп карте, если нужна
    void giveCardIfNeedToPlayer();

    // определить и распечатать победителя
    void printWinner();

    //
    int setCountOfPlayer();

    // посчитать кол-во игроков в игре
    int countAllPlayersInGame();
}
