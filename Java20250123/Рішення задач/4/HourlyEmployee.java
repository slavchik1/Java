public class HourlyEmployee extends Employee {
    private final double hourlyRate;
    private final double hours;

    public HourlyEmployee(String name, double hourlyRate, double hours) {
        super(name);
        this.hourlyRate = hourlyRate;
        this.hours = hours;
    }

    public double calculateSalary() {
        return this.hourlyRate * this.hours;
    }
}
