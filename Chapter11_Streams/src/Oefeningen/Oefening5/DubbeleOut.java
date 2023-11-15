// Schrijf een programma om alle dubbele elementen uit een lijst te verwijderen met behulp van streams.

package Oefeningen.Oefening5;

import java.util.Arrays;
import java.util.List;

public class DubbeleOut {
    public static void main(String[] args) {
        // Created a list of strings called listString.
        List<String> listString = Arrays.asList("Apple", "Apple", "Ball", "Banana", "Banana", "Apple", "Ball");
        System.out.println("The original list: " + listString);

        // Removing duplicates
        List<String> dubbeleRemoved = listString.stream()
                .distinct()              // This gives only the unique elements.
                .toList();

        System.out.println("List after duplicates are removed: " + dubbeleRemoved);

    }
}
