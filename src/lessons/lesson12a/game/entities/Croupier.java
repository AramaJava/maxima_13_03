package lessons.lesson12a.game.entities;

public class Croupier extends PlayerImpl {
    public Croupier(String name, boolean inGame) {
        super(name, inGame);
    }

    @Override
    public boolean needCard() {
        if(countValuesAllCardsOnHand() >= 17) {
            return false;
        }
        return true;
    }
}
