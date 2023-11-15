/* We gaan een hoger lager spel maken. De applicatie moet een random nummer produceren die de gebruiker moet raden.
   We gaan nu meerdere hoofdstukken samenbrengen om een applicatie te maken.
   Tip: We hebben een loop nodig, Scanner klas voor het invoeren om te raden welk nummer en natuurlijk de Random klas
   voor het getal dat we moeten raden */

package be.intecbrussel.Oefeningen.Oefening5;

import java.util.Random;
import java.util.Scanner;

public class Oefening3 {
    public static void main(String[] args) {
        int number ;
        Scanner scanNum = new Scanner(System.in);
        while (true) {
            System.out.println("Please guess a number: ");// user enters a number
            if (scanNum.hasNextInt()) {
                Random rand = new Random();
                int randNum = rand.nextInt(11); // a random integer is generated.
                System.out.println("The number generated randomly is: " + randNum);

                number = scanNum.nextInt();

                if (number != randNum) { // checks if the entered number is equal to the randomly generated number.
                    System.out.println("You did not guess it right.");
                    scanNum.nextLine();
                } else {
                    System.out.println("you guessed it right.");
                    break;
                }
            }
            else {
                System.out.println("The number is invalid. ");
                scanNum.nextLine();
            }
        }
    }
}