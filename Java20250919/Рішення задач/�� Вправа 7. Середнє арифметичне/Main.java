import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] numers = new int[5];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numers.length; i++) {
            numers[i] = scanner.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < numers.length; i++) {
            sum += numers[i];
        }

        float ans = sum;
        ans /= 5;

        System.out.println(ans);
    }
}
