import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int j = 0;
        int ii = 0;

        System.out.print("Введіть число: ");
        int n = scanner.nextInt();

        System.out.println();

        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }

        System.out.println();
        System.out.print("__________________________________________________");
        System.out.println();
        System.out.println();

        while (j < n) {
            System.out.println(j);
            j++;
        }

        System.out.println();
        System.out.print("__________________________________________________");
        System.out.println();
        System.out.println();

        do {
            System.out.println(ii);
            ii++;
        } while (ii < n);
    }
}