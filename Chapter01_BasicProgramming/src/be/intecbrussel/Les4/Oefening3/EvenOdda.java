/*
5.1
Maak een broncode met de naam EvenOdda.
5.2
Het programma controleert of een getal even of oneven is.
5.3
Scenario om te testen:
Welcome to EvenOdda Please enter a number: 10 Even Thank you for using our application
5.4
Scenario om te testen:
Welcome to EvenOdda Please enter a number: 9 Odd Thank you for using our application
5.5
Scenario om te testen
Welcome to EvenOdda Please enter a number:
Error!! You have NOT entered any number..
Thank you for using our application.
*/

package be.intecbrussel.Les4.Oefening3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EvenOdda {
    public static void main(String[] args) {
        Scanner myNum = new Scanner(System.in);
        System.out.println("...Welcome to EvenOdda...Please enter the number: ");
        //String input = myNum.nextLine(); // user inputs any string.


        try { // It handles exception if the input is invalid.
            int input = myNum.nextInt();
            //int x = Integer.parseInt(input); // parsing input to integer as only integers can be even or odd.
            if (input % 2 == 0) { // checking if the input is even
                System.out.println("Even...Thank you for using our application");
            } else {
                System.out.println("Odd...Thank you for using our application");
            }
        } catch (InputMismatchException e) { // it throws exception if the entered value is not integer.
            System.out.println(" Error!! Please enter a valid number...Thank you for using our application.");
        }
    }
}
