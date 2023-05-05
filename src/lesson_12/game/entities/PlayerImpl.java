package lesson_12.game.entities;

import lesson_12.game.interfaces.CardBJ;
import lesson_12.game.interfaces.Player;

import java.util.Scanner;

public class PlayerImpl implements Player {
    private String name;

    public PlayerImpl(String name, boolean inGame) {
        this.name = name;
        this.inGame = inGame;
    }

    CardBJ [] cardsOnHand = new CardBJ[10];
    private boolean inGame;

    @Override
    public void takeCard(CardBJ cardBJ) {
        for (CardBJ c: cardsOnHand) {
            if (c == null) {
                c = cardBJ;
                break;
            }
        }
    }

    @Override
    public int countValuesAllCardsOnHand() {
        int result = 0;
        for (CardBJ c: cardsOnHand) {
            if (c != null) {
                result += c.getValue();
            }
        }
        return result;
    }

    @Override
    public boolean needCard() {
        System.out.println("---------------Ваши карты ----------------");
        this.showCardsOnHand();
        System.out.println("У вас на руках сейчас столько очков: ");
        System.out.println(this.countValuesAllCardsOnHand());
        System.out.println("Нужна ли Вам еще карта? ");
        System.out.println("Если нужна введите да, если нет, просто нажмите Enter");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        if (answer.equalsIgnoreCase("да")) {
            return true;
        }
        return false;
    }

    @Override
    public void showCardsOnHand() {
        for (CardBJ c: cardsOnHand) {
            if (c != null) {
                c.printCard();
            }
        }
    }

    @Override
    public boolean isInGame() {
        return true;
    }

    public void setInGame(boolean inGame) {
        this.inGame = inGame;
    }
}
