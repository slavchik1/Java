
//Є абстрактний клас Vehicle з методом move().
//Завдання: реалізуйте move() у класах Car і Bicycle.

public abstract class Vehicle {
    protected String name;

    public Vehicle(String name) {
        this.name = name;
    }

    public abstract void move();
}
