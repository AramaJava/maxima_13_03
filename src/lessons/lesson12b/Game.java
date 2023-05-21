package lessons.lesson12b;

import lessons.lesson12a.game.entities.PlayerImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {
    private Deck deck, discarded;
    private Dealer dealer;
    private List<Player> playersArray = new ArrayList<>();
    private int wins, losses, pushes;

    public Game() {
        // создаем колоду из 52 карт и перетасовываем её
        deck = new Deck(true);
        deck.shuffle();

        // создаем колоду для сброшенных карт
        discarded = new Deck();

        // определяем количество игроков (от 1 до 3) и создаем их
        Scanner input = new Scanner(System.in);
        int countOfPlayers = 0;
        boolean getNum = true;
        while (getNum) {
            try {
                System.out.println("Введите необходимое количество игроков в игре: ");
                countOfPlayers = input.nextInt();
                if (countOfPlayers == 1 || countOfPlayers == 2 || countOfPlayers == 3) {
                    getNum = false;
                    for (int i = 0; i < countOfPlayers; i++) {
                        System.out.print("Введите имя игрока " + (i + 1) + ": ");
                        String playerName = input.next();
                        playersArray.add(new Player(playerName));
                    }
                } else {
                    getNum = false;
                    System.out.println("Некорректный ввод. Добавлен 1 игрок с именем Player");
                    playersArray.add(new Player("Player"));
                }
            } catch (Exception e) {
                System.out.println("Некорректный ввод!");
                input.next();
            }
        }

        // создаем крупье
        dealer = new Dealer();
        //player = new Player();

        // старт раунда
        startRound();

        wins = 0;
        losses = 0;
        pushes = 0;
    }

    private void startRound() {

        if (wins > 0 || losses > 0 || pushes > 0) {
            System.out.println("----------------------------------------");
            System.out.println("Начинается новый раунд игры. Побед: " + wins + " Поражений: " + losses + " Ничьи: " + pushes);
            System.out.println("Карт в колоде " + deck.cardsLeft());
            dealer.getHand().discardHandToDeck(discarded);
            player.getHand().discardHandToDeck(discarded);
        }

        if ((deck.cardsLeft()) < 4) {
            deck.reloadDeckFromDiscard(discarded);
        }

        // в этом методе логика каждого раунда
        // выдаем по 2 карты крупье и игроку
        dealer.getHand().takeCardFromDeck(deck);
        dealer.getHand().takeCardFromDeck(deck);

        player.getHand().takeCardFromDeck(deck);
        player.getHand().takeCardFromDeck(deck);

        //печатаем что на руках у игрока и дилера
        dealer.printFirstHand();
        player.printHand();

        if (dealer.hasBlackjack()) {
            if (player.hasBlackjack()) {
                System.out.println("У игрока " + player.getName() + " и у крупье БлекДжек! - Ничья!");
                pushes++;
                startRound();
            } else {
                System.out.println("У крупье БлекДжек (21 очко)! Вы проиграли.");
                dealer.printHand();
                losses++;
                startRound();
            }
        }

        // Проверка если у игрока БлекДжек
        if (player.hasBlackjack()) {
            System.out.println("У игрока " + player.getName() + " - БлекДжек (21 очко). Вы выиграли.");
            wins++;
            startRound();
        }

        player.makeDecision(deck, discarded);

        if (player.getHand().calculatedValue() > 21) {
            System.out.println("Игрок " + player.getName() + " набрал больше 21. Вы проиграли!");
            losses++;
            startRound();
        }

        dealer.printHand();
        while (dealer.getHand().calculatedValue() < 17) {
            dealer.hit(deck, discarded);
        }

        // Определяем победителя

        if (dealer.getHand().calculatedValue() > 21) {
            System.out.println("Крупье проиграл!");
            wins++;
        } else if (dealer.getHand().calculatedValue() > player.getHand().calculatedValue()) {
            System.out.println("Игрок " + player.getName() + " - вы проиграли!");
            losses++;
        } else if (player.getHand().calculatedValue() > dealer.getHand().calculatedValue()) {
            System.out.println("Игрок " + player.getName() + " - вы выиграли!");
            wins++;
        } else {
            System.out.println(" Ничья!");
            pushes++;
        }
        startRound();
    }
}


