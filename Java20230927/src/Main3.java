import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть число: ");
        int a = scanner.nextInt();

        if (a > 0) {
            a *= 2;
        } else if (a < 0) {
            a += 1;
        }

        System.out.printf("Ваше число: %s", a);

        scanner.close();
    }
}