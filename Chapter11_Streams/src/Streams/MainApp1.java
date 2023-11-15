package Streams;

import java.util.List;

public class MainApp1 {
    public static void main(String[] args) {
        Opdracht1 opdracht1 = new Opdracht1();       //Instantiates Opdracht1.
        // Declares and initialises a String List.
        List<String> stringList = List.of("add", "ball", "AalstIsInVlaanderen", "Ahmed", "appleIsTheBest", "Mausam", "Cat", "Arizona", "ant");


        // Changes the elements to UpperCase.
        List upperCased = opdracht1.toUppercase(stringList);
        System.out.println("String with elements in upper case : " + upperCased);

        // Gets the elements starting with letter 'a', case ignored.
        List startWithA = opdracht1.filterA(stringList);
        System.out.println("Elements starting with a are: " + startWithA);

        // Gets elements starting with 'a' and of length more than 3.
        List startWithAlength3 = opdracht1.filterB(stringList);
        System.out.println("Elements having length of more than 3 and starting with 'a' are: " + startWithAlength3);

        // Reverses the elements in the List.
        List startWithAlength3reverse = opdracht1.filterC(stringList);
        System.out.println("Reversed elements having length of more than 3 and starting with 'a' are: " + startWithAlength3reverse);

        // Changes the List to String.
        String concatenation = opdracht1.filterD(stringList);
        System.out.println("Reversed elements having length of more than 3, starting with 'a' and converted to String are: " + concatenation);

        // Converts the element of String to UpperCase.
        String concatToUpperCase = opdracht1.filterE(stringList);
        System.out.println("String with comma and uppercased are: " + concatToUpperCase);

        // Gets the elements with max 10 characters.
        String char10 = opdracht1.filterF(stringList);
        System.out.println("Elements with max 10 characters are " + char10);

        // Writes Prefix and Suffix before and after each element.
        String preSuffix = opdracht1.filterG(stringList);
        System.out.println("String with elements with Prefix and Suffix are: " + preSuffix);

        // Appenda an unique number to each element.
        String uniekNumber = opdracht1.filterH(stringList);
        System.out.println("String with elements with Suffix prefix and unique Number are: " + uniekNumber);

        // Generates a random number for each element.
        String randNumber = opdracht1.filterI(stringList);
        System.out.println("String with elements with Suffix prefix, unique Number and Random Number are: " + randNumber);


    }
}
