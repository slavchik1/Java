class Bicycle extends Vehicle {
    public Bicycle(String name) {
        super(name);
    }

    // TODO: реалізуйте move() (наприклад "Bicycle <name> is pedaling")
    @Override
    public void move() {
        System.out.printf("Bicycle %s is pedaling\n", name);
    }
}
