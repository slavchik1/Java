import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть пароль.\n");
        String password = scanner.nextLine();

        if(PasswordValidator.passwordValidator(password)) {
            System.out.println("✅");
        } else {
            System.out.println("❌");
        }
    }
}
