/* Maak een applicatie die je kan vertellen aan de hand van de maand hoeveel dagen deze telt van het
   huidige jaar*/

package be.intecbrussel.Les4.Oefening3;

import java.util.Scanner;

public class Oefening3 {
    public static void main(String[] args){
        Scanner myMonth = new Scanner(System.in);
        System.out.println("Please enter the month: ");
        String month = myMonth.nextLine();

        switch (month) {
            case "January" -> System.out.println("January has 31 days.");
            case "February" -> System.out.println("February has 28 days.");
            case "March" -> System.out.println("March has 31 days.");
            case "April" -> System.out.println("April has 30 days.");
            case "May" -> System.out.println("May has 31 days.");
            case "June" -> System.out.println("June has 30 days.");
            case "July" -> System.out.println("July has 31 days.");
            case "August" -> System.out.println("August has 31 days.");
            case "September" -> System.out.println("September has 30 days.");
            case "October" -> System.out.println("October has 31 days.");
            case "November" -> System.out.println("November has 30 days.");
            case "December" -> System.out.println("December has 31 days.");
            default -> System.out.println("Invalid month.");
        }
    }
}
