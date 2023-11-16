import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.printf("Введіть %s-е ціле число.\n", i+1);
            array[i] = scanner.nextInt();
        }

        System.out.println("Введіть ціле число.");
        int n = scanner.nextInt();

        for (int i = 0; i < 10; i++) {
            if(array[i] > n-1) {
                System.out.printf("%s ", array[i]);
            }
        }
    }
}