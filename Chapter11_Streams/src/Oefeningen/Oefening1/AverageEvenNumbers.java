// Schrijf een programma om het gemiddelde van alle even getallen in een lijst te vinden met behulp van streams.

package Oefeningen.Oefening1;

import java.util.Arrays;
import java.util.List;

public class AverageEvenNumbers {
    public static void main(String[] args) {
        // Created a list of numbers called integerList.
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
        System.out.println("The original list is: " + integerList);

        // Filtered even numbers in the list and made a new list even
        List<Integer> evenList = integerList.stream().filter(x -> x % 2 == 0).toList();
        System.out.println("Even number in the list are: " + evenList);

        // Calculated the sum of the integers in evenList.
        double evenSum = evenList.stream()
                .mapToInt(Integer::intValue)
                .sum();

        // Printed the average of the numbers in evenList
        System.out.println("The average of even numbers in the list is: " + evenSum / (evenList.size()));


    }
}
