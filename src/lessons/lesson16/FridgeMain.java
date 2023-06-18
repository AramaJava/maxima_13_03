package lessons.lesson16;

public class FridgeMain {
    public static void main(String[] args) {
        Fridge fridge = new Fridge();

        fridge.putProducts("Apple", 5);
        //fridge.putProducts("Apple", 10);
        fridge.putProducts("Bananas", 3);
        fridge.putProducts("Qiwi", 1);

        fridge.takeProduct("Sugar", 5);
        fridge.weightProduct("Apple");
        fridge.takeProduct("Apple", 10);
    }

}
