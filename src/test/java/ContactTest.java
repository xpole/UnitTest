import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static junit.framework.Assert.assertTrue;
import static junit.framework.TestCase.*;

public class ContactTest {

    @Test
    public void getNameTest() {
        // given:
        Contact contact = new Contact("Alex", "123456");
        // then:
        assertEquals("Alex", contact.getName());
        assertNotNull(contact.getName());
    }
    @Test
    public void createContactTest(){
        // given:
        String name = "Sarah";
        String phone = "12345678";
        // when:
        Contact contact = PhoneBook.createContact(name, phone);
        // then:
        assertEquals("12345678", contact.phone);
    }
    @Test
    public void initGroupTest (){
        // given:
        PhoneBook phoneBook = new PhoneBook();
        // when:
        Main.initGroup(phoneBook);//добавляем группы "Семья","Коллеги","Друзья"
        // then:
        assertFalse(phoneBook.addGroup("Коллеги"));//нельзя добавить группу с одинаковым названием
        assertTrue(phoneBook.addGroup("Доставка")); // а сдругим названием можно
    }
}
