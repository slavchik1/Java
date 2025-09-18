class Device {
    String brand;
    String model;

    public Device(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void turnOn() {
        System.out.println(brand + " " + model + " is turning on.");
    }
}
