import java.util.*;

class Guest {
    private int guestId;
    private String name;

    public Guest(int guestId, String name) {
        this.guestId = guestId;
        this.name = name;
    }

    public void setGuestId(int guestId) {
		this.guestId = guestId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGuestId() {
        return guestId;
    }

    public String getName() {
        return name;
    }
}

class Reservation {
    private int reservationId;
    private int roomId;
    private Guest guest;
    private String reservationType;

    public Reservation(int reservationId, Guest guest, String reservationType,int roomId) {
        this.reservationId = reservationId;
        this.guest = guest;
        this.reservationType = reservationType;
        this.roomId=roomId;
    }

    public int getReservationId() {
        return reservationId;
    }
    
    public int getRoomId() {
        return roomId;
    }

    public Guest getGuest() {
        return guest;
    }

    public String getReservationType() {
        return reservationType;
    }
}

class Room {
    private int roomId;
    private String roomType;
    private boolean isAvailable;

    public Room(int roomId, String roomType) {
        this.roomId = roomId;
        this.roomType = roomType;
        this.isAvailable = true;
    }

    public int getRoomId() {
        return roomId;
    }

    public String getRoomType() {
        return roomType;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void bookRoom() {
        isAvailable = false;
    }

    public void releaseRoom() {
        isAvailable = true;
    }
}

class HotelManagementSystem {
    private Map<Integer, Guest> guests = new HashMap<>();
    private Map<Integer, Reservation> reservations = new HashMap<>();
    private List<Room> rooms = new ArrayList<>();
	private Guest guest;

    public void addGuest(int guestId, String name) {
        Guest guest = new Guest(guestId, name);
        guests.put(guestId, guest);
        System.out.println("Guest added: " + guest.getName());
    }

    public void makeReservation(int reservationId, int guestId, String reservationType, int roomId) throws HotelManagementSystem.InvalidReservationException {
        guest = guests.get(guestId);

        if (guest == null) {
            
        	throw new InvalidReservationException("Guest with ID " + guest.getGuestId() + " is not available " );
        }

        Reservation reservation = new Reservation(reservationId, guest, reservationType,roomId);
        reservations.put(reservationId, reservation);
        System.out.println("Reservation made for guest: " + guest.getName() + ", Type: " + reservationType);
    }

    public void checkRoomAvailability(int roomId) throws HotelManagementSystem.RoomNotFoundException {
        for (Room room : rooms) {
            if (room.isAvailable()) {
                System.out.println("Room ID: " + room.getRoomId() + ", Type: " + room.getRoomType() + " is available.");
            }
            else {
            	throw new RoomNotFoundException("Room with ID " + room.getRoomId() + " is not available with " + room.getRoomType());
            }
        }
    }
    
    class InvalidReservationException extends Exception {
        public InvalidReservationException(String message) {
            super(message);
        }
    }

    class RoomNotFoundException extends Exception {
        public RoomNotFoundException(String message) {
            super(message);
        }
    }


    public static void main(String[] args) throws InvalidReservationException, RoomNotFoundException {
        HotelManagementSystem hotelSystem = new HotelManagementSystem();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Hotel Management System Menu:");
            System.out.println("1. Add Guest");
            System.out.println("2. Make Reservation");
            System.out.println("3. Check Room Availability");
            System.out.println("4. Exit");
            System.out.print("Select an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter Guest ID: ");
                    int guestId = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Enter Guest Name: ");
                    String name = scanner.nextLine();
                    hotelSystem.addGuest(guestId, name);
                    break;
                case 2:
                    System.out.print("Enter Reservation ID: ");
                    int reservationId = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Enter Guest ID: ");
                    guestId = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Enter Reservation Type: ");
                    String reservationType = scanner.nextLine();
                    System.out.print("Enter Room ID: ");
                    int roomId = scanner.nextInt();
                    hotelSystem.makeReservation(reservationId, guestId, reservationType,roomId);
                    break;
                case 3:
                	System.out.print("Enter Room ID: ");
                    int roomId1 = scanner.nextInt();
                    hotelSystem.checkRoomAvailability(roomId1);
                    break;
                case 4:
                    System.out.println("Exiting Hotel Management System.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }
}
