/* Deze oefening is een uitbreiding op oefening 2. Maak een interface genaamd Vehicle. Deze extends de
   interfaces Switch en Motor, en heeft zelf de volgende methodes:
   void openDoor(int door);
   void closeDoor(int door);
   en de property:
   int doors = 5;
   Hou er rekening mee dat de auto geen gas mag geven als er een deur openstaat!  */

package be.intecbrussel.Oefening3;

public class MainApp {
    public static void main(String[] args) {
        Car car = new Car();
        car.gas();            // Applying the gas. But the car is initially switched off.
        car.toggleSwitch();   // Now switches on the car.
        car.gas();            // Acclerates the car but the door are opened. Can't accelerate.
        car.closeDoor(1);     // Now closes the door.
        car.gas();            // Accelerates only when the car is switched on and the doors are closed.
        car.openDoor(1);      // Opens the door.
        car.closeDoor(1);     // Closes the door.
        car.toggleSwitch();   // Switching off the car.


    }
}
