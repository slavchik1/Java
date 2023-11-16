import java.util.Scanner;
import java.util.Arrays;

public class allIndexesOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        int[] allIndexes = new int[10];
        String isThereAreAnyNumbersInNumbersArrayWhoEqualsToKVariableAndIfYesThisVariavleEqualsToNull = "null";

        for (int i = 0; i < 10; i++) {
            System.out.printf("Введіть %s-е ціле число.\n", i+1);
            numbers[i] = scanner.nextInt();
        }

        System.out.println("Введіть ціле число.");
        int k = scanner.nextInt();

        for (int i = 0; i < 10; i++) {
            if(numbers[i] == k) {
                allIndexes[i] = numbers[i];
                isThereAreAnyNumbersInNumbersArrayWhoEqualsToKVariableAndIfYesThisVariavleEqualsToNull = "";
            }
        }

        System.out.print(Arrays.toString(allIndexes));
        System.out.print(isThereAreAnyNumbersInNumbersArrayWhoEqualsToKVariableAndIfYesThisVariavleEqualsToNull);
    }
}

// Зробив що якщо ≠k, то =0.