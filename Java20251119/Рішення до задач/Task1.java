import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        list.set(1, 99);

        list.remove(0);

        System.out.println(list.get(list.size() - 1));

        System.out.println(list);
    }
}