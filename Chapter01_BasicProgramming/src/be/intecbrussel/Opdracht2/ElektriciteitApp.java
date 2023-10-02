/* Dit Java-programma is bedoeld om elektriciteitsrekeningen te berekenen door gebruikersinvoer te accepteren en
   resultaten weer te geven op basis van een bepaalde berekeningslogica. Hier is het belangrijkste doel van het
   programma:
   1- Het programma begint met een welkomstbericht en een inleidende boodschap die uitlegt wat het programma doet.
   2- Gebruikers wordt gevraagd of ze berekeningen willen maken voor meer dan één huis (ja/nee).
   3- Als de gebruiker 'ja' (y) kiest, wordt een lus gebruikt om berekeningen uit te voeren voor meerdere huizen. Voor
      elk huis wordt de gebruiker gevraagd om de volgende informatie in te voeren:
      a- Naam van de verbruiker
      b- Vermogen in watt per uur
      c- Aantal uren per dag dat elektriciteit wordt gebruikt
      d- Aantal dagen per maand waarop elektriciteit wordt gebruikt
      e- Eenheidsprijs voor elektriciteit
   4- Als de gebruiker 'nee' (n) kiest, wordt de gebruiker gevraagd om dezelfde informatie in te voeren voor slechts één
      huis, en de resultaten worden weergegeven.
   5- Als de gebruiker een ongeldige optie invoert, wordt een bericht weergegeven dat aangeeft dat de keuze ongeldig is.
   6- Aan het einde van het programma wordt een bedankbericht aan de gebruiker getoond.

   Dit programma heeft een basisstructuur voor het berekenen van elektriciteitsrekeningen en biedt de gebruiker de
   mogelijkheid om berekeningen uit te voeren voor meerdere huizen of slechts één huis. Het berekent de
   elektriciteitskosten op basis van de verstrekte informatie en toont de resultaten op het scherm. */

package be.intecbrussel.Opdracht2;

import java.util.Scanner;

public class ElektriciteitApp {
    public static void main(String[] args) {

        Scanner scans = new Scanner(System.in);
        System.out.println("Welcome to the elektriciteitApp.");
        System.out.println("This application calculates electricity bills based on your input.");
        boolean validChoice = false;

        while (!validChoice) { //Runs until the condition is true. If false exits.

            System.out.print("Do you want to calculate the electricity price for more than one house? (y/n): ");
            String userChoice = scans.nextLine();// User gets two options to choose. y or n.

            if (userChoice.equalsIgnoreCase("y")) {// Incase user chose y, it gives the bill of more than one house.
                validChoice = true;
                System.out.print("\nPlease enter the number of houses: ");
                int numHouse = scans.nextInt(); // Asks user to enter the number of houses

                for (int i = 1; i <= numHouse; i++) { // Runs loop till the number of houses entered.
                    System.out.println("\nHouse " + i + ":");
                    calculation(scans); // calculation method does everything from user input to final price calculation.
                }

            } else if (userChoice.equalsIgnoreCase("n")) {// If the user chose n, gives the bill of only one house.
                validChoice = true;
                System.out.println("\nHouse 1: ");
                calculation(scans);

            } else {
                System.out.println("\nInvalid option entered. Please enter 'y' or 'n' to continue.");
            }
        }

        System.out.println("\nThank you for using the elektriciteitApp !");
    }

    public static void calculation(Scanner scans) {
        System.out.print("Please enter the Cient's name: ");
        String userName = scans.next();

        System.out.print("Please enter the power consumed per hour: ");
        double wattPerHour = scans.nextDouble();

        System.out.print("Please enter the number of hours per day used: ");
        int hoursUsed = scans.nextInt();

        System.out.print("Please enter the number of days per month used: ");
        int daysUsed = scans.nextInt();

        System.out.print("Please enter the per watt price of electricity: ");
        double pricePerWattPerHour = scans.nextDouble();

        double finalPrice = wattPerHour * hoursUsed * daysUsed * pricePerWattPerHour;

        System.out.println("\nElectricity bill for user " + userName + " is : " + finalPrice + " €");
    }
}
