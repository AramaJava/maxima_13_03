package lessons.lesson14;

import java.util.HashSet;
import java.util.Iterator;

public class Numismatic {
    public static void main(String[] args) {

        Coin coin1 = new Coin(2, 20.2, "Russia", 2001);
        Coin coin2 = new Coin(2, 20.2, "Belarus", 2001);
        Coin coin3 = new Coin(2, 20.2, "England", 2001);
        Coin coin4 = new Coin(2, 20.2, "Spain", 2001);
        Coin coin5 = new Coin(2, 20.2, "England", 2001);

        HashSet<Coin> coinCollection = new HashSet<>();
        coinCollection.add(coin1);
        coinCollection.add(coin2);
        coinCollection.add(coin3);
        coinCollection.add(coin4);
        coinCollection.add(coin5);

        for (Iterator<Coin> iter = coinCollection.iterator(); iter.hasNext();) {
            System.out.println(iter.next());
        }

        System.out.println("");
    }
}