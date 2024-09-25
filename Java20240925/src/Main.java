public class Main {
    public static void main(String[] args) {
        System.out.println(isPolendrome("АННА"));
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static void mul() {

    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n*factorial(n-1);
        }
    }

    public static boolean multiplicityСheck(int n) {
        return n % 2 == 0;
    }

    public static double multiplication(double a, double b) {
        return a * b;
    }

    public static int[] arrayReverse(int[] array) {
        int[] reversedArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            reversedArray[i] = array[array.length - i];
        }

        return reversedArray;
    }

    public static boolean isPolendrome(String phrase) {
        for (int i = 0; i < phrase.length(); i++) {
            return (phrase[i] != phrase[phrase.length() - i]) {
                return false;
            }
        }
        return true;
    }

    public static int[] Fibonachchi(int i) {
        int[] array = new int[i];

        for (int j = 0; j < i; j++) {
            //
        }
    }
}
