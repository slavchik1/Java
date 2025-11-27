import java.util.ArrayList;

public class Task3 {
    public static void main(String[] args) {
        ArrayList<Double> values = new ArrayList<>();

        values.add(0.45567890);
        values.add(0.5672878);
        values.add(46.678973);

        values.set(0, values.get(0) * 2);

        System.out.println(values.get(values.size() / 2));

        values.remove(values.size() - 1);

        System.out.println(values);
    }
}
