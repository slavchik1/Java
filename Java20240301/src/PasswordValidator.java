import java.util.Arrays;

public class PasswordValidator {
    private static final String specialSymbols = "!@#$%^&*()_+[];'\"/\\`,./<>?";

    public static boolean passwordValidator(String password) {

        int[] data = new int[]{0, 0, 0, 0};

        if(password.length() < 8) {
            return false;
        }
        for (int i = 0; i < password.length() ; i++) {
            char ch = password.charAt(i);
            System.out.println(ch);
            if (Character.isUpperCase(ch)) data[0]++;
            if (Character.isLowerCase(ch)) data[1]++;
            if (Character.isDigit(ch)) data[2]++;
            if (specialSymbols.contains(ch+"")) data[3]++;
        }
        System.out.printf("--------------");
        for (int info : data) {
            System.out.println(info);
            if (info < 1) return false;
        }
        return false;
    }
}
