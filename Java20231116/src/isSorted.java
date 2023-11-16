import java.util.Scanner;

public class isSorted {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        String isTrue = "True";

        for (int i = 0; i < 10; i++) {
            System.out.printf("Введіть %s-е ціле число.\n", i+1);
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < 9; i++) {
            if(array[i] >= array[i + 1]) {
                isTrue = "False";
                break;
            }
        }

        System.out.print(isTrue);
    }
}