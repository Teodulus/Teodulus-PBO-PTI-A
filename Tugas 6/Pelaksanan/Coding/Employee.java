import java.util.Date;

public class Employee {
    private String name;
    private double salary;
    private Date hireDay;

    public Employee(String name) {
        this.name = name;
        this.salary = 0;
        this.hireDay = new Date();
    }

    public Employee(String name, double salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;
        this.hireDay = new Date(year, month - 1, day);
    }

    public Date getHireDay() {
        return hireDay;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }
}
