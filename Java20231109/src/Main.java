import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть кількість днів: ");
        int numberOfDays = scanner.nextInt();
        scanner.nextLine();

        String[] array = new String[numberOfDays];

        System.out.printf("Введіть %s найбільших температур температуру протягом дня (°C) \n", numberOfDays);

        for (int i = 0; i < numberOfDays; i++) {
            array[i] = scanner.nextLine();
        }

        float allArrayElementsAdditionResult = 0;

        for (int i = 0; i < numberOfDays; i++) {
            allArrayElementsAdditionResult += Float.parseFloat(array[i]);
        }

        float avergeTemperature = allArrayElementsAdditionResult / numberOfDays
        int numberOfDaysWhereDayTemperatureWasBiggerThanAvergeTemperature = 0;

        for (int i = 0; i < numberOfDays; i++) {
            if(Float.parseFloat(array[i]) > avergeTemperature) {
                numberOfDaysWhereDayTemperatureWasBiggerThanAvergeTemperature++;
            }
        }

        System.out.printf("Середня температура: %s\nКількість днів де температура була більше середньої: %s", avergeTemperature, numberOfDaysWhereDayTemperatureWasBiggerThanAvergeTemperature);
    }
}