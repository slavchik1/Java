import java.util.ArrayList;

public class Menu {
    ArrayList<Contact> contacts = new ArrayList<>();

    void add_new_contact(String type, String name, int phone_number) {
        if (type == "Friend") {
            contacts.add(new Friend(name, phone_number));
        } else if (type == "Relative") {
            contacts.add(new Relative(name, phone_number));
        } else if (type == "Colleague") {
            contacts.add(new Colleague(name, phone_number));
        } else {
            System.out.println("ПОМИЛКА: НЕПРАВАЛЬНИЙ ТИП КОНТАКТУ. КОНТАКТ НЕ ДОДАНО. ЄДИНІ ПРАВИЛЬНІ ТИПУ КОНТАКТУ: Friend, Relative, Colleague.");
        }
    }


    int search_by_name(String name) {
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).name == name) {
                return i;
            }
        }
        System.out.println("ПОПЕРЕДЖЕННЯ: ІМʼЯ НЕ ЗНАЙДЕНО. ФУНКЦІЯ search_by_name() ПОВЕРНУЛА -1.");
        return -1;
    }


    void delete(int index) {
        if (0 >= index || index < contacts.size()) {
            contacts.remove(index);
        } else {
            System.out.printf("ПОМИЛКА: ІНДЕКС ПОЗА ДІАПАЗОНОМ ВІД 0 ДО %s. НІЧОГО НЕ ВИДАЛЕНО.", contacts.size());
        }
    }
}
