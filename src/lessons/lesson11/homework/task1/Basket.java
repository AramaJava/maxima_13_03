package lessons.lesson11.homework.task1;

public class Basket {
    // Создать класс Basket, содержащий массив купленных товаров.
    private Product [] arrayOfPurchasedProducts;

    public Product[] getArrayOfPurchasedProducts() {
        return arrayOfPurchasedProducts;
    }

    public void setArrayOfPurchasedProducts(Product[] arrayOfPurchasedProducts) {
        this.arrayOfPurchasedProducts = arrayOfPurchasedProducts;
    }
}
