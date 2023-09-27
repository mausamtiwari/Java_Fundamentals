/* Gebruik een do while loop. Print je naam en leeftijd uit. Begin je leeftijd op 0 en laat de loop breken op de
   leeftijd dat je vandaag bent.*/

package be.intecbrussel.Les5.Oefening4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Oefening3 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Please enter your name and age: ");
        String name = myObj.nextLine(); //takes username
        try { // catches exception if any occurs
            int currentAge = myObj.nextInt(); // takes the age
            int age = 0; // initialise the age to 0.
            if (currentAge > 0) { // Age can't be zero or negative only values greater than 0 are passed.
                do {
                    age++;
                } while (age < currentAge); // stops the loop if it reaches to currentAge entered.
                System.out.println("Your name is " + name + " and your age is " + (age) + ".");// Prints the output
            } else {
                System.out.println("Your age can't be zero or negative."); // gives message that the age can't be zero or negative
            }
        } catch (
                InputMismatchException e) { // InputMismatchException throws exception if data of other data types instead of declared is entered.
            System.out.println("Please enter a valid age. ");
        }
    }
}
