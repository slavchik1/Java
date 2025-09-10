public class Main {
    public static int sumArray(int[] arr) {
        int sum = 0;

        for (int i : arr) {
            sum += i;
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] nums = {5, 10, 15};
        System.out.println("Сума: " + sumArray(nums)); // має вивести 30
    }
}