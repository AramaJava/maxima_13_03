package lesson_8.phone;


import java.util.Objects;


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
        int i = 0;
        while (contacts[i] != null) {
            if (contacts[i].getName().equalsIgnoreCase(nameOfContact)) return contacts[i];
            i++;
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


}
