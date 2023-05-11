package lessons.lesson12;

import java.util.Scanner;

public class BlackJackUI {
    public static void main(String[] args) {
        new BlackJack(new Scanner(System.in), new Desk(CardsAmount.CARDS_52)).start();
    }
}
