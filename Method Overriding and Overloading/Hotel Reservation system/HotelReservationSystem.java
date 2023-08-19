class Room {
    private int roomNumber;
    private int capacity;
    private double pricePerNight;
    private boolean isReserved;

    public Room(int roomNumber, int capacity, double pricePerNight) {
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.pricePerNight = pricePerNight;
        this.isReserved = false;
    }

    public boolean checkAvailability() {
        return !isReserved;
    }

    public boolean makeReservation() {
        if (!isReserved) {
            isReserved = true;
            return true;
        }
        return false;
    }

    public boolean makeReservation(String checkInDate, String checkOutDate) {
        // Logic to handle reservation with specific check-in/check-out dates
        if (!isReserved) {
            isReserved = true;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Room " + roomNumber + ", Capacity: " + capacity + ", Price per night: $" + pricePerNight;
    }
}

public class HotelReservationSystem {
    public static void main(String[] args) {
        Room room1 = new Room(101, 2, 100.0);
        Room room2 = new Room(102, 4, 150.0);

        System.out.println(room1);
        System.out.println(room2);

        System.out.println("Room 101 available? " + room1.checkAvailability());
        System.out.println("Room 102 available? " + room2.checkAvailability());

        if (room1.makeReservation()) {
            System.out.println("Reservation for Room 101 successful.");
        } else {
            System.out.println("Room 101 is already reserved.");
        }

        if (room2.makeReservation("2023-08-20", "2023-08-25")) {
            System.out.println("Reservation for Room 102 with specific dates successful.");
        } else {
            System.out.println("Room 102 is already reserved.");
        }

        System.out.println("Room 101 available? " + room1.checkAvailability());
        System.out.println("Room 102 available? " + room2.checkAvailability());
    }
}
