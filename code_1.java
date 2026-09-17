/*
Q1. University – Department – Professor (One-to-Many Relationship)
Problem
In real-world university systems, a Department manages several Professors, but each professor belongs to exactly one department. Instead of keeping all details inside a single class, we use separate entities for better modularity and scalability. This represents a One-to-Many relationship (one department → many professors).
*/

import java.util.ArrayList;
import java.util.List;

class Professor {
    private String name;
    private String employeeId;
    private String specialization;

    public Professor(String name, String employeeId, String specialization) {
        this.name = name;
        this.employeeId = employeeId;
        this.specialization = specialization;
    }

    public String getName() { return name; }
    public String getEmployeeId() { return employeeId; }
    public String getSpecialization() { return specialization; }

    @Override
    public String toString() {
        return "Name: " + name + ", ID: " + employeeId + ", Specialization: " + specialization;
    }
}

class Department {
    private String deptName;
    private String hodName;
    private List<Professor> professors = new ArrayList<>();

    public Department(String deptName, String hodName) {
        this.deptName = deptName;
        this.hodName = hodName;
    }

    public void addProfessor(Professor p) {
        professors.add(p);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Department: ").append(deptName).append("\n");
        sb.append("HOD: ").append(hodName).append("\n");
        sb.append("Professors:\n");
        for (Professor p : professors) {
            sb.append(p).append("\n");
        }
        return sb.toString();
    }
}

public class code_1 {
    public static void main(String[] args) {
        Department dept = new Department("Computer Science", "Dr. Mehta");
        dept.addProfessor(new Professor("Arjun", "P101", "AI"));
        dept.addProfessor(new Professor("Neha", "P102", "ML"));
        System.out.println(dept);
    }
}
