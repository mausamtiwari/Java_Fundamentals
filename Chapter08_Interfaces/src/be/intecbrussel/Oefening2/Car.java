package be.intecbrussel.Oefening2;

public class Car implements Motor, Switch1 {
    boolean isON = false;                // The car is switched off intially.

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
        if (isON) {                      // The car can accelerate only when it is switched on.
            System.out.println("The car is accelerating.");
        } else {
            System.out.println("The car cannot accelerate when switched off.");
        }
    }

}
