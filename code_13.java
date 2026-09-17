/*
Q13. Hotel Reservation System (Aggregation)
Problem
A hotel reservation includes multiple guests under a single booking.
*/

import java.util.ArrayList;
import java.util.List;

class Guest {
    private String name;
    private int age;
    private String idProof;

    public Guest(String name, int age, String idProof) {
        this.name = name;
        this.age = age;
        this.idProof = idProof;
    }

    @Override
    public String toString() {
        return name + "," + age + "," + idProof;
    }
}

class Reservation {
    private String reservationId;
    private String roomType;
    private List<Guest> guests = new ArrayList<>();

    public Reservation(String reservationId, String roomType) {
        this.reservationId = reservationId;
        this.roomType = roomType;
    }

    public void addGuest(Guest guest) {
        guests.add(guest);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Reservation ID: ").append(reservationId).append(" Room: ").append(roomType).append("\nGuests:\n");
        for (Guest g : guests) {
            sb.append(g).append("\n");
        }
        return sb.toString();
    }
}

public class code_13 {
    public static void main(String[] args) {
        Reservation reservation = new Reservation("R101", "Deluxe");
        reservation.addGuest(new Guest("Amit", 25, "ID123"));
        reservation.addGuest(new Guest("Sara", 22, "ID456"));
        System.out.println(reservation);
    }
}
