// Parent Class

class Employee {

    private String name;
    private int id;
    protected double baseSalary;

    public Employee(String name, int id, double baseSalary) {
        this.name = name;
        this.id = id;
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double calculateSalary() {
        return baseSalary;
    }
}

// Full-Time Subclass
class FullTimeEmployee extends Employee {

    private double bonus;

    public FullTimeEmployee(String name, int id, double baseSalary, double bonus) {
        super(name, id, baseSalary);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + bonus;
    }

    public void display() {
        System.out.println("1. Full Time Employee Details:");
        System.out.println("   Name: " + getName());
        System.out.println("   ID: " + getId());
        System.out.println("   Logic: Fixed Salary (" + (int) baseSalary + ") + Bonus (" + (int) bonus + ")");
        System.out.println("   Full Time Employee Salary: " + calculateSalary());
    }
}

// Part-Time Subclass
class PartTimeEmployee extends Employee {

    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(String name, int id, int hoursWorked, double hourlyRate) {
        super(name, id, 0);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }

    public void display() {
        System.out.println("\n2. Part Time Employee Details:");
        System.out.println("   Name: " + getName());
        System.out.println("   ID: " + getId());
        System.out.println("   Logic: Hours Worked (" + hoursWorked + ") × Hourly Rate (" + (int) hourlyRate + ")");
        System.out.println("   Part Time Employee Salary: " + calculateSalary());
    }
}

// Main Execution Class
public class PayrollSystem {

    public static void main(String[] args) {
        System.out.println("--- Employee Payroll Management System ---");
        System.out.println("\nProcessing Employee Data...");

        // Creating objects
        FullTimeEmployee ft = new FullTimeEmployee("Aryan", 101, 50000, 5000);
        PartTimeEmployee pt = new PartTimeEmployee("Priyam", 102, 40, 300);

        // Displaying formatted output
        ft.display();
        pt.display();

        System.out.println("\n------------------------------------------");
        System.out.println("Final Report Generated Successfully.");
    }
}
