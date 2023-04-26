package lesson_12;

import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


/*
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        String answer = age >= 14 ? "Your age is ok" : "No, you cant go to the film!";
        System.out.println(answer);
*/
/*
        int factorial = Util.findFactotial(5);
        System.out.println(factorial);

        import java.util.*;

        class BlackJack {
            private static final String NAME_COMPUTER = "Ivan";
            private static final int MAX_RANGE_COMPUTER = 15;
            private static final int MAX_SCORE = 21;
            private static final int MIN_AMOUNT_CARDS = 4;

            private final Scanner scanner;
            private final Desk desk;

            BlackJack(Scanner scanner, Desk desk) {
                this.scanner = scanner;
                this.desk = desk;
            }

            void start() {
                System.out.print("Input your name: ");
                String namePlayer = this.scanner.nextLine().trim();
                Player player = new Player(namePlayer, this.scanner, this.desk, MAX_SCORE);
                Player computer = new Player(NAME_COMPUTER, this.desk, MAX_RANGE_COMPUTER, MAX_SCORE);
                int count = 1;
                boolean gameNext = true;
                while (gameNext && this.desk.amountCards() >= MIN_AMOUNT_CARDS) {
                    System.out.println("\n\n" + this.desk);
                    System.out.println("Hashing cards...");
                    this.desk.hashingCards();
                    System.out.println("\nStart game #" + count + ":");
                    gameNext = game(player, computer);
                    count++;
                }
                printFullWinner(player, computer);
                System.out.println("End game...");
            }

            private void printFullWinner(Player first, Player second) {
                Player winner = null;
                if (first.isLose()) {
                    winner = second;
                    System.out.printf("Winner is player [%s]!!!\n", second.getName());
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
                System.out.println(winner != null ?
                        String.format("Winner is player [%s]!!!", winner.getName()) :
                        "Winner not found!!!");
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
                boolean result;
                if (result = !first.isLose() && !second.isLose()) {
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
                            System.out.println("Winner not found this game;");
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
                System.out.printf("Winner this game: Player [%s]%s;\n", winner.getName(), blackJack ? ". He is BlackJack" : "");
            }
        }

//################################################################################################

        class PlayerHand {
            private final List<Card> cards;
            private final Desk desk;
            private int position;

            PlayerHand(Desk desk) {
                this.cards = new ArrayList<>();
                this.desk = desk;
            }

            void continueGame() {
                this.position = this.cards.size();
            }

            void getCard() {
                this.cards.add(this.desk.getCard());
            }

            private boolean isTwoJokers() {
                int count = 0;
                for (Card card : getCardsThisGame()) {
                    if (card.getSuit().toLowerCase().equals("ace")) {
                        count++;
                    }
                }
                return count >= 2;
            }

            boolean isBlackJack() {
                Card[] array = getCardsThisGame();
                return array.length == 2 && getSum() == 21 && !array[0].getSuit().equals("10") && !array[1].getSuit().equals("10");
            }

            int getSum() {
                int sum = 0;
                for (Card card : getCardsThisGame()) {
                    sum += card.getRank();
                }
                if (isTwoJokers()) {
                    sum -= 10;
                }
                return sum;
            }

            private Card[] getCardsThisGame() {
                Card[] array = new Card[this.cards.size() - this.position];
                for (int index = this.position; index < this.cards.size(); index++) {
                    array[index - this.position] = this.cards.get(index);
                }
                return array;
            }

            @Override
            public String toString() {
                return Arrays.toString(getCardsThisGame());
            }
        }

//################################################################################################

        class Desk {
            private final int lengthLine;
            private List<Card> cards;

            Desk(CardsAmount cardsAmount) {
                this.cards = cardsAmount.fillingCards();
                this.lengthLine = this.cards.size() / 4 - 1;
            }

            Card getCard() {
                Card card = null;
                if (!this.cards.isEmpty()) {
                    card = this.cards.remove(0);
                }
                return card;
            }

            int amountCards() {
                return this.cards.size();
            }

            void hashingCards() {
                if (!this.cards.isEmpty()) {
                    Random random = new Random();
                    List<Card> hashCards = new ArrayList<>();
                    while (!this.cards.isEmpty()) {
                        int index = random.nextInt(this.cards.size());
                        hashCards.add(this.cards.remove(index));
                    }
                    this.cards = hashCards;
                }
            }

            @Override
            public String toString() {
                StringBuilder sb = new StringBuilder("Cards to pack:\n   ");
                int count = 0;
                for (Card card : this.cards) {
                    sb.append(card);
                    if (count < this.lengthLine) {
                        sb.append(", ");
                        count++;
                    } else {
                        sb.append("\n   ");
                        count = 0;
                    }
                }
                return sb.toString();
            }
        }

//################################################################################################

        class Card {
            private final String suit;
            private final int rank;
            private final Colour colour;

            String getSuit() {
                return suit;
            }

            int getRank() {
                return rank;
            }

            Card(String suit, int rank, Colour colour) {
                this.suit = suit;
                this.rank = rank;
                this.colour = colour;
            }

            @Override
            public String toString() {
                return String.format("%s%s", this.colour, this.suit);
            }
        }

//################################################################################################

        enum Colour {
            HEART('♥'),
            DIAMOND('♦'),
            CLUB('♣'),
            SPADE('♠');

            final char symbol;

            Colour(char symbol) {
                this.symbol = symbol;
            }

            @Override
            public String toString() {
                return String.valueOf(this.symbol);
            }
        }

//################################################################################################

        enum CardsAmount {
            CARDS_36(4),
            CARDS_52(0);

            private final static String[] SUITS = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
            private final static int[] RANK = {2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 11};

            private int position;

            CardsAmount(int position) {
                this.position = position;
            }

            public List<Card> fillingCards() {
                List<Card> cards = new ArrayList<>();
                for (Colour colour : Colour.values()) {
                    for (int index = this.position; index < SUITS.length; index++) {
                        cards.add(new Card(SUITS[index], RANK[index], colour));
                    }
                }
                return cards;
            }
        }

//################################################################################################

        class Player {
            private final String name;
            private final Scanner scanner;
            private final PlayerHand playerHand;
            private final int maxRangeForMove;
            private final int maxScore;

            private int win;
            private int lose;
            private boolean stop;

            PlayerHand getPlayerHand() {
                return playerHand;
            }

            String getName() {
                return name;
            }

            int getWin() {
                return win;
            }

            private Player(String name, Scanner scanner, Desk desk, int maxRangeForMove, int maxScore) {
                this.name = name;
                this.scanner = scanner;
                this.playerHand = new PlayerHand(desk);
                this.maxRangeForMove = maxRangeForMove;
                this.maxScore = maxScore;
            }

            Player(String name, Scanner scanner, Desk desk, int maxScore) {
                this(name, scanner, desk, 0, maxScore);
            }

            Player(String name, Desk desk, int maxRangeForMove, int maxScore) {
                this(name, null, desk, maxRangeForMove, maxScore);
            }

            void incWin() {
                this.win++;
            }

            void incLose() {
                this.lose++;
            }

            boolean isLose() {
                return this.playerHand.getSum() > this.maxScore;
            }

            boolean move() {
                return this.scanner == null ? autoMove() : isMove();
            }

            void update() {
                this.playerHand.continueGame();
                this.stop = false;
            }

            void getCard(int count) {
                for (int amount = 0; amount < count; amount++) {
                    this.playerHand.getCard();
                }
            }

            private boolean isMove() {
                boolean result;
                if (result = !isLose()) {
                    if (result = !this.stop) {
                        System.out.print("Will you take the card?[y/n]: ");
                        String answer = this.scanner.nextLine().trim().toLowerCase();
                        if ("y".equals(answer)) {
                            System.out.printf("Player [%s] get card...\n", this.name);
                            this.getCard(1);
                            System.out.println(getCardsAndSumNow());
                        } else {
                            this.stop = true;
                        }
                    }
                }
                return result;
            }

            private boolean autoMove() {
                boolean result;
                if (result = !isLose()) {
                    if (result = this.playerHand.getSum() <= this.maxRangeForMove) {
                        System.out.printf("Player [%s] get card...\n", this.name);
                        this.playerHand.getCard();
                        System.out.println(getCardsAndSumNow());
                    }
                }
                return result;
            }

            String getCardsAndSumNow() {
                return String.format("Player [%s]: cards: %s; sum cards: %d;", this.name, this.playerHand, this.playerHand.getSum());
            }

            @Override
            public String toString() {
                return String.format("Player [%s]: win = %d; lose = %d;", this.name, this.win, this.lose);
            }
        }

//################################################################################################

        class BlackJackUI {
            public static void main(String[] args) {
                new BlackJack(new Scanner(System.in), new Desk(CardsAmount.CARDS_52)).start();
            }
        }*/



    }
}
