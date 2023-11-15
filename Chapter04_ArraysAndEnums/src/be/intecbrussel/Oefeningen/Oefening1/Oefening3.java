// Schrijf een programma om de even en oneven nummer te vinden in een int array.

package be.intecbrussel.Oefeningen.Oefening1;

public class Oefening3 {
    public static void main(String[] args) {

        int[] evenOdd = {12, 13, 14, 15, 19, 17, 18};             // Created an array
        int arrLength = evenOdd.length;                           // Gets the length of the array

        for (int i = 0; i < arrLength; i++) {                     // Loops through the array

            if (evenOdd[i] % 2 == 0) {                            // Checks if the elements are even or odd.
                System.out.println(evenOdd[i] + " is even");      // Prints if even.
            } else {
                System.out.println(evenOdd[i] + " is odd");       // Prints if odd.
            }
        }


    }
}
