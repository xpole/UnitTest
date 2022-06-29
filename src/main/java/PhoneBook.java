import java.util.*;

public class PhoneBook {
    //List<Contact> contacts = new ArrayList<Contact>();
    Map<String, List<Contact>> pb = new HashMap<>();

    public boolean addGroup(String group) {
        if (pb.containsKey(group)) {
            return false;
        }
        pb.put(group, new ArrayList<>());
        return true;
    }

    public boolean addContact(Contact contact, String... group) {
        for (String s : group) {
            if (!pb.containsKey(s)) {
                return false;
            }
            List<Contact> contacts = pb.get(s);
            contacts.add(contact);
        }
        return true;
    }

    public List<Contact> getContactsByGroup(String group) {
        return new ArrayList<>(pb.get(group));
    }

    public Contact getContactByPhone(String phone) {
        for (List<Contact> group : pb.values()) {
            for (Contact contact : group) {
                if (contact.getPhone().equals(phone))
                    return contact;
            }
        } return null;
    }

    public static Contact createContact (String name, String phone) {
       return new Contact(name, phone);
    }

    public String toString() {
        return "Группа " + pb.keySet() + " контакты" + pb.values();
            }
}
