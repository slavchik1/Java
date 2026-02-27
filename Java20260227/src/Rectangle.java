public class Rectangle extends Shape {
    final private double width;
    final private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return this.width * this.height;
    }

    @Override
    public void print() {
        System.out.printf("Квадрат із такими характеристиками:\nВисота: %s\nШирина: %s\nПлоща: %s\n", this.width, this.height, getArea());
    }
}
