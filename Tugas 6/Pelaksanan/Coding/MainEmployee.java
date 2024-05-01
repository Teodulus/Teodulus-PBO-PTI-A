public class MainEmployee {
    public static void main(String[] args) {
        Manager boss = new Manager("Steven", 80000, 1987, 12, 15, 5000);


        Employee staff = new Employee("Donni", 50000, 1989, 10, 1);
        System.out.println("Nama boss: " + boss.getName() + ", salary = " + boss.getSalary());
        System.out.println("Nama staff: " + staff.getName() + ", salary = " + staff.getSalary());
    }
}
