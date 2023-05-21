package lessons.lesson12b;

public class Dealer extends Person {
    public Dealer() {
        super.setName("Dealer");
    }

    public void printFirstHand() {
        System.out.println("Карты крупье: ");
        System.out.println("1 карта: " + super.getHand().getCard(0));
        System.out.println("2 карта крупье скрыта");
        System.out.println("-----------------");
    }
}
