public class Car {
    public int year;
    public String brand;

    public Car(int year, String brand) {
        this.year = year;
        this.brand = brand;
    }

    public void getInfo() {
        System.out.printf("Марка: %s, Рік: %s\n", brand, year);
    }
}
