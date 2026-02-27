import java.util.Objects;
import java.util.Scanner;


public class Menu {
    public void help() {
        System.out.println("Вітаємо у менеджері контактів");
        System.out.println("Доступні команди:");
        System.out.println();
        System.out.println("1. h у програмі");
        System.out.println("2. a - додати новий контакт");
        System.out.println("3. s - шукати індекс контакту імʼям");
        System.out.println("4. d - видалити контакт за індексом");
        System.out.println("5. dn - видалити контакт за імʼям");
        System.out.println("6. f - відфільтрувати контакти за типом (Friend (друг), Relative (родич), або Colleague (колега))");
        System.out.println("7. p - висести всі контакти");
        System.out.println();
    }


    public void start() {
        Scanner scanner = new Scanner(System.in);
        String currentInput;
        Manager manager = new Manager();

        help();

        while (true) {
            currentInput = scanner.nextLine();

            if (Objects.equals(currentInput, "h")) {
                help();
            } else if (Objects.equals(currentInput, "a")) {
                System.out.println("Введіть тип контакта (Friend, Relative, або Colleague):");
                String type = scanner.nextLine();
                System.out.println("Введіть імʼя контакта:");
                String name = scanner.nextLine();
                System.out.println("Введіть номер телефону контакта:");
                String phone_number = scanner.nextLine();
                manager.add_new_contact(type, name, phone_number);
            } else if (Objects.equals(currentInput, "s")) {
                System.out.println("Введіть імʼя контакта:");
                String name = scanner.nextLine();
                System.out.println(manager.search_by_name(name));
            } else if (Objects.equals(currentInput, "d")) {
                System.out.println("Введіть індекс контакта:");
                int index = scanner.nextInt();
                manager.delete(index);
            } else if (Objects.equals(currentInput, "dn")) {
                System.out.println("Введіть імʼя контакта:");
                String name = scanner.nextLine();
                int ind = manager.search_by_name(name);
                if (ind == -1) {
                    System.out.println("ПОМИЛКА: ІМʼЯ НЕ ЗНАЙДЕНО. КОНТАКТ НЕ ВИДАЛЕНО.");
                } else {
                    manager.delete(ind);
                    System.out.println("Контакт успішно видалено");
                }
            } else if (Objects.equals(currentInput, "f")) {
                System.out.println("Введіть тип контакта (Friend, Relative, або Colleague):");
                String type = scanner.nextLine();
                manager.print_contacts_arraylist(manager.filter(type));
            } else if (Objects.equals(currentInput, "p")) {
                manager.print_all_contacts();
            } else if (Objects.equals(currentInput, "")) {}
            else {
                System.out.printf("ПОМИЛКА: КОМАНДА %s ВІДСУТНЯ. ЯКЩО ПОТРІБНА ДОПОМОГА З ПЕРЕЛІКОМ ВСІХ МОЖЛИВИХ КОМАНД, НАПИШІТЬ h.\n", currentInput);
            }
        }
    }
}
