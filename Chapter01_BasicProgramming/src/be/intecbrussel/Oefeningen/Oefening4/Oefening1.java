// Gebruik een for loop. Print elke waarde die je door 7 kunt delen van 1 tot en met 100 in omgekeerde volgorde.

package be.intecbrussel.Oefeningen.Oefening4;

public class Oefening1 {
    public static void main(String[] args) {

        for (int number = 100; number >= 1; number--) {
            if (number % 7 == 0) {// checks if the number is multiple of 7
                System.out.println(number);

            }
        }
    }
}
