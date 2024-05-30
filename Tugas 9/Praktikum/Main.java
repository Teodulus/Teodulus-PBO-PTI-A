public class Main {
    public static void main(String[] args) {
        Invoice[] invoices = {
                new Invoice("Pen", 10, 500),
                new Invoice("Notebook", 5, 2000)
        };
        Employee employee = new Employee(1, "John Doe", 50000, invoices);

        employee.displayEmployeeDetails();
    }
}
