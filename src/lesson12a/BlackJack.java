package lesson12a;

import java.util.Scanner;

public class BlackJack {
    private static final String NAME_COMPUTER = "Иван";
    private static final int MAX_RANGE_COMPUTER = 15;
    private static final int MAX_SCORE = 21;
    private static final int MIN_AMOUNT_CARDS = 4;

    private final Scanner scanner;
    private final Desk desk;

    public BlackJack(Scanner scanner, Desk desk) {
        this.scanner = scanner;
        this.desk = desk;
    }

    public void start() {
        System.out.print("Введите Ваше имя: ");
        String namePlayer = this.scanner.nextLine().trim();
        Player player = new Player(namePlayer, this.scanner, this.desk, MAX_SCORE);
        Player computer = new Player(NAME_COMPUTER, this.desk, MAX_RANGE_COMPUTER, MAX_SCORE);
        int count = 1;
        boolean gameNext = true;
        while (gameNext && this.desk.amountCards() >= MIN_AMOUNT_CARDS) {
            System.out.println("\n" + this.desk);
            System.out.println("Перемешиваем карты...");
            this.desk.hashingCards();
            System.out.println("\nСтарт игры #" + count + ":");
            gameNext = game(player, computer);
            count++;
        }
        printFullWinner(player, computer);
        System.out.println("Конец игры...");
    }

    private void printFullWinner(Player first, Player second) {
        Player winner = null;
        if (first.isLose()) {
            winner = second;
            System.out.printf("Победитель игры: [%s]!!!\n", second.getName());
        } else if (second.isLose()) {
            winner = first;
        } else {
            System.out.println(first);
            System.out.println(second);
            if (first.getWin() > second.getWin()) {
                winner = first;
            } else if (first.getWin() < second.getWin()) {
                winner = second;
            }
        }
        System.out.println(winner != null ? String.format("Победитель игры: [%s]!!!", winner.getName()) : "Победитель не определен!!!");
    }

    private boolean game(Player first, Player second) {
        first.getCard(2);
        second.getCard(2);
        System.out.println(first.getCardsAndSumNow());
        System.out.println(second.getCardsAndSumNow());
        boolean nextFirst = true;
        boolean nextSecond = true;
        while (nextFirst || nextSecond) {
            nextFirst = first.move();
            nextSecond = second.move();
        }
        return searchWinner(first, second);
    }

    private boolean searchWinner(Player first, Player second) {
        boolean result = !first.isLose();
        if (result && !second.isLose()) {
            if (first.getPlayerHand().getSum() > second.getPlayerHand().getSum()) {
                first.incWin();
                second.incLose();
                printWinner(first, second, false);
            } else if (first.getPlayerHand().getSum() < second.getPlayerHand().getSum()) {
                second.incWin();
                first.incLose();
                printWinner(second, first, false);
            } else {
                if (first.getPlayerHand().getSum() == MAX_SCORE) {
                    if (first.getPlayerHand().isBlackJack()) {
                        printWinner(first, second, true);
                    } else if (second.getPlayerHand().isBlackJack()) {
                        printWinner(second, first, true);
                    }
                } else {
                    System.out.println("Победитель игры не определен;");
                }
            }
            first.update();
            second.update();
        }
        return result;
    }

    private void printWinner(Player winner, Player loser, boolean blackJack) {
        winner.getCardsAndSumNow();
        loser.getCardsAndSumNow();
        System.out.printf("Победитель игры: Игрок [%s]%s;\n", winner.getName(), blackJack ? ". He is BlackJack" : "");
    }
}


