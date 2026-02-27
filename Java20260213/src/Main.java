import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();
        try {
            int n = Integer.parseInt(s);
        } catch (NumberFormatException e) {
            System.out.println("Помилка: введено не число");
        } finally {
            System.out.println("Програма завершена");
        }
    }
}

