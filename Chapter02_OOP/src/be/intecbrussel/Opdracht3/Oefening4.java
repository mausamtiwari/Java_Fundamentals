/* Er wordt een event met lootboxes georganiseerd! Je kunt de FriendShip Crown winnen, en om het uit te proberen heb je
   maar 3 credits nodig! Zelf heb je er op dit moment nog 17. Om te winnen moet een getal rollen op een 20-zijdige
   dobbelsteen. Als je 13 gooit, dan ben je gewonnen, en stopt het spel. Als je 7 gooit, dan krijg je 2 extra credits,
   maar dan speel je verder. Maak een applicatie dit automatisch voor jou doet.
   Extra: Je hebt 22 Euro op zak, en je beslist om extra credits te kopen aan 5 euros voor 20 credits als je de FriendShip
   Crown nog niet hebt kunnen winnen. Maak een nieuwe do/while rond de originele while loop. Hierin geef je de gebruiker
   de optie om om geld uit te geven voor credits, indien die nogmaals wilt proberen om de kroon te trekken. Zorg ervoor
   dat de gebruiker de vraag niet krijgt als hij/ zij/ hun al de Crown gewonnen hebben. */

package be.intecbrussel.Opdracht3;

import java.util.Random;
import java.util.Scanner;

public class Oefening4 {
    public static void main(String[] args) {

        int CurrentCredit = 17;
        int CurrentEuro = 22;


        Scanner scan = new Scanner(System.in);
        System.out.println("Do you want to buy 20 credits for 5 euros?: ");
        String myChoice = scan.nextLine();

        do {
            if (myChoice.equalsIgnoreCase("y")) {
                CurrentCredit += 20;
                CurrentEuro -= 5;
                System.out.println(CurrentCredit);
                System.out.println(CurrentEuro);
                System.out.println("Congratulations yout have won the lootbox.");

            } else if (myChoice.equalsIgnoreCase("n")) {

                Random rand = new Random();
                int RandCredit = rand.nextInt(20) + 1;
                System.out.println("You rolled: " + RandCredit);

                if (RandCredit == 13) {

                    CurrentCredit = CurrentCredit + 3;
                    System.out.println("Your curremt credit is : " + CurrentCredit);
                    System.out.println("Congratulations you won!");
                    break;

                } else if (RandCredit == 7) {

                    System.out.println("Your current credit is: " + (CurrentCredit += 2));
                    scan.nextLine();

                } else {
                    System.out.println("You have lost.");
                    break;

                }

            }
        }
        while (CurrentCredit <= 20);


    }
}
