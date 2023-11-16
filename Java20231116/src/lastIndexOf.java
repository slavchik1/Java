import java.util.Scanner;

public class lastIndexOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        int lastIndex = 0;

        for (int i = 0; i < 10; i++) {
            System.out.printf("Введіть %s-е ціле число.\n", i+1);
            numbers[i] = scanner.nextInt();
        }

        System.out.println("Введіть ціле число.");
        int k = scanner.nextInt();

        for (int i = 0; i < 10; i++) {
            if(numbers[i] == k) {
                lastIndex = i;
            }
        }

        System.out.print(lastIndex);
    }
}