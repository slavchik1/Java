import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        if (a % 2 == 0) {
            System.out.println("Число парне");
        } else {
            System.out.println("Число непарне");
        }
    }
}