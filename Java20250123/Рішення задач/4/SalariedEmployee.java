public class SalariedEmployee extends Employee {
    private final double fixedMonthlySalary;

    public SalariedEmployee(String name, double fixedMonthlySalary) {
        super(name);
        this.fixedMonthlySalary = fixedMonthlySalary;
    }

    public double calculateSalary() {
        return this.fixedMonthlySalary;
    }
}
