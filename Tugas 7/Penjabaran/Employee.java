import java.time.LocalDate;

public abstract class Employee {
    private String name;
    private String noKTP;
    private LocalDate birthDate;

    public Employee(String name, String noKTP, LocalDate birthDate) { // Penambahan parameter tanggal lahir pada konstruktor
        this.name = name;
        this.noKTP = noKTP;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public String getNoKTP() {
        return noKTP;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public abstract double earnings();

    @Override
    public String toString() {
        return String.format("Name: %s\nNo. KTP: %s\nBirth Date: %s", getName(), getNoKTP(), getBirthDate());
    }


    public static Employee createEmployee(String type, String name, String noKTP, LocalDate birthDate, double salaryOrRate, double additionalParameter) {
        switch(type.toLowerCase()) {
            case "salaried":
                return new SalariedEmployee(name, noKTP, birthDate, salaryOrRate);
            case "hourly":
                return new HourlyEmployee(name, noKTP, birthDate, salaryOrRate, additionalParameter);
            case "commission":
                return new CommissionEmployee(name, noKTP, birthDate, salaryOrRate, additionalParameter);
            case "basepluscommission":
                return new BasePlusCommissionEmployee(name, noKTP, birthDate, salaryOrRate, additionalParameter, additionalParameter);
            default:
                return null;
        }
    }
}
