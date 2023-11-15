// Schrijf een programma om te controleren of een lijst alleen even bevat

package Oefeningen.Oefening3;

import java.util.Arrays;
import java.util.List;

public class OnlyEven {
    public static void main(String[] args) {
        // Created a list of numbers called integerList.
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
        System.out.println(integerList);

        // Checks if all the numbers in the list are even and returns true if so.
        boolean evenOdd = integerList.stream().allMatch(n -> n % 2 == 0);
        System.out.println("IntegerList contains only even integers: " + evenOdd);
    }
}
