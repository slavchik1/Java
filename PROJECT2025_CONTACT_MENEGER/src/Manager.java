import java.util.ArrayList;
import java.util.Objects;


public class Manager {
    ArrayList<Contact> contacts = new ArrayList<>();


    public void add_new_contact(String type, String name, int phone_number) {
        if (Objects.equals(type, "Friend")) {
            contacts.add(new Friend(name, phone_number));
        } else if (Objects.equals(type, "Relative")) {
            contacts.add(new Relative(name, phone_number));
        } else if (Objects.equals(type, "Colleague")) {
            contacts.add(new Colleague(name, phone_number));
        } else {
            System.out.println("ПОМИЛКА: НЕПРАВАЛЬНИЙ ТИП КОНТАКТУ. КОНТАКТ НЕ ДОДАНО. ЄДИНІ ПРАВИЛЬНІ ТИПУ КОНТАКТУ: Friend, Relative, Colleague.");
        }
    }


    public int search_by_name(String name) {
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).name == name) {
                return i;
            }
        }
        System.out.println("ПОМИЛКА: ІМʼЯ НЕ ЗНАЙДЕНО. ФУНКЦІЯ search_by_name() ПОВЕРНУЛА -1.");
        return -1;
    }


    public void delete(int index) {
        if (0 >= index || index < contacts.size()) {
            contacts.remove(index);
        } else {
            System.out.printf("ПОМИЛКА: ІНДЕКС ПОЗА ДІАПАЗОНОМ ВІД 0 ДО %s. НІЧОГО НЕ ВИДАЛЕНО.", contacts.size() - 1);
        }
    }


    public ArrayList<Contact> filter(String type) {
        if (Objects.equals(type, "Friend") || Objects.equals(type, "Relative") || Objects.equals(type, "Colleague")) {
            ArrayList<Contact> filtered = new ArrayList<>();
            for (Contact contact : this.contacts) {
                if (Objects.equals(contact.getType(), type)) {
                    filtered.add(contact);
                }
            }
            return filtered;
        } else {
            System.out.println("ПОМИЛКА: НЕПРАВАЛЬНИЙ ТИП КОНТАКТУ. ЄДИНІ ПРАВИЛЬНІ ТИПУ КОНТАКТУ: Friend, Relative, Colleague.");
        }
        return null;
    }


    public void print_all_contacts() {
        System.out.println("Список всіх контактів:");
        System.out.println(contacts.toString());
    }
}
