class Car extends Vehicle {
    public Car(String name) {
        super(name);
    }

    // TODO: реалізуйте move() (наприклад "Car <name> is driving")
    @Override
    public void move() {
        System.out.printf("Car %s is driving\n", name);
    }
}