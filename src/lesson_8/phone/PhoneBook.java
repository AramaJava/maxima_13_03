package lesson_8.phone;


import java.util.Objects;
import java.util.Scanner;

public class PhoneBook {
    //fields
    Contact[] contacts = new Contact[100];

    //constructor
    public PhoneBook() {
    }
//methods

    public Contact[] getContacts() {
        return contacts;
    }

    public void setContacts(Contact[] contacts) {
        this.contacts = contacts;
    }

    public Contact searchContact(String nameOfContact) {
        for (Contact contact : contacts) {
            if (Objects.equals(contact.getName(), nameOfContact)) {
                return contact;
            }
        }
        return null;
    }

    public void deleteContact(String nameOfContact) {
        for (int i = 0; i < contacts.length; i++) {
            if (Objects.equals(contacts[i].getName(), nameOfContact)) {
                contacts[i] = null;
                break;
            }
        }

    }

    public Contact editContact(String searchName, String newNameOfContact) {
        for (Contact contact : contacts) {
            if (Objects.equals(contact.getName(), searchName)) {
                contact.setName(newNameOfContact);
                break;
            }
        }
        return null;
    }

    public void addContact(Contact contact) {
        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i] == null) {
                contacts[i] = contact;
                break;
            }
        }
    }

    /*
    2 - Задачи

1    Напишите метод, с помощью которого можно было бы возводить число, переданное в сигнатуру метода, в куб.

*/

    public int exp3(int num) {
        return num*num*num;
    }

    /*
2    Напишите метод, который бы возвращал в консоль:
       true, если число больше 5
       и false, если число меньше 5
*/
    public boolean isNumberGreater5(int num) {
        return num>5;
    }

    /*
3    Необходимо написать метод, который бы возвращал из 2 чисел меньшее число. Например, из двух чисел 7 и 3 метод должен вывести в консоль 3.
    */
    public int lesserNum(int x, int y) {
        return Math.min(x, y);
    }

    /*
4    Необходимо написать метод, который бы возводил число в квадрат. И далее два числа, возведенные в квадрат, должны быть просуммированы, а результат выведены в консоль.
*/
    public void SuperOperation (int x, int y) {
        int result = x*x + y*y;
        System.out.println(result);
    }

    /*
5   Условие задачи:
    Необходимо написать простой консольный калькулятор на Java.

    Метод int getInt() - должен считывать с консоли целое число и возвращать его
    Метод char getOperation() - должен считывать с консоли какое-то значение и возвращать символ с операцией (+, -, * или /)
    Метод int calc(int num1, int num2, char operation) - должен выполнять над числами num1 и num2 арифметическую операцию, заданную operation.
    Метод main() - должен считывать 2 числа (с помощью getInt()), считать операцию (с помощью getOperation(), передать все методу calc() и вывести на экран результат.

*/


    public int getInt() {
        System.out.print("Введите число: ");
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }

    public char getOperation() {
        System.out.print("Введите операцию: ");
        Scanner scan = new Scanner(System.in);
        return scan.next().charAt(0);

    }

    public void calc(int num1, int num2, char operation) {
        int res = 0;
        switch (operation) {
            case '*' -> res = num1 * num2;
            case '+' -> res = num1 + num2;
            case '-' -> res = num1 - num2;
            case '/' -> res = num1 / num2;
            default -> System.out.println("Не понятная операция!");
        }
        System.out.printf("Результат операции %s", res);
    }



}
