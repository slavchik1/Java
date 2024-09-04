public class Main5 {
    public static void main(String[] args) {
        int i = 1;
        int a = 0;
        while (i <= 100) {
            a += i;
            i++;
        }
        System.out.printf("Сума всіх чисел від 1 до 100: %s", a);
    }
}