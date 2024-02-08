import java.util.Random;

public class School {
    private final String[] students;

    public School(String[] students) {
        this.students = students;
    }

    public String[] getTeam(int n) {
        String[] team = new String[n];

        Random random = new Random();

        for (int i = 0; i < n; i++) {
            team[i] = students[random.nextInt(n - 1)];
        }

        return team;
    }
}
