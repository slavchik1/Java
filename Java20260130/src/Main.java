import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> students = new HashMap<>();
        students.put("Вася", 11);
        students.put("Маша", 10);
        students.put("Сєрьоґа", 9);
        students.put("Дональд", 10);
        students.put("Ян", 8);
        students.put("Єн", 9);
        students.put("Стрінґкій", 10);

        System.out.println("Усі учні:");

        for (Map.Entry<String, Integer> entry : students.entrySet()) {
            System.out.printf("%s - %s\n", entry.getKey(), entry.getValue());
        }

        System.out.println("Усі учні чия оцінка більша або дорівнює 10:");

        for (Map.Entry<String, Integer> entry : students.entrySet()) {

            if (entry.getValue() >= 10) {
                System.out.println(entry.getKey());
            }
        }
    }
}
