// Schrijf een programma om het product van alle elementen in een lijst te vinden met behulp van streams.

package Oefeningen.Oefening4;

import java.util.Arrays;
import java.util.List;

public class ProductList {
    public static void main(String[] args) {
        // Created a list of numbers called integerList.
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4);

        // Calculated the product of the integers in evenList.
        int integerListProduct = integerList.stream().reduce(1, (a, b) -> a * b);

        // Printed the average of the numbers in evenList
        System.out.println("The product of integers in the list is: " + integerListProduct);


    }
}
