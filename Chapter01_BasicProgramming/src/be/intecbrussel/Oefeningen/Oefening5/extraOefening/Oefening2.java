/* Schrijf een programma dat vraagt dat de gebruiker getallen één voor één in te voeren, waarbij elk getal wordt
   opgeteld bij een sum totaal. Het programma verlaat de loop wanneer de gebruiker -1 invoert en drukt vervolgens de sum
   van alle ingevoerde getallen af (behalve -1). */

package be.intecbrussel.Oefeningen.Oefening5.extraOefening;
//import java.util.InputMismatchException;

import java.util.Scanner;

public class Oefening2 {
    public static void main(String[] args) {
        Scanner myNum = new Scanner(System.in);
        System.out.println("Please Enter the numbers and -1 to exit and calculate the sum");
        int sum = 0;

        //try {
        while (true) {
            System.out.println("Please enter a number: ");
            if (myNum.hasNextInt()) {
                int num = myNum.nextInt();

                if (num == -1) {
                    break;    // it exits the loop if -1 is entered
                }
                sum += num;
            } else {
                System.out.println("Please enter a valid number. ");
                myNum.next(); // clears the invalid input
            }
        }
        System.out.println("The sum of the entered numbers excluding -1 is: " + sum);

        //} catch (
        // (InputMismatchException e) { // InputMismatchException throws exception if data of other data types instead of declared is entered.
        //System.out.println("Please enter a valid number. ");
    }
}

