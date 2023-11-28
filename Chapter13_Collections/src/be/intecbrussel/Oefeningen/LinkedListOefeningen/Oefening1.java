// Converteer de ArrayList van ArrayList Oefening 1 naar een LinkedList overloop en overloop de lijst.

package be.intecbrussel.Oefeningen.LinkedListOefeningen;

import java.util.LinkedList;

public class Oefening1 {
    public static void main(String[] args) {
        // LinkedList created and elements added.
        LinkedList<String> wordSet = new LinkedList<>();
        wordSet.add("Hello");
        wordSet.add("Hallo");
        wordSet.add("olá");
        wordSet.add("Namaste");
        wordSet.add("Bonjour");

        // Prints LinkedList
        wordSet.forEach(s -> System.out.print(s + " "));

    }


}
