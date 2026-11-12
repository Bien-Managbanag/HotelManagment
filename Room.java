package hotel-management-project;

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

    public Room(int roomNum, String type, double price, boolean availability) {
        this.roomNum = roomNum;
        this.type = type;
        this.price = price;
        this.availability = availability;
    }

}
