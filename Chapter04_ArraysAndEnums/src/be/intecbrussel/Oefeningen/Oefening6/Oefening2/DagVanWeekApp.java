/* Schrijf een programma dat input vraagt naar welke dag dat het is en deze dan ook uitprint.
   Gebruik je enum van de vorige opdracht in combinatie met een switch statement. */

package be.intecbrussel.Oefeningen.Oefening6.Oefening2;

import java.util.Scanner;

public class DagVanWeekApp {
    public static void main(String[] args) {
        DagVanWeek[] dagen = DagVanWeek.values();
        Scanner myScan = new Scanner(System.in);
        System.out.println("Which day of the week is it?");
        int myDays = myScan.nextInt();

        switch (myDays) {
            case 1 -> System.out.println("It is " + dagen[0]);
            case 2 -> System.out.println("It is " + dagen[1]);
            case 3 -> System.out.println("It is " + dagen[2]);
            case 4 -> System.out.println("It is " + dagen[3]);
            case 5 -> System.out.println("It is " + dagen[4]);
            case 6 -> System.out.println("It is " + dagen[5]);
            case 7 -> System.out.println("It is " + dagen[6]);
            default -> System.out.println("Please enter number from 1 to 7.");
        }
    }
}
