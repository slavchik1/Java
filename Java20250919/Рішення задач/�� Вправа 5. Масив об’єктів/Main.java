public class Main {
    public static void main(String[] args) {
        Student[] group = new Student[3];
        group[0] = new Student("Олег", 15);
        group[1] = new Student("Марія", 14);
        group[2] = new Student("Іван", 15);

        for (int i = 0; i < group.length; i++) {
            System.out.println(group[i].name);
        }
    }
}

