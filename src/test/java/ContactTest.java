import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static junit.framework.Assert.assertTrue;
import static junit.framework.TestCase.*;
import static junit.framework.TestCase.assertEquals;

public class ContactTest {

    @Test
    public void createContactTest() {
        // given:
        String name = "Sarah";
        String phone = "12345678";
        // when:
        Contact contact = PhoneBook.createContact(name, phone);
        // then:
        assertEquals("12345678", contact.phone);
    }

    @Test
    public void addGroupTest() {
        // given:
        String group = "Семья";
        PhoneBook phoneBook = new PhoneBook();
        // then:
        assertTrue(phoneBook.addGroup(group));
    }

    @Test
    public void getContactByPhoneTest() {
        PhoneBook phoneBook = new PhoneBook();
        Contact contact = new Contact("Andrew", "11111111");
        phoneBook.addContact(contact, "Семья");
        Contact contactGetted = phoneBook.getContactByPhone("11111111");
        assertEquals("Andrew", contact.getName());
    }
}
