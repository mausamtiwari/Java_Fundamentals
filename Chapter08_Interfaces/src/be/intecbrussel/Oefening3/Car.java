package be.intecbrussel.Oefening3;

public class Car implements Vehicle {
    private boolean isON = false;             // Initially our car is switched off.
    private boolean doorIsOpen = true;        // Doors are opened at first.
    int door;


    @Override
    public void toggleSwitch() {
        if (!isON) {                     // If car is not on, switches on the car and prints the car is starting.
            isON = true;
            System.out.println("The car is starting.");
        } else {                          // If the car is On, switches off the car and prints the car is switched off
            isON = false;
            System.out.println("The car is switched off.");
        }
    }

    @Override
    public void gas() {
        if (isON && !doorIsOpen) {                         // Car accelerates only if it is switched on and the doors are closed.
            System.out.println("The car is accelerating.");
        } else if (!isON) {                                 // Car can't accelerate when the car is switched off.
            System.out.println("The car cannot accelerate when the car is switched off.");
        } else {                                            // Car can't accelerate when the door is open.
            System.out.println("The car cannot accelerate when the door is open.");
        }
    }


    @Override
    public void openDoor(int door) {
        this.door = door;
        if (!doorIsOpen) {         // Opens the door if the door is closed
            System.out.println("Opening " + door + " door.");
        } else {                   // If doors are already opened, prints already opened.
            System.out.println("Door is already opened.");
        }
        doorIsOpen = true;          // If door are open then doorIsOpen stays true.
    }

    @Override
    public void closeDoor(int door) {
        this.door = door;
        if (doorIsOpen) {            // Closes the door if the door is opened.
            System.out.println("Closing " + door + " door.");
        } else {                       // If the doors are already closed, prints already closed
            System.out.println("Doors already closed.");
        }
        doorIsOpen = false;          // Door is opened stays false when the doors are closed.
    }

}
