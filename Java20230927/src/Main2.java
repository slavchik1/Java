import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть число: ");
        int a = scanner.nextInt();

        if (a >= 50 && a <= 100) {
            System.out.printf("Число %s попадає в інтервал", a);
        } else {
            System.out.printf("Число %s не попадає в інтервал", a);
        }

        scanner.close();
    }
}