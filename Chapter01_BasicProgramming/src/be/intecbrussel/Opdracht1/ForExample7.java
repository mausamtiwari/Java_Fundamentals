/* ForExample7: Maak een programma dat alle getallen tussen 0 en 10000 afdrukt die zowel deelbaar door 6 als door 28.
   Hint: maak gebruik van de % operator. */

package be.intecbrussel.Opdracht1;

public class ForExample7 {
    public static void main(String[] args) {
        for (int num = 0; num <= 10000; num++) { // prints the number from 0 to 10000
            if ((num % 6 == 0) && (num % 28 == 0)) { // checks the number if they are  both divisible by 6 and 28
                System.out.println(num);// prints the result.
            }

        }
    }
}
