public class Main {
    public static void main(String[] args) {
        Shape c = new Circle(3);
        Shape r = new Rectangle(4, 5);

        System.out.println("Circle area = " + c.area());
        System.out.println("Rectangle area = " + r.area());
    }
}
