import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate birthDate1 = LocalDate.of(1990, 5, 15);
        Employee salariedEmployee = Employee.createEmployee("salaried", "Daniel", "135", birthDate1, 800.00, 0);

        LocalDate birthDate2 = LocalDate.of(1995, 8, 20);
        Employee hourlyEmployee = Employee.createEmployee("hourly", "Karina", "234", birthDate2, 16.75, 40);

        LocalDate birthDate3 = LocalDate.of(1988, 10, 25);
        Employee commissionEmployee = Employee.createEmployee("commission", "Keanu", "145", birthDate3, 10000, 0.06);

        LocalDate birthDate4 = LocalDate.of(1992, 3, 5);
        Employee basePlusCommissionEmployee = Employee.createEmployee("basepluscommission", "Bondan", "234", birthDate4, 5000, 300);

        System.out.println("Employees diproses secara terpisah:\n");

        System.out.printf("%s\n%s: $%,.2f\n\n", salariedEmployee, "Earnings", salariedEmployee.earnings());
        System.out.printf("%s\n%s: $%,.2f\n\n", hourlyEmployee, "Earnings", hourlyEmployee.earnings());
        System.out.printf("%s\n%s: $%,.2f\n\n", commissionEmployee, "Earnings", commissionEmployee.earnings());
        System.out.printf("%s\n%s: $%,.2f\n\n", basePlusCommissionEmployee, "Earnings", basePlusCommissionEmployee.earnings());

        Employee[] employees = {salariedEmployee, hourlyEmployee, commissionEmployee, basePlusCommissionEmployee};

        System.out.println("Employees diproses secara polimorfisme:\n");

        int currentMonth = LocalDate.now().getMonthValue();

        for (Employee currentEmployee : employees) {
            System.out.println(currentEmployee);
            double earnings = currentEmployee.earnings();
            System.out.printf("Earnings: $%,.2f\n", earnings);

            if (currentEmployee instanceof BasePlusCommissionEmployee) {
                BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentEmployee;
                double newBaseSalary = 1.10 * employee.getBaseSalary();
                employee.setBaseSalary(newBaseSalary);
                double newEarnings = employee.earnings();
                System.out.printf("Gaji pokok setelah dinaikkan 10%% : $%,.2f\n", newBaseSalary);
                System.out.printf("Pendapatan setelah dinaikkan: $%,.2f\n\n", newEarnings);
            } else {
                System.out.println();
            }
        }

        for (int j = 0; j < employees.length; j++) {
            System.out.printf("Employee %d = %s\n", j, employees[j].getClass().getName());
        }
    }
}
