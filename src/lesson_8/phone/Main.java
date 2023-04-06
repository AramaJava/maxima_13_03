package lesson_8.phone;

public class Main {
    public static void main(String[] args) {


        Contact vasya = new Contact("vasiliy", "89322520062", "test1@mail.ru");
        Contact nadya = new Contact("nadya", "89322520062", "test2@mail.ru");
        Contact petya = new Contact("petya", "89322520062", "test3@mail.ru");
        Contact olga = new Contact("olga", "89322520062", "test4@mail.ru");
        Contact vova = new Contact("vova", "89322520062", "test5@mail.ru");

        PhoneBook phoneBook = new PhoneBook();

        phoneBook.addContact(vasya);
        phoneBook.addContact(nadya);
        phoneBook.addContact(petya);
        phoneBook.addContact(olga);
        phoneBook.addContact(vova);

        Contact searchResult = phoneBook.searchContact("vova");
        if (searchResult != null) {
            System.out.printf(searchResult.getName());
        }


        phoneBook.editContact(olga.getName(), "Княгиня Ольга");

        phoneBook.deleteContact("vasiliy");

    }
}
