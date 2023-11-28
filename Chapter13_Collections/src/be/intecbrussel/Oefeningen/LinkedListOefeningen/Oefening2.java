/* Maak een nieuwe list met de naam"sentence", datatype String en schrijf deze methoden printSentence,
   printSentenceInReverseOrder, printNumberOfWords. En roep alle methoden op in de main methode. */

package be.intecbrussel.Oefeningen.LinkedListOefeningen;

import java.util.Collections;
import java.util.LinkedList;


public class Oefening2 {
    // Global LinkedList of type String created
    static LinkedList<String> sentence = new LinkedList<>();

    // Main method.
    public static void main(String[] args) {

        // Added elements to the LinkedList.
        sentence.add("Hello! ");
        sentence.add("My ");
        sentence.add("name ");
        sentence.add("is ");
        sentence.add("Mausam.");

        // Called methods.
        printSentence();
        printSentenceInReverseOrder();
        printNumberOfWords();
    }

    // Prints the elements as a sentence.
    public static void printSentence() {
        for (String s : sentence) {
            System.out.print(s);
        }
        System.out.println();
    }

    // Prints the sentence in reverse order.
    public static void printSentenceInReverseOrder() {
        Collections.reverse(sentence);
        sentence.forEach(i -> System.out.print(i + " "));
        System.out.println();
    }

    // Pritns the number of words used.
    public static void printNumberOfWords() {
        int size = sentence.size();
        System.out.println("There are " + size + " words in the sentence.");
    }
}
