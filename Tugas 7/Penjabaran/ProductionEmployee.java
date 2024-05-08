import java.time.LocalDate;

public class ProductionEmployee extends Employee {
    private int producedItems;
    private double wagePerItem;

    public ProductionEmployee(String name, String noKTP, LocalDate birthDate, int producedItems, double wagePerItem) {
        super(name, noKTP, birthDate);
        this.producedItems = producedItems;
        this.wagePerItem = wagePerItem;
    }

    public int getProducedItems() {
        return producedItems;
    }

    public void setProducedItems(int producedItems) {
        this.producedItems = producedItems;
    }

    public double getWagePerItem() {
        return wagePerItem;
    }

    public void setWagePerItem(double wagePerItem) {
        this.wagePerItem = wagePerItem;
    }

    @Override
    public double earnings() {
        return producedItems * wagePerItem;
    }

    @Override
    public String toString() {
        return String.format("Production employee:\n%s\nProduced items: %d\nWage per item: %.2f", super.toString(), producedItems, wagePerItem);
    }
}
