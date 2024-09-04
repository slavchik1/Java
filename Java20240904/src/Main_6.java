
import java.util.Scanner;

public class Main_6 {
    public static void main(String[] args) {
        int a = 1;
        System.out.print("Введіть число: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            a *= i;
        }
        System.out.printf("%s! = %s", n, a);
    }
}