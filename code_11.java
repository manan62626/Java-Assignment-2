/*
Q11. University Hostel Allocation (One-to-One Relationship)
Problem
Each student in a university hostel gets exactly one room, and each room is allocated to only one student. This models a strict one-to-one relationship.
*/

class Room {
    private String roomNumber;
    private String block;
    private String type;

    public Room(String roomNumber, String block, String type) {
        this.roomNumber = roomNumber;
        this.block = block;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Room: " + roomNumber + " " + block + " " + type;
    }
}

class StudentHostel {
    private String name;
    private int roll;
    private String course;
    private Room room;

    public StudentHostel(String name, int roll, String course, Room room) {
        this.name = name;
        this.roll = roll;
        this.course = course;
        this.room = room;
    }

    @Override
    public String toString() {
        return "Student: " + name + " (" + roll + ") " + course + "\n" + room;
    }
}

public class code_11 {
    public static void main(String[] args) {
        Room room = new Room("A101", "Block-B", "Single");
        StudentHostel student = new StudentHostel("Ravi", 101, "CSE", room);
        System.out.println(student);
    }
}
