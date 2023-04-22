package lesson_11.homework.task1;

public class User {
    // Создать класс User, содержащий логин, пароль и объект класса Basket. Создать объект класса User.
    private String login;
    private String password;
    private Basket userBasket;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Basket getUserBasket() {
        return userBasket;
    }

    public void setUserBasket(Basket userBasket) {
        this.userBasket = userBasket;
    }
}
