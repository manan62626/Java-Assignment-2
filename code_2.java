/*
Q2. Flight Booking System (Abstraction + Inheritance)
Problem
Airline systems have different types of flights — domestic and international. While both share some common attributes (flight number, airline, fare), the fare calculation rules differ. Using abstraction, we can define a generic Flight and implement details in subclasses.
*/

abstract class Flight {
    private String flightNumber;
    private String airline;
    private double fare;

    public Flight(String flightNumber, String airline, double fare) {
        this.flightNumber = flightNumber;
        this.airline = airline;
        this.fare = fare;
    }

    public abstract double calculateFare();

    public String getFlightNumber() { return flightNumber; }
    public String getAirline() { return airline; }
    public double getFare() { return fare; }

    @Override
    public String toString() {
        return "Flight No: " + flightNumber + " Airline: " + airline + " Fare: " + calculateFare();
    }
}

class DomesticFlight extends Flight {
    public DomesticFlight(String flightNumber, String airline, double fare) {
        super(flightNumber, airline, fare);
    }

    @Override
    public double calculateFare() {
        return getFare() + (getFare() * 0.10);
    }
}

class InternationalFlight extends Flight {
    public InternationalFlight(String flightNumber, String airline, double fare) {
        super(flightNumber, airline, fare);
    }

    @Override
    public double calculateFare() {
        return getFare() + (getFare() * 0.25);
    }
}

public class code_2 {
    public static void main(String[] args) {
        Flight domestic = new DomesticFlight("AI202", "Air India", 5000);
        Flight international = new InternationalFlight("QF101", "Qantas", 20000);
        System.out.println(domestic);
        System.out.println(international);
    }
}
