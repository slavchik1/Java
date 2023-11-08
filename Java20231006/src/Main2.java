import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть число: ");
        int n = scanner.nextInt();

        int j = n;
        int ii = n;

        System.out.println();

        for (int i = n; i > 0; i--) {
            System.out.println(i);
        }

        System.out.println();
        System.out.print("__________________________________________________");
        System.out.println();
        System.out.println();

        while (j > 0) {
            System.out.println(j);
            j--;
        }

        System.out.println();
        System.out.print("__________________________________________________");
        System.out.println();
        System.out.println();

        do {
            System.out.println(ii);
            ii--;
        } while (ii > 0);
    }
}