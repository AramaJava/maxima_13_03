package lesson_12.game;

import lesson_12.game.entities.BlackJackGameImpl;
import lesson_12.game.entities.Croupier;
import lesson_12.game.entities.DeckOfCardsImpl;
import lesson_12.game.entities.PlayerImpl;
import lesson_12.game.interfaces.BlackjackGame;
import lesson_12.game.interfaces.DeckOfCards;
import lesson_12.game.interfaces.Player;

public class Main {
    public static void main(String[] args) {


     /* ДЗ
        1 - Добавить имена игрокам
        2 - регулировать кол-во игроков
        3 - отрегулировать процесс выявления победителя, разбирали на уроке, что последний шаг проверки барахлит
        4 * - добавить символ каждой карты и выводить саму карту с её символом + текстовое описание
*/



        // создать игру
        DeckOfCards deckOfCards = new DeckOfCardsImpl();
        deckOfCards.getRandomCard().printCard();
        deckOfCards.getRandomCard().printCard();

        BlackjackGame game = new BlackJackGameImpl();
        // создать игроков
        Player player1 = new PlayerImpl("Володя", true);
        Player player2 = new PlayerImpl("Юра", true);

        // 3 - Создать крупье
        Croupier croupier = new Croupier("Крупье", true);

        // 4 - Добавить игроков и крупье в игру
        game.addPlayerInGame(player1);
        game.addPlayerInGame(player2);
        game.addPlayerInGame(croupier);

        // 5 - Раздать по 2 карты каждому игроку на старте
        game.giveTwoCardsToEachPlayerOnStart();
        // 6 - Раздавать каждому игроку по 1 карте пока ему требуется
        game.giveCardIfNeedToPlayer();
        // 7 - Определение победителя

    }
}
