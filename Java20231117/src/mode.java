import java.util.Arrays;
import java.util.Random;

public class mode {
    public static void main(String[] args) {
        int[] array = new int[100];
        int[] frequincies = new int[array.length];
        Random random = new Random();
        int currentIndex = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = Math.abs(random.nextInt() % (array.length));
        }

        System.out.printf("Масив: %s.\n", Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            frequincies[array[i]] = frequincies[array[i]] + 1;
        }

        System.out.printf("Частота: %s.\n", Arrays.toString(frequincies));

        for (int i = 0; i < array.length; i++) {
            if (currentIndex < frequincies[i]) {
                currentIndex = i;
            }
        }

        System.out.printf("Найбільш часте число: %s.", currentIndex);
    }
}