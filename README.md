# Hotel Management Tool

A Java-based tool used for hotel management used to manage activites like storing customer details, booking rooms, unbooking rooms and showing the bill. It can also be used to see different room features and room availibility. 

# Project Structure
Main.java
Hotel.java
Room.java
Guest.java
Availability.java

# Room.java
Room class represents an individual hotel room and stores its essential information.

Features Implemented:
- Room Attributes: Stores the room number, room type, price per night and availability status.
- Constructor: Initialises a room using its number, type, and price, with availability set to true by default
- Encapsulation: Uses private fields to prevent direct access to room attributes.
- Getter Methods: javac -d out Main.java Room.java Guest.java Hotel.java Availability.java

Testing
Initial manual testing was implemented in Main.java to check room creation and getter functionality.

Test Procedure:

Created a Room object using new Room(101, "Single", 50.00).

Called each getter method to retrieve the room's attributes.

Printed the returned values to the console.

Checked that a newly created room was available by default

Expected output:
'''
Room Number: 101
Room Type: Single
Price Per Night: 50.0
Available: true
'''

Testing Outcome:


Testing Outcome: The test is designed to verify that the constructor correctly initialises the room attributes and that each getter returns the expected value.

Future Improvements

Implement displayRoomDetails() to display room information using a single method.

Add functionality to update room availability when booking or checking out.

Introduce input validation for room numbers and prices.

Implement automated unit testing using JUnit.
