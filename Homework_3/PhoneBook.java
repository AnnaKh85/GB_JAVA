import java.util.ArrayList;
import java.util.List;

/**
 * ТелефонныйСправочник
 */
public class PhoneBook {
    private class BookRecord {
        public String lastName;
        public String phoneNumber;

        public BookRecord(String lastName, String phoneNumber) {
            this.lastName = lastName;
            this.phoneNumber = phoneNumber;
        }
    }

    private List<BookRecord> list = new ArrayList<>();

    /**
     * с помощью метода add() можно добавлять записи
     */
    public void add(String lastName, String phoneNumber) {
        list.add(new BookRecord(lastName, phoneNumber));
    }

    /**
     * С помощью метода get() искать номер телефона по фамилии.
     * Следует учесть, что под одной фамилией может быть несколько телефонов
     */
    public List<String> get(String lastName) {
        List<String> result = new ArrayList<>();
        if (lastName == null || lastName.isEmpty()) {
            return result;
        }

        for (BookRecord b: list) {
            if (lastName.equalsIgnoreCase(b.lastName)) {
                result.add(b.phoneNumber);
            }
        }

        return result;
    }

    public static void main(String[] params) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("John", "33344");
        phoneBook.add("Peter", "344");
        phoneBook.add("Philipp", "344");
        phoneBook.add("Philipp", "122");

        List<String> strings = phoneBook.get("Philipp");
        System.out.println(strings);
    }

}
