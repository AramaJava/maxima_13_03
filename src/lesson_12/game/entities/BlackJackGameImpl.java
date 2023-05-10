package lesson_12.game.entities;

import lesson_12.game.interfaces.BlackjackGame;
import lesson_12.game.interfaces.DeckOfCards;
import lesson_12.game.interfaces.Player;

public class BlackJackGameImpl implements BlackjackGame {
    Player[] playersInGame = new Player[3];
    DeckOfCards deckOfCards = new DeckOfCardsImpl();

    @Override
    public void addPlayerInGame(Player player) {
        for (int i = 0; i < playersInGame.length; i++) {
            if (playersInGame[i] == null) {
                playersInGame[i] = player;
                break;
            }
        }
    }

    @Override
    public void giveTwoCardsToEachPlayerOnStart() {
        for (Player player : playersInGame) {
            if (player != null) {
         //       player.takeCard(deckOfCards.getCardFromDeck());
         //       player.takeCard(deckOfCards.getCardFromDeck());
            }
        }
    }

    @Override
    public void giveCardIfNeedToPlayer() {
        for (Player player : playersInGame) {
            if (player != null) {
                while (player.needCard()) {
          //          player.takeCard(deckOfCards.getCardFromDeck());
                }
            }
        }
    }

    @Override
    public void printWinner() {
        // отсечь всех игроков, у которых на руках уже больше 21
        for (Player player : playersInGame) {
            if (player != null) {
                if (player.countValuesAllCardsOnHand() > 21) {
                    player.setInGame(false);
                }
            }

            if (countAllPlayersInGame() == 0) {
                System.out.println("Победила игра!");
            }

            if (countAllPlayersInGame() == 1) {
                System.out.println("У нас есть один победитель!");
                for (Player player1 : playersInGame) {
                    if (player != null && player.isInGame()) {
                        player.showCardsOnHand();
                        System.out.println("Выиграл игрок с " + player.countValuesAllCardsOnHand()
                                + "очков на руках!");
                    }

                }

            }
        }

    }

    @Override
    public int setCountOfPlayer() {
        return 0;
    }

    @Override
    public int countAllPlayersInGame() {
        return 0;
    }
}