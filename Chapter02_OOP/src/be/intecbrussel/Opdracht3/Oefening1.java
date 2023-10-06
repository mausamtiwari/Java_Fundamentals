/* Je bent de moderator van een ‘World Of PeaceCraft’ -chat server en voor een of andere reden haat je gorillas. Je
   hebt een regel in je server dat niemand een referentie naar gorilla’s doet. Maar omdat er een herdenking is naar een
   bepaalde gorilla die neergeschoten is geweest in een zoo, zijn er plotseling een hele hoop mensen die hun UserName
   veranderen naar deze specifieke Gorilla. Maak een if else applicatie, waarin een gebruiker een username kan meegeven.
   Als ze een naam geven die “gorilla”, “gori” of “Harambe” bevat, dan maak je een system out die zegt dat de user
   verbannen is.
   Extra: Laat de gebruiker 3 keer proberen. De gebruiker is verbannen als die voor de derde keer zo een woord in hun
   username stoppen. */

package be.intecbrussel.Opdracht3;

import java.util.Scanner;

public class Oefening1 {
    public static void main(String[] args) {
        int chance = 3; // the total number of chances the user has to write the name avoiding the prohibited names
        Scanner scans = new Scanner(System.in);
        String Username;
        System.out.print("Please enter the user name: ");

        while (chance-- > 0) {// The code loops until the remaning chance is 0.

            Username = scans.nextLine(); // Takes the username from the user.

            if ((Username.equalsIgnoreCase("gorilla")) || (Username.equalsIgnoreCase("gori")) ||
                    (Username.equalsIgnoreCase("Harambe"))) {// Checks if the usernames contains prohibited names.
                System.out.print("This name is prohibited. "); // Displays this if prohibited.

                if (chance > 0) {  //chance counter
                    System.out.print("You have " + chance + " chances remaining.");
                    System.out.print(" Please try again: ");
                } else {
                    System.out.println("You have been blocked.");
                }

            } else {
                System.out.println("Welcome " + Username + "!"); // This is printed if prohibited names is not found.
                break; // exits the loop.
            }
        }

    }
}
