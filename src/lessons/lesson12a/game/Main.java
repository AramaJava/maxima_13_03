package lessons.lesson12a.game;

import lessons.lesson12a.game.entities.BlackJackGameImpl;
import lessons.lesson12a.game.entities.DeckOfCardsImpl;
import lessons.lesson12a.game.entities.PlayerImpl;
import lessons.lesson12a.game.interfaces.BlackjackGame;
import lessons.lesson12a.game.interfaces.DeckOfCards;
import lessons.lesson12a.game.interfaces.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    @SuppressWarnings("checkstyle:LocalVariableName")
    public static void main(String[] args) {

/* ДЗ
        1 - Добавить имена игрокам
        2 - регулировать кол-во игроков
        3 - отрегулировать процесс выявления победителя, разбирали на уроке, что последний шаг проверки барахлит
        4 * - добавить символ каждой карты и выводить саму карту с её символом + текстовое описание
*/

        int currentCardNum = 0;
        // создать игру
        DeckOfCards deckOfCards = new DeckOfCardsImpl();

        deckOfCards.getCardFromDeck(currentCardNum).printCard();
        currentCardNum++;
        deckOfCards.getCardFromDeck(currentCardNum).printCard();

        BlackjackGame game = new BlackJackGameImpl();
        // создать игроков

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество игроков в игре(1,2 либо 3): ");
        int countOfPlayers = scanner.nextInt();

        List<Player> playersArray = new ArrayList<>();

        for (int i = 0; i < countOfPlayers; i++) {
            System.out.print("Введите имя игрока " + (i + 1) + ": ");
            String playerName = scanner.next();
            playersArray.add(new PlayerImpl(playerName, true));
            game.addPlayerInGame(playersArray.get(i));
        }

        // 3 - Создать крупье
        Player croupier = new PlayerImpl("Крупье", true);

        // 4 - Добавить игроков и крупье в игру
        game.addPlayerInGame(croupier);

        // 5 - Раздать по 2 карты каждому игроку на старте
        game.giveTwoCardsToEachPlayerOnStart();
        // 6 - Раздавать каждому игроку по 1 карте пока ему требуется
        game.giveCardIfNeedToPlayer();
        // 7 - Определение победителя

    }
}
