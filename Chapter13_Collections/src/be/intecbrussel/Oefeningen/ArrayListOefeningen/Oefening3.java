/* Maak een kleine applicatie die de gebruiker vraagt naar woorden. Voeg de input van de gebruiker toe aan een
   ArrayList. De applicatie moet stoppen als de gebruiker het woord "end" ingeeft.*/

package be.intecbrussel.Oefeningen.ArrayListOefeningen;

import java.util.ArrayList;
import java.util.Scanner;

public class Oefening3 {
    public static void main(String[] args) {
        // ArrayList created
        ArrayList<String> arrayList = new ArrayList<>();
        Scanner myScan = new Scanner(System.in);

        // Continuously asks to enter a word.
        while (true) {
            System.out.print("Please enter a word: ");
            String words = myScan.nextLine();

            // Asks to enter alphabetical words until valid input is provided.
            while (!isValidInput(words)) {
                System.out.println("Invalid input. Only alphabetical words allowed.");
                System.out.println("Please enter a word: ");
                words = myScan.nextLine();
            }

            // Adds words to arrayList.
            arrayList.add(words);

            // Checks if "end" word is entered and breaks loop if "end" entered.
            if (words.equalsIgnoreCase("end")) {
                break;
            }
        }

        System.out.println(arrayList);
    }

    private static boolean isValidInput(String input) {
        // Makes sure the input contains one or more lower or uppercased alphabetical letters.
        return input.matches("[a-zA-Z]+");  // Regular expression of alphabetical words either in lower or uppercase.
    }

}

