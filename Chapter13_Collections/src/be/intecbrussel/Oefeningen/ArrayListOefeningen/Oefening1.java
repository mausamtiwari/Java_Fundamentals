/* Maak een ArrayList wordSet voeg hier een aantal woorden aan toe. Maak vervolgens een tweede ArrayList die
   ook een reeks van woorden zal bevatten, Voeg nu beide ArrayList samen in een nieuwe ArrayList.*/

package be.intecbrussel.Oefeningen.ArrayListOefeningen;

import java.util.ArrayList;
import java.util.List;

public class Oefening1 {
    public static void main(String[] args) {
        // First ArrayList created and elements added.
        ArrayList<String> wordSet = new ArrayList<>();
        wordSet.add("Hello");
        wordSet.add("Hallo");
        wordSet.add("olá");
        wordSet.add("Namaste");
        wordSet.add("Bonjour");

        // Second ArrayList created and elements added.
        ArrayList<String> wordSet2 = new ArrayList<>();
        wordSet2.add("John");
        wordSet2.add("Doe");
        wordSet2.add("Donald");
        wordSet2.add("Barack");
        wordSet2.add("Albert");

        // Third ArrayList containing first and second ArrayList.
        List<String> newArrayList = new ArrayList<>(wordSet);
        newArrayList.addAll(wordSet2);

        System.out.println("First list is: " + wordSet);
        System.out.println("Second list is: " + wordSet2);
        System.out.println("The new combined list is : " + newArrayList);
    }


}
