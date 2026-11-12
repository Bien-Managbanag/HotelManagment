package HotelManagment;

public class Main {
    public static void main(String[] args) {

        // Create first room
        Room room101 = new Room(101, "Single", 60.00);

        // Test getter methods
        System.out.println("Room Number: " + room101.getRoomNum());
        System.out.println("Room Type: " + room101.getType());
        System.out.println("Price Per Night: " + room101.getPrice());
        System.out.println("Available: " + room101.isAvailable());
    }
}
