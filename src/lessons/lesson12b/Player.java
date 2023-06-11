package lessons.lesson12b;

import java.util.Scanner;

public class Player extends Person {
    private Scanner input = new Scanner(System.in);

    public Player(String playerName) {
        super.setName(playerName);
    }

    public void makeDecision(Deck deck, Deck discard) {
        int decision = 0;
        boolean getNum = true;

        while (getNum) {
            try {
                System.out.println("Игрок " + this.getName() + " введите 1 чтобы взять карту, 2 - пас.");
                decision = input.nextInt();
                getNum = false;
            } catch (Exception e) {
                System.out.println("Некорректный ввод!");
                input.next();
            }
        }
        if (decision == 1) {
            this.hit(deck, discard);
            if (this.getHand().calculatedValue() > 20) {
                return;
            } else {
                this.makeDecision(deck, discard);
            }
        } else {
            System.out.println("Вы пас!");
        }

    }

}
