/*
Q9. Online Course Platform (Association + Inheritance)
Problem
An online platform sells courses. Students can enroll in normal or premium mode. Premium students get extra discount. This uses association + inheritance.
*/

class Course {
    private String courseName;
    private String duration;

    public Course(String courseName, String duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return courseName + " (" + duration + ")";
    }
}

class Student {
    protected String name;
    protected Course enrolledCourse;

    public Student(String name, Course enrolledCourse) {
        this.name = name;
        this.enrolledCourse = enrolledCourse;
    }

    @Override
    public String toString() {
        return "Student: " + name + " Course: " + enrolledCourse;
    }
}

class PremiumStudent extends Student {
    private int discount;

    public PremiumStudent(String name, Course course, int discount) {
        super(name, course);
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "Premium Student: " + name + " Course: " + enrolledCourse + " Discount: " + discount + "%";
    }
}

public class code_9 {
    public static void main(String[] args) {
        Course course = new Course("Java", "3 months");
        Student arjun = new Student("Arjun", course);
        Student meena = new PremiumStudent("Meena", course, 20);
        System.out.println(arjun);
        System.out.println(meena);
    }
}
