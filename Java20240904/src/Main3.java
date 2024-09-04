import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        System.out.print("Введіть число: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n == 0) {
            System.out.print("Число є нулем.");
        } else if (n % 2 == 1) {
            System.out.print("Число непарне.");
        } else {
            System.out.print("Число парне.");
        }
    }
}