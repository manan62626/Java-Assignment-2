/*
Q15. Passport – Citizen (One-to-One Relationship)
Problem
A passport belongs to exactly one citizen. This forms a strict one-to-one relationship.
*/

class Passport {
    private String passportNo;
    private String issueDate;
    private String expiryDate;

    public Passport(String passportNo, String issueDate, String expiryDate) {
        this.passportNo = passportNo;
        this.issueDate = issueDate;
        this.expiryDate = expiryDate;
    }

    @Override
    public String toString() {
        return "Passport: " + passportNo + " Issue: " + issueDate + " Expiry: " + expiryDate;
    }
}

class Citizen {
    private String name;
    private String dob;
    private String address;
    private Passport passport;

    public Citizen(String name, String dob, String address, Passport passport) {
        this.name = name;
        this.dob = dob;
        this.address = address;
        this.passport = passport;
    }

    @Override
    public String toString() {
        return "Citizen: " + name + " DOB: " + dob + " Address: " + address + "\n" + passport;
    }
}

public class code_15 {
    public static void main(String[] args) {
        Passport passport = new Passport("P123456", "01-01-2020", "01-01-2030");
        Citizen citizen = new Citizen("Ravi", "01-01-1990", "Delhi", passport);
        System.out.println(citizen);
    }
}
