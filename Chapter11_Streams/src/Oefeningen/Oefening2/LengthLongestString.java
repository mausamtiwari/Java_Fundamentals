// Schrijf een programma om de lengte van de langste string in een lijst te vinden met behulp van streams.

package Oefeningen.Oefening2;

import java.util.Arrays;
import java.util.List;

public class LengthLongestString {
    public static void main(String[] args) {
        // Created a list of strings called listString.
        List<String> listString = Arrays.asList("Hello", "My", "Name", "is", "Mausam", "I", "Love", "Java");

        // Finding the String with the longest length
        int longest = listString.stream()
                .map(String::length)                    // Gets the length of each element.
                .max(Integer::compare)                  // Finds the maximum value by comparing the length of each element.
                .get();                                 // Retrieves the max value.

        System.out.println(longest);


    }
}
