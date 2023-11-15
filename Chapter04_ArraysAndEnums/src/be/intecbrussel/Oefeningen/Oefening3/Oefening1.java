/* Schrijf een programma en maak van de string waarde hierbeneden een char array met index.
   String myString = "Char Array!";
   Uitkomst moet zijn: |0 = C | 1 = h | 2 = a | 3 = r | 4 = | 5 = A | 6 = r | 7 = r | 8 = a | 9 = y | 10 = ! | */

package be.intecbrussel.Oefeningen.Oefening3;

public class Oefening1 {
    public static void main(String[] args) {
        String myString = "Char Array!";
        char[] stringToChar = myString.toCharArray();                      // Creates a char array with the elements of myString.

        for (int index = 0; index < stringToChar.length; index++) {        // To print the elements of stringToChar array.
            System.out.print("|" + index + "=" + stringToChar[index]);
        }
        System.out.println("|");                                           // To print "|" after "!".
    }
}
