import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть темпуратуру у °C: ");
        float c = scanner.nextFloat();
        float f = (c * 9/5) + 32;

        System.out.printf("Температура у у °F: %s", f);

        scanner.close();
    }
}