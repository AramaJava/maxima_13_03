package lessons.lesson16;

import java.util.HashMap;

public class Fridge {
    // Fields
    private HashMap<String, Integer> prodList = new HashMap<>();

    public void putProducts(String productName, int weight) {
        if (prodList.containsKey(productName)) {
            prodList.replace(productName, prodList.get(productName) + weight);
        } else {
            prodList.put(productName, weight);
        }
    }

    public void weightProduct(String prodname) {
        if (prodList.containsKey(prodname)) {
            System.out.println(prodList.get(prodname));
        } else {
            System.out.println(prodname + " нет в холодильнике!");
        }
    }

    public void takeProduct(String prodname, int count) {
        // если такого продукта нет в холодильнике
        if (!prodList.containsKey(prodname)) {
            System.out.println(prodname + " нет в холодильнике! Сначала положи!");
            return;
        }
        // если этого продукта не хватает
        if (prodList.get(prodname) < count) {
            System.out.println(prodname + " есть только " + prodList.get(prodname));
            System.out.println("Отдаю тебе " + prodList.get(prodname) + " " + prodname);
            prodList.remove(prodname);
            return;
        } else if (prodList.get(prodname) == count) {
            // если этого продукта ровно столько
            System.out.println("Отдаю тебе " + prodList.get(prodname) + " " + prodname);
            prodList.remove(prodname);
            return;
        } else {
            System.out.println("Отдаю тебе " + count + " " + prodname);
            prodList.put(prodname, prodList.get(prodname) - count);

        }

    }
}