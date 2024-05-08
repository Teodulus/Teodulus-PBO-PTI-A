import java.time.LocalDate;

public class SalariedEmployee extends Employee {
    private double weeklySalary;

    public SalariedEmployee(String name, String noKTP, LocalDate birthDate, double salary) {
        super(name, noKTP, birthDate);
        setWeeklySalary(salary);
    }

    public void setWeeklySalary(double salary) {
        weeklySalary = salary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    @Override
    public double earnings() {
        return getWeeklySalary();
    }

    @Override
    public String toString() {
        return String.format("Salaried employee:\n%s\nWeekly salary: %.2f", super.toString(), getWeeklySalary());
    }
}
