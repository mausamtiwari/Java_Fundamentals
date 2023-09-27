/* Schrijf een programma dat de faculteit van een bepaald getal te vinden.
   Uitleg: De faculteit van een niet-negatief geheel getal n is het product van alle positieve gehele getallen kleiner dan
   of gelijk aan n. De faculteit van 4 (geschreven als 4!) is bijvoorbeeld 4 x 3 x 2 x 1 = 24.
   Uw programma moet een invoer van de gebruiker nemen (met behulp van de klasse Scanner) en de faculteit van dat getal
   berekenen. Zorg ervoor dat er invoervalidatie is voor negatieve getallen. */

package be.intecbrussel.Les6.Oefening5.extraOefening;

import java.math.BigInteger;
import java.util.Scanner;

public class Oefening1 {
    public static void main(String[] args) {
        Scanner myNum = new Scanner(System.in);
        System.out.println("Please enter a non-negative integer: ");

        if (myNum.hasNextInt()) {

            int number = myNum.nextInt();

            if (number < 0) {
                System.out.println("The factorial of negative integer is invalid. ");
            } else { // if the number entered is 0 or 1. The program returns the value 1.
                BigInteger factorial = BigInteger.valueOf(1); // long or short data types can't hold very large data. Hence, BigInteger Class in Java comes in very handy
                if (number > 1) {
                    for (int i = 1; i <= number; i++)
                        factorial = factorial.multiply(BigInteger.valueOf(i));//Using multiply method of bigInteger class to handle large values.
                }
                System.out.println("The factorial of " + number + " is " + factorial);
            }
        } else {
            System.out.println("Please enter a valid input.");
            myNum.next(); // clears the invalid input

        }
    }
}