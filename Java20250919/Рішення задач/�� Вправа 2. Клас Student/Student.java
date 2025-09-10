class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printInfo() {
        System.out.printf("Ім'я: %s, Вік: %s", name, age);
    }
}