/*
Q8. Loan Management System (Abstraction + Polymorphism)
Problem
Banks offer multiple loan types with different interest rates. Using abstraction, define a generic loan and calculate interest differently in subclasses.
*/

abstract class Loan {
    protected double principal;
    protected double rate;
    protected int time;

    public Loan(double principal, double rate, int time) {
        this.principal = principal;
        this.rate = rate;
        this.time = time;
    }

    public abstract double calculateInterest();
}

class HomeLoan extends Loan {
    public HomeLoan(double principal, int time) {
        super(principal, 8, time);
    }

    @Override
    public double calculateInterest() {
        return (principal * rate * time) / 100;
    }
}

class CarLoan extends Loan {
    public CarLoan(double principal, int time) {
        super(principal, 10, time);
    }

    @Override
    public double calculateInterest() {
        return (principal * rate * time) / 100;
    }
}

public class code_8 {
    public static void main(String[] args) {
        Loan home = new HomeLoan(500000, 8);
        Loan car = new CarLoan(300000, 5);
        System.out.println("Home Loan Interest: " + home.calculateInterest());
        System.out.println("Car Loan Interest: " + car.calculateInterest());
    }
}
