public class Main {
    public static void main(String[] args) {
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Ivan", 38, 578);
        SalariedEmployee salariedEmployee = new SalariedEmployee("Vasya", 47916);

        System.out.printf("ЗП робітника, який працює погодинно: %s\n", hourlyEmployee.calculateSalary());
        System.out.printf("ЗП робітника, який працює на фіксованій місічній зарплаті: %s\n", salariedEmployee.calculateSalary());
    }
}
