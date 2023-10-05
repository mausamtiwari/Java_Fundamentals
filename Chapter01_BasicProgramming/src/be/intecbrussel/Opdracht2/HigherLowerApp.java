/* Deze Java-code vertegenwoordigt een eenvoudig gokspel, genaamd "Higher Lower App". Het doel van dit spel is om te
raden welk willekeurig gegenereerd getal tussen 0 en 99 de computer heeft geselecteerd. Hier is een uitleg van de
belangrijkste stappen en het doel van de code:

1- Welkomstbericht: Het programma begint met het afdrukken van een welkomstbericht:

   Welcome to Higher Lower App.

2- Scanner en Random Generator: Het programma maakt een Scanner-object aan om gebruikersinvoer te lezen en een
   Random-object om een willekeurig getal tussen 0 en 99 te genereren. Dit willekeurige getal wordt opgeslagen in de
   variabele randomNumber.

3- Spelloop: Het spel heeft een while-loop die doorgaat zolang doesNotMatch waar is. Deze variabele wordt gebruikt om te
   controleren of de speler het juiste getal heeft geraden. Zolang doesNotMatch waar is, blijft de speler raden.

4- Radengedeelte: Binnen de while-loop wordt de speler gevraagd om een getal te raden:

   Guess the number:

   De ingevoerde gok wordt opgeslagen in de variabele guessedNumber.

5- Vergelijking met het willekeurige getal: Het programma vergelijkt de ingevoerde gok (guessedNumber) met het
   willekeurige getal (randomNumber). Afhankelijk van de vergelijking wordt een van de volgende berichten afgedrukt:

  A- Als de gok kleiner is dan het willekeurige getal, wordt "Higher" afgedrukt.
  B- Als de gok groter is dan het willekeurige getal, wordt "Lower" afgedrukt.
  C- Als de gok gelijk is aan het willekeurige getal, wordt "Congrats!" afgedrukt, en de waarde van doesNotMatch wordt
     ingesteld op false, wat de while-loop beëindigt omdat de speler het juiste getal heeft geraden.

6- Einde van het spel: Nadat de speler het juiste getal heeft geraden, wordt het volgende bedankbericht afgedrukt:

  Thank you for choosing our app. */

package be.intecbrussel.Opdracht2;

import java.util.Random;
import java.util.Scanner;

public class HigherLowerApp {
    public static void main(String[] args) {

        int guessedNumber;
        boolean numMatch = false;
        System.out.println("Welcome to the Higher Lower app.");
        Scanner guess = new Scanner(System.in);
        System.out.print("Please guess a number: ");
        Random rand = new Random();
        int randomNumber = rand.nextInt(101);  // generates random number upto 100.

        while (!numMatch) {

            if (guess.hasNextInt()) { // Cehcks if the input is of int data type.
                guessedNumber = guess.nextInt();

                if (guessedNumber == randomNumber) { // if guessed number is equal to randomly generated number, exits the loop.
                    System.out.println("Congrats! You guessed it right. The randomly generated number is: " + randomNumber);
                    numMatch = true;
                } else if (guessedNumber > randomNumber) { // If the guessed number is higher, asks user to try again.
                    System.out.print("The guessed number is higher than randomly generated number, " + randomNumber + ". Please try again: ");
                    guess.nextLine();
                } else { // If the guessed number is lower , asks user to try again.
                    System.out.print("The guessed number is lower than randomly generated number, " + randomNumber + ". Please try again: ");
                    guess.nextLine();
                }

            } else { // If the input is other than int data type prompts user to enter valid integer.
                System.out.print("Please enter a valid integer: ");
                guess.nextLine();
            }
        }

        System.out.println("Thank you for chosing our app.");
    }
}
