import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        int yearNow = 2024;
        System.out.print("Введіть ваш вік: ");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        System.out.printf("Ваш рік народження: %s", yearNow - age);
    }
}