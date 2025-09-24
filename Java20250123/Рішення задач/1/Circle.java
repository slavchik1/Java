class Circle extends Shape {
    private double radius;
    private double π = 3.1415926535;

    public Circle(double radius) {
        this.radius = radius;
    }

    // TODO: реалізуйте метод area()
    @Override
    public double area() {
        return π * Math.pow(radius, 2);
    }
}
