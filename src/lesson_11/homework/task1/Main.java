package lesson_11.homework.task1;

public class Main {
    public static void main(String[] args) {
        /*      ЗАДАЧА:
        1

        Создать класс Товар, имеющий переменные имя, цена, рейтинг.
        Создать класс Категория, имеющий переменные имя и массив товаров. Создать несколько объектов класса Категория.
        Создать класс Basket, содержащий массив купленных товаров.
        Создать класс User, содержащий логин, пароль и объект класса Basket. Создать объект класса User.
*/

        Product product1 = new Product();
        product1.setName("Салями Финская");
        product1.setPrice(159.90);
        product1.setRate(12);

        Product product2 = new Product();
        product1.setName("Докторская");
        product1.setPrice(329.0);
        product1.setRate(11);


        Product product3 = new Product();
        product1.setName("Кефир Дмитрогорский");
        product1.setPrice(59.90);
        product1.setRate(2);


        CategoryOfProducts cat1 = new CategoryOfProducts();
        cat1.setName("Колбасы");
        CategoryOfProducts cat2 = new CategoryOfProducts();
        cat2.setName("Молочные продукты");

        Product[] sausage = new Product[] {product1, product2};
        Product[] milkProducts = new Product[] {product3};

        cat1.setArrayOfProducts(sausage);
        cat2.setArrayOfProducts(milkProducts);


        Basket basket1 = new Basket();
        Product[] PurchasedProducts = new Product[] {product1, product2};
        basket1.setArrayOfPurchasedProducts(PurchasedProducts);

        User buyer = new User();
        buyer.setLogin("pokupatel1");
        buyer.setPassword("1234");
        buyer.setUserBasket(basket1);
    }
}
