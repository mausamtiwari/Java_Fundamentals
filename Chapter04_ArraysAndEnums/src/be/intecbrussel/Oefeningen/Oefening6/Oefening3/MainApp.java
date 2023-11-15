/* Maak een enum aan met 10 verschillende landen. Maak een class aan die HolidayDestination heet. Print
   in de MainApp de waardes van de enum met de index. Schrijf in de HolidayDestination class een methode
   met daarin een switch case. - Wat de methode doetof kan is helemaal voor eigen keuzen. Zorg dat als de methode
   in de MainApp word aangeroepen er een print-out is of een anderegebeurtenis */

package be.intecbrussel.Oefeningen.Oefening6.Oefening3;

import java.util.Random;

public class MainApp {
    public static void main(String[] args) {
        HolidayDestination[] holidays = HolidayDestination.values();          // Stores enum as an array

        for (int index = 0; index < holidays.length; index++) {               // Prints the value of enums as an array
            System.out.println("Holiday destination at index " + index + " is " + holidays[index]);
        }

        System.out.println();                             // An extra line break.
        MyDestination();                                  // myDestination method called which randomly selects your next holiday destination
    }

    public static void MyDestination() {                  // This method randomly selects one of the elements of enum using random method and switch case.

        HolidayDestination[] holidays = HolidayDestination.values();
        Random rand = new Random();
        int randDestination = rand.nextInt(10) + 1;

        switch (randDestination) {
            case 1 -> System.out.println("Your next holiday destination is: " + holidays[0]);
            case 2 -> System.out.println("Your next holiday destination is: " + holidays[1]);
            case 3 -> System.out.println("Your next holiday destination is: " + holidays[2]);
            case 4 -> System.out.println("Your next holiday destination is: " + holidays[3]);
            case 5 -> System.out.println("Your next holiday destination is: " + holidays[4]);
            case 6 -> System.out.println("Your next holiday destination is: " + holidays[5]);
            case 7 -> System.out.println("Your next holiday destination is: " + holidays[6]);
            case 8 -> System.out.println("Your next holiday destination is: " + holidays[7]);
            case 9 -> System.out.println("Your next holiday destination is: " + holidays[8]);
            case 10 -> System.out.println("Your next holiday destination is: " + holidays[9]);
        }


    }
}
