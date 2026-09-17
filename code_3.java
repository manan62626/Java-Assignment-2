/*
Q3. Employee Payroll System (Constructor Chaining + Overriding)
Problem
A company maintains different types of employees. A normal employee only has basic salary, while managers earn an additional bonus. This requires inheritance, constructor chaining, and method overriding for salary calculation.
*/

class Employee {
    protected String name;
    protected String id;
    protected double basicSalary;

    public Employee() {
    }

    public Employee(String name, String id, double basicSalary) {
        this.name = name;
        this.id = id;
        this.basicSalary = basicSalary;
    }

    public double calculateSalary() {
        return basicSalary;
    }

    @Override
    public String toString() {
        return "Employee " + name + " (" + id + ") Salary: " + calculateSalary();
    }
}

class Manager extends Employee {
    private double bonus;

    public Manager(String name, String id, double basicSalary, double bonus) {
        super(name, id, basicSalary);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return basicSalary + bonus;
    }

    @Override
    public String toString() {
        return "Manager " + name + " (" + id + ") Salary: " + calculateSalary();
    }
}

public class code_3 {
    public static void main(String[] args) {
        Employee e = new Employee("Ravi", "E101", 30000);
        Employee m = new Manager("Seema", "M202", 40000, 5000);
        System.out.println(e);
        System.out.println(m);
    }
}
