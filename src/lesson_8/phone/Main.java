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

        System.out.println(phoneBook.exp3(5));
        System.out.println(phoneBook.isNumberGreater5(6));
        System.out.println(phoneBook.lesserNum(7,3));
        phoneBook.SuperOperation(7,3);

//  Метод main() - должен считывать 2 числа с помощью getInt()),
//  считать операцию (с помощью getOperation(),
//  передать все методу calc() и вывести на экран результат.

        int a = phoneBook.getInt();
        int b = phoneBook.getInt();
        char c = phoneBook.getOperation();
        phoneBook.calc(a,b,c);

    }
}
