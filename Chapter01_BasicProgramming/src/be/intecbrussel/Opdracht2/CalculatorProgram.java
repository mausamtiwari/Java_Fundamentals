/*
1-Het programma begint met het afdrukken van twee welkomstberichten op het scherm:

Welcome to age calculator program
Write the age

2- Vervolgens wordt de gebruiker gevraagd om hun leeftijd in te voeren.
3- De ingevoerde leeftijd wordt gelezen en opgeslagen in de variabele age.
4- Het programma evalueert de ingevoerde leeftijd met behulp van opeenvolgende if, else if en else statement.

   A- Als de leeftijd groter is dan of gelijk is aan 18, wordt het volgende bericht afgedrukt:
      You are an adult.
   B- Als de leeftijd groter is dan of gelijk is aan 10, maar kleiner dan 18, wordt het volgende bericht afgedrukt:
      You are a teenager.
   C- Als de leeftijd groter is dan of gelijk is aan 2, maar kleiner dan 10, wordt het volgende bericht afgedrukt:
      You are a child.
   D- Als de leeftijd kleiner is dan 2, wordt het volgende bericht afgedrukt:
      You are a baby.

5-Na het afdrukken van het relevante bericht, zal het programma het volgende bedankbericht tonen:
Thank you for using this program

Met deze code kun je de leeftijd van een persoon invoeren en krijg je een bericht dat de leeftijdscategorie van die
persoon weergeeft, variërend van "baby" tot "volwassene", afhankelijk van de ingevoerde leeftijd. */

package be.intecbrussel.Opdracht2;

import java.util.Scanner;

public class CalculatorProgram {
    public static void main(String[] args) {
        System.out.println("Welcome to the age calculator program.");
        Scanner ageScan = new Scanner(System.in);
        System.out.print("Please enter your age: ");

        while (true) { // loops until the user inputs the valid age. Exits after valid age is entered.

            if (ageScan.hasNextInt()) { // Only takes age of int data type.
                int age = ageScan.nextInt();

                if (age < 2 & age >= 0) { // Checks if the age is smaller than two and greater than or equal to 0.
                    System.out.println("You are a baby.");
                    break;
                } else if (age >= 2 && age < 10) {// Checks if the age is greater than or equal to 2 and smaller than 10.
                    System.out.println("You are a child.");
                    break;
                } else if (age >= 10 && age < 18) {// Checks if the age is greater than or equal to 10 and smaller than 18.
                    System.out.println("You are a teen.");
                    break;
                } else if (age >= 18) {// Checks if the ga eis greater than or equal to 18.
                    System.out.println("You are an adult.");
                    break;
                } else {// Checks if the age is negative.
                    System.out.print("The age can't be negative. ");
                    ageScan.nextLine(); // if negative age is entered prompts to enter valid age.
                    System.out.print("Please enter a valid age: ");
                }
            } else {// Checks if the age other than int data type is entered.
                System.out.print("Please enter a valid age: ");
                ageScan.nextLine(); // If age other than of int data type is entered, prompts to enter a valid age.
            }
        }
        System.out.println("Thank you for using this program.");
    }
}
