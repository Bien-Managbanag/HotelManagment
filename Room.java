package HotelManagment;

/*
What does a hotel room have?
room number - int
room type (single, dbl, etc) - string
price - double
availability - bool
*/

public class Room {
    private int roomNum;
    private String type;
    private double price;
    private boolean availability;

    public Room(int roomNum, String type, double price) {
        this.roomNum = roomNum;
        this.type = type;
        this.price = price;
        this.availability = true;
    }

    public int getRoomNum() {
        return roomNum;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAvailable() {
        return availability;
    }
}
