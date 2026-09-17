/*
Q12. Vehicle Rental System (Inheritance + Overriding)
Problem
Rental companies offer cars and bikes. Both are vehicles but their rental cost calculation differs.
*/

class Vehicle {
    protected String regNo;
    protected String brand;
    protected double baseRate;

    public Vehicle(String regNo, String brand, double baseRate) {
        this.regNo = regNo;
        this.brand = brand;
        this.baseRate = baseRate;
    }

    public double calculateRent() {
        return baseRate;
    }
}

class Car extends Vehicle {
    public Car(String regNo, String brand, double baseRate) {
        super(regNo, brand, baseRate);
    }

    @Override
    public double calculateRent() {
        return baseRate * 1.5;
    }

    @Override
    public String toString() {
        return "Car " + regNo + " " + brand + " Rent: " + calculateRent();
    }
}

class Bike extends Vehicle {
    public Bike(String regNo, String brand, double baseRate) {
        super(regNo, brand, baseRate);
    }

    @Override
    public double calculateRent() {
        return baseRate * 1.2;
    }

    @Override
    public String toString() {
        return "Bike " + regNo + " " + brand + " Rent: " + calculateRent();
    }
}

public class code_12 {
    public static void main(String[] args) {
        Vehicle car = new Car("KA01AA1234", "Toyota", 1000);
        Vehicle bike = new Bike("KA05BB6789", "Honda", 500);
        System.out.println(car);
        System.out.println(bike);
    }
}
