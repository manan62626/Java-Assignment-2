/*
Q5. Hospital Management (Multi-level Inheritance)
Problem
A hospital tracks different roles. A Person can be a Doctor, and a doctor can specialize as a Surgeon. This models a multi-level inheritance hierarchy.
*/

class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nAge: " + age;
    }
}

class Doctor extends Person {
    protected String specialization;

    public Doctor(String name, int age, String specialization) {
        super(name, age);
        this.specialization = specialization;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSpecialization: " + specialization;
    }
}

class Surgeon extends Doctor {
    private String surgeryType;

    public Surgeon(String name, int age, String specialization, String surgeryType) {
        super(name, age, specialization);
        this.surgeryType = surgeryType;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSurgery Type: " + surgeryType;
    }
}

public class code_5 {
    public static void main(String[] args) {
        Surgeon surgeon = new Surgeon("John", 40, "Cardiology", "Heart Surgery");
        System.out.println(surgeon);
    }
}
