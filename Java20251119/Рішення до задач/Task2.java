import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Шрек");
        names.add("Віслюк");
        names.add("Принц Чармінг");
        names.add("Фіона");


        System.out.println(names.get(1));

        names.set(names.size() - 1, "Updated");

        names.remove(1);

        System.out.println(names);
    }
}
