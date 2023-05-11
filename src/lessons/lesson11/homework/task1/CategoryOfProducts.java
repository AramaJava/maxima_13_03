package lessons.lesson11.homework.task1;

public class CategoryOfProducts {
    //  Создать класс Категория, имеющий переменные имя и массив товаров. Создать несколько объектов класса Категория.
    private String name;
    private Product[] arrayOfProducts;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Product[] getArrayOfProducts() {
        return arrayOfProducts;
    }

    public void setArrayOfProducts(Product[] arrayOfProducts) {
        this.arrayOfProducts = arrayOfProducts;
    }
}
