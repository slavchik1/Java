import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.printf("%.2f\n", a / b);
    }
}