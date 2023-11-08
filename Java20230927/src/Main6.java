import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть рік: ");
        int y = scanner.nextInt();

        if (y % 4 == 0) {
            System.out.println("Цей рік є високосним");
        } else {
            System.out.println("Цей рік не є високосним");
        }

        scanner.close();
    }
}