class Car extends Vehicle {

    int doors;
    public Car(String brand, String model, int doors) { super(brand, model);
        this.doors = doors; }
    public void honk() { System.out.println("Beep-beep!"); }
}
