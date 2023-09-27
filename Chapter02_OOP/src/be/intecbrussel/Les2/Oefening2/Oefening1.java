// Maak een applicatie die kan controleren of een bepaald woord een palindroom is.

package be.intecbrussel.Les2.Oefening2;

import java.util.Scanner;

public class Oefening1 {
    public static void main(String[] args) {
        System.out.println("Please enter a world to check if it is a palindrome: ");
        Scanner myWord = new Scanner(System.in);// gets string from user.
        StringBuilder str = new StringBuilder();// creates a new string builder.
        str.append(myWord.nextLine());// appends the string in the stringBuilder object.

        /*System.out.println(str);
          System.out.println(str.reverse()); //Reverses the stringBuilder
          str.toString();// Represents the stringBuilder in string format.
          str.reverse().toString();// represents the reverse of stringBuilder "str" in string.*/

        if (str.toString().equals(str.reverse().toString())) { // Represents both stringBuilders in string format and
            //  compares the value of the string using .equals() method
            System.out.println("The word is a palindrome.");
        } else {
            System.out.println("The word is not a palindrome.");
        }
    }
}
