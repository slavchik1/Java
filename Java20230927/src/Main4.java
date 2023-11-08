import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть час (у хвилинах): ");
        float a = scanner.nextFloat();
        float b = a % 5;
        String c;

        if (b <= 3) {
            c = "зелений";
        } else if (b > 3 && b < 4) {
            c = "жовтий";
        } else {
            c = "червоний";
        }

        System.out.printf("Колір світлофора: %s", c);

        scanner.close();
    }
}