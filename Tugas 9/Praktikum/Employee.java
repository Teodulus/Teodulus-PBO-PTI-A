public class Employee implements Payable {
    private int registrationNumber;
    private String name;
    private int salaryPerMonth;
    private Invoice[] invoices;

    public Employee(int registrationNumber, String name, int salaryPerMonth, Invoice[] invoices) {
        this.registrationNumber = registrationNumber;
        this.name = name;
        this.salaryPerMonth = salaryPerMonth;
        this.invoices = invoices;
    }

    @Override
    public int getPayableAmount() {
        int totalInvoiceAmount = 0;
        for (Invoice invoice : invoices) {
            totalInvoiceAmount += invoice.getPayableAmount();
        }
        return salaryPerMonth - totalInvoiceAmount;
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee Details:");
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Name: " + name);
        System.out.println("Base Salary: " + salaryPerMonth);
        System.out.println("Net Salary After Invoices: " + getPayableAmount());
        System.out.println("Invoices:");
        for (Invoice invoice : invoices) {
            System.out.printf("  Product: %s, Quantity: %d, Price per Item: %d, Total Cost: %d\n",
                    invoice.getProductName(), invoice.getQuantity(), invoice.getPricePerItem(),
                    invoice.getPayableAmount());
        }
    }
}
