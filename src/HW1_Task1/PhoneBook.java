package HW1_Task1;

import java.util.HashMap;

// Не знаю зачем, но создал новый класс для HashMapы...
public class PhoneBook {
    HashMap<String, String> phoneBook = new HashMap<>();

    public void addPhoneNumber(String nameAndSurname, String phoneNumber) {
        phoneBook.put(nameAndSurname, phoneNumber);
    }

    @Override
    public String toString() {
        return phoneBook.toString();
    }
}
