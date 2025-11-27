public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Bicycle bicycle = new Bicycle();
        Vehicle[] vehicles = {car, bicycle};

        for (int i = 0; i < vehicles.length; i++) {
            vehicles[i].move();
        }
    }
}