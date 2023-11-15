/* Maak een string aan met deze zin “Maak van deze string een char array”. Vervolgens gebruik je een methode om hier
   een char array van te maken. (Tip: bekijk de klas String). Tot slot print de char array uit. */

package be.intecbrussel.Oefeningen.Oefening2;


import java.util.Arrays;


public class Oefening2 {
    public static void main(String[] args) {
        String str = ("Maak van deze string een char array");

        char[] charArr = new char[str.length()];      // Created an array named charArr of char data type with the same length of srt array.

        for (int i = 0; i < str.length(); i++) {          //assigned the values to charArr from str array.
            charArr[i] = str.charAt(i);
        }

        for (int j = 0; j < charArr.length; j++) {          // Prints each characters from charArr array.
            System.out.print(charArr[j]);
        }

        System.out.println("\n" + Arrays.toString(charArr));  // Prints the string array as the char array.

    }
}