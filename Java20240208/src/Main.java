import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        School gymnasiumAPlus = new School(new String[]{"Саша", "Владік", "Настя", "пані Інна"});
        School thinkGlobal = new School(new String[]{"Ярік", "Артем", "Настя", "Даня"});

        String[] teamGAP = gymnasiumAPlus.getTeam(2);
        String[] teamTG = thinkGlobal.getTeam(3);

        System.out.printf("GAP: %s\n", Arrays.toString(teamGAP));
        System.out.printf("TG: %s\n", Arrays.toString(teamTG));
    }
}
