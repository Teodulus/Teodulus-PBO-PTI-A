import java.time.LocalDate;

public class CommissionEmployee extends Employee {
    private double grossSales;
    private double commissionRate;

    public CommissionEmployee(String name, String noKTP, LocalDate birthDate, double sales, double rate) {
        super(name, noKTP, birthDate);
        setGrossSales(sales);
        setCommissionRate(rate);
    }

    public void setGrossSales(double sales) {
        grossSales = sales;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setCommissionRate(double rate) {
        commissionRate = rate;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    @Override
    public double earnings() {
        return getCommissionRate() * getGrossSales();
    }

    @Override
    public String toString() {
        return String.format("Commission employee:\n%s\nGross sales: %.2f\nCommission rate: %.2f", super.toString(), getGrossSales(), getCommissionRate());
    }
}
