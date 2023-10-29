/* Maak een interface Switch1 met de methode:
   void toggleSwitch()
   Maak een interface Motor met de methode:
   void gas();
   Maak vervolgens een class Car die beide interfaces zal implementeren. Zorg voor een controle dat je enkel
   gas kan geven als de wagen aan staat, een toggleSwitch().*/

package be.intecbrussel.Oefening2;

public class MainApp {
    public static void main(String[] args) {
        Car car = new Car();
        car.gas();                // Trying to accelerate when the car is switched off.
        car.toggleSwitch();       // Switching on the car.
        car.toggleSwitch();       // Switching off the car.
        car.gas();                // Trying to accelerate when the car is switched off.
        car.toggleSwitch();       // Switching on the car.
        car.gas();                // Accelerating the car.
    }

}
