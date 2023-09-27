/* WhileExample5: Maak een programma dat de gebruiker vraagt om een getal in te geven tussen 0 en 10. Indien de
   gebruiker een ongeldig getal ingeeft, herhaal je de vraag. */

package be.intecbrussel.Opdracht1;

import java.util.Scanner;

public class WhileExample5 {
    public static void main(String[] args) {
        int num;
        Scanner myNum = new Scanner(System.in);
        while (true) {
            System.out.print("Please enter a number between 0 and 10: ");
            if (myNum.hasNextInt()) {
                 num = myNum.nextInt();
                if (num >= 0 && num <= 10) {
                    System.out.print("The entered number is: " + num);
                    break;
                }
                else {
                    System.out.println("The enter number is out of range.");
                    myNum.nextLine();
                }
            } else {
                System.out.println("The number is invalid. ");
                myNum.nextLine();
            }
        }
    }
}


