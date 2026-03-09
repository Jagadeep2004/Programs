package InheritenceAbstractionEncapsulationHandsOn;

import java.util.Scanner;

public class PayrollSystem {

    static class Employee {
        protected String empId;
        protected String empName;
        protected double baseSalary;

        public Employee(String empId, String empName, double baseSalary) {
            this.empId = empId;
            this.empName = empName;
            this.baseSalary = baseSalary;
        }

        public double calculateSalary() {
            return baseSalary;
        }

        
        public String toString() {
            return "Employee ID: " + empId +
                   "\nName: " + empName +
                   "\nBase Salary: " + baseSalary +
                   "\nFinal Salary: " + calculateSalary();
        }
    }

    static class PermanentEmployee extends Employee {
        private double bonus;

        public PermanentEmployee(String empId, String empName, double baseSalary, double bonus) {
            super(empId, empName, baseSalary);
            this.bonus = bonus;
        }

        
        public double calculateSalary() {
            return baseSalary + bonus;
        }
    }

    static class ContractEmployee extends Employee {
        private double taxRate;
        private double serviceCharge;

        public ContractEmployee(String empId, String empName, double baseSalary, double taxRate, double serviceCharge) {
            super(empId, empName, baseSalary);
            this.taxRate = taxRate;
            this.serviceCharge = serviceCharge;
        }

        
        public double calculateSalary() {
            return baseSalary - (baseSalary * taxRate) - serviceCharge;
        }
    }

    static class Intern extends Employee {
        private double stipend;

        public Intern(String empId, String empName, double stipend) {
            super(empId, empName, 0);
            this.stipend = stipend;
        }

        
        public double calculateSalary() {
            return stipend;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Select Employee Type:");
        System.out.println("1. Permanent Employee");
        System.out.println("2. Contract Employee");
        System.out.println("3. Intern");
        int choice = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee ID: ");
        String id = sc.nextLine();

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        Employee emp = null;

        if (choice == 1) {
            System.out.print("Enter Base Salary: ");
            double base = sc.nextDouble();
            System.out.print("Enter Bonus: ");
            double bonus = sc.nextDouble();
            emp = new PermanentEmployee(id, name, base, bonus);
        }
        else if (choice == 2) {
            System.out.print("Enter Base Salary: ");
            double base = sc.nextDouble();
            System.out.print("Enter Tax Rate : ");
            double tax = sc.nextDouble();
            System.out.print("Enter Service Charge: ");
            double service = sc.nextDouble();
            emp = new ContractEmployee(id, name, base, tax, service);
        }
        else if (choice == 3) {
            System.out.print("Enter Stipend: ");
            double stipend = sc.nextDouble();
            emp = new Intern(id, name, stipend);
        }
        else {
            System.out.println("Invalid Choice");
            System.exit(0);
        }

        System.out.println("\n----- Employee Payroll Details -----\n");
        System.out.println(emp);

        sc.close();
    }
}
