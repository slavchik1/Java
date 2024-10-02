import java.util.Scanner;

public class Main5 {
    private static double max(double a, double b) {
        if (a > b) {
            return a;
        } else return b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        if (max(a, b) > c) {
            System.out.println(max(a, b));
        } else System.out.println(c);

    }
}