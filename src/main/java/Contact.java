import java.util.Objects;

public class Contact {
    String name;
    String phone;

    public Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }
    @Override
    public String toString() {
        return "Имя: " + name + ", телефон: " + phone + "\n";
    }

    public String getName() {
        return name;
    }
    public String getPhone(){
        return phone;
    }
}
