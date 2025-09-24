public class Main {
    public static void main(String[] args) {
        Animal d = new Dog("Rex");
        Animal c = new Cat("Murka");

        d.makeSound();
        c.makeSound();
        d.sleep();
    }
}
