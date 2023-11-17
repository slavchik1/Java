import java.util.Arrays;
import java.util.Random;

public class evenBeforeOdd {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = Math.abs(random.nextInt() % (array.length));
        }

        System.out.printf("Масив: %s.\n", Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 == 0) {
                for (int j = 0; j < array.length; j++) {
                    if(array[j] % 2 != 0) {
                        int buff = array[i];
                        array[i] = array[j];
                        array[j] = buff;
                    }
                }
            }
        }

        System.out.printf("Відфармотований масив: %s.", Arrays.toString(array));
    }
}