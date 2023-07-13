package lessons.lesson12b;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Game {
    private Deck deck, discarded;
    private Dealer dealer;
    private List<Player> players = new ArrayList<>();

    public Game() {
        // создаем колоду из 52 карт и перетасовываем её
        deck = new Deck(true);
        deck.shuffle();

        // создаем колоду для сброшенных карт
        discarded = new Deck();

        // определяем количество игроков (от 1 до 3) и создаем их
        Scanner input = new Scanner(System.in);
        int countOfPlayers;
        boolean getNum = true;
        while (getNum) {
            try {
                System.out.println("Введите количество игроков в игре: ");
                countOfPlayers = input.nextInt();
                if (countOfPlayers == 1 || countOfPlayers == 2 || countOfPlayers == 3) {
                    getNum = false;
                    for (int i = 0; i < countOfPlayers; i++) {
                        System.out.print("Введите имя игрока " + (i + 1) + ": ");
                        String playerName = input.next();
                        players.add(new Player(playerName));
                    }
                } else {
                    getNum = false;
                    System.out.println("Некорректный ввод. Добавлен 1 игрок с именем Player");
                    players.add(new Player("Player"));
                }
            } catch (Exception e) {
                System.out.println("Некорректный ввод!");
                input.next();
            }
        }

        // создаем крупье
        dealer = new Dealer();

        // старт раунда
        startRound();

    }

    private void startRound() {

        System.out.println("----------------------------------------");
        System.out.println("Начинается новый раунд игры!");
        System.out.println("----------------------------------------");
        System.out.println("Карт в колоде " + deck.cardsLeft());

        dealer.getHand().discardHandToDeck(discarded);

      /* Заменил
     for (Player p : players
        ) {
            p.getHand().discardHandToDeck(discarded);
        } */

        players.forEach(player -> player.getHand().discardHandToDeck(discarded));

        if ((deck.cardsLeft()) < 4) {
            deck.reloadDeckFromDiscard(discarded);
        }

        // выдаем по 2 карты крупье и каждому игроку
        dealer.getHand().takeCardFromDeck(deck);
        dealer.getHand().takeCardFromDeck(deck);

        /* Заменил на стрим
        for (Player p : players
        ) {
            p.getHand().takeCardFromDeck(deck);
            p.getHand().takeCardFromDeck(deck);
        }*/

        Stream<Player> stream = players.stream();
        stream.forEach(player -> {
            player.getHand().takeCardFromDeck(deck);
            player.getHand().takeCardFromDeck(deck);
        });

        //печатаем что на руках у каждого игрока и дилера
        dealer.printFirstHand();

        //печатаем карты игроков
    /*    for (Player p : players
        ) {
            p.printHand();
        } */
        Stream<Player> stream1 = players.stream();
        stream1.forEach(Person::printHand);

        System.out.println("_____________________________");

        if (dealer.hasBlackjack()) {

            for (Player p : players
            ) {
                if (p.hasBlackjack()) {
                    System.out.println("У игрока " + p.getName() + " и у крупье БлекДжек! -Ничья!");
                } else {
                    System.out.println("У крупье БлекДжек (21 очко)! Вы проиграли.");
                    dealer.printHand();
                    startRound();
                }
            }
        }

        // Проверка если у игрока сразу БлекДжек
        for (Player p : players
        ) {
            if (p.hasBlackjack()) {
                System.out.println("Выиграл игрок " + p.getName() + " у него-БлекДжек(21очко)");
                startRound();
            }
        }

        for (Player p : players
        ) {
            p.makeDecision(deck, discarded);
            if (p.getHand().calculatedValue() > 21 && players.size() == 1) {
                System.out.println("Игрок " + p.getName() + " проиграл. Он набрал больше 21.");
                System.out.println("Выиграл крупье!");
                System.out.println("_____________________________");
                startRound();
            }
        }

        dealer.printHand();
        // дилер в цикле набирает карты пока у него меньше 17 очков на руках
        while (dealer.getHand().calculatedValue() < 17) {
            dealer.hit(deck, discarded);
        }

        // Определяем победителя

        Player bestPlayer = players.get(0);
        for (Player p : players) {
            int sum = p.getHand().calculatedValue();
            if (sum <= 21 && sum > bestPlayer.getHand().calculatedValue()) {
                bestPlayer = p;
            }
            if (sum == bestPlayer.getHand().calculatedValue()
                    && players.size() > 1
                    && sum >= dealer.getHand().calculatedValue()) {
                System.out.println("Ничья");
                startRound();
            }
        }

        if (bestPlayer.getHand().calculatedValue() > 21) {
            System.out.println("У всех игроков перебор!");
            startRound();
        }

        if (dealer.getHand().calculatedValue() > 21) {
            System.out.println("Крупье проиграл!");
            System.out.println("Выиграл игрок " + bestPlayer.getName());
            bestPlayer.printHand();
            startRound();
        } else if (dealer.getHand().calculatedValue() > bestPlayer.getHand().calculatedValue()) {
            System.out.println("Выйграл крупье!");
        } else if (bestPlayer.getHand().calculatedValue() > dealer.getHand().calculatedValue()) {
            System.out.println("Выиграл игрок " + bestPlayer.getName());
            bestPlayer.printHand();
        } else {
            System.out.println(" Ничья!");
        }

        startRound();
    }
}

