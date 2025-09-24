class Rectangle extends Shape {
    private double width, height;
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // TODO: реалізуйте метод area()
    @Override
    public double area() {
        return width * height;
    }
}