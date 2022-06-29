import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    private static void initContacts(PhoneBook phoneBook) {
        phoneBook.addContact(phoneBook.createContact("Eric", "1111"), "Семья");
        phoneBook.addContact(phoneBook.createContact("Sarah", "2222"), "Коллеги", "Семья");
        phoneBook.addContact(phoneBook.createContact("Marta", "333"), "Друзья");
        phoneBook.addContact(phoneBook.createContact("Tom", "4444"), "Друзья", "Коллеги");
    }

    public static void initGroup(PhoneBook phoneBook) {
        phoneBook.addGroup("Семья");
        phoneBook.addGroup("Коллеги");
        phoneBook.addGroup("Друзья");
    }

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        initGroup(phoneBook);
        initContacts(phoneBook);
        System.out.println("Запись для номера телефона 1111: " + phoneBook.getContactByPhone("1111"));
        System.out.println("Все записи для группы \" Коллеги\" ");
        for (Contact contact : phoneBook.getContactsByGroup("Коллеги")) {
            System.out.println(contact);
        }

    }

}
