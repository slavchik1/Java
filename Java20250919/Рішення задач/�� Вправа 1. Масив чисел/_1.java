public class _1 {
    public static void main(String[] args) {
        int[] numbers = {3, 7, 2, 9, 4};
        int max = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("Найбільше число: " + max);
    }
}