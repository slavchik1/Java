public class Main {
    public static void main(String[] args) {
        Rectangle[] rectangles = new Rectangle[4];
        rectangles[0] = new Rectangle(2, 5);
        rectangles[1] = new Rectangle(7, 5);
        rectangles[2] = new Rectangle(7, 4);
        rectangles[3] = new Rectangle(2, 8);
        for (Rectangle rectangle : rectangles) {
            System.out.println(rectangle.getArea());
            rectangle.print();
            System.out.println();
        }
    }
}

