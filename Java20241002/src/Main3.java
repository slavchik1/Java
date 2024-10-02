import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println(n - i);
        }

        System.out.println();

        if (n % 3 == 0) {
            System.out.print("Fizz");
            if (n % 5 == 0) {
                System.out.print("Bizz");
            }
        } else if (n % 5 == 0) {
            System.out.print("Bizz");
        } else {
            System.out.print(n);
        }
    }
}