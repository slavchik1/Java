import java.util.ArrayList;

public class Task4 {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();

        cities.add("Київ");
        cities.add("Житомир");
        cities.add("Павлоград");
        cities.add("Одеса");
        cities.add("Олександрія");

        String t = cities.get(4);
        cities.set(4, cities.get(0));
        cities.set(0, t);

        cities.remove(2);

        System.out.printf("Перший елемент: %s\n", cities.get(0));
        System.out.printf("Останній елемент: %s\n", cities.get(cities.size() - 1));
        System.out.printf("Загальна кількість елементів: %s\n", cities.size());
    }
}
