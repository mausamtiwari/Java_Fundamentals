package be.intecbrussel.Streams;

import java.time.LocalDate;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;


public class Opdracht1 {
    public List<String> toUppercase(List<String> strings) {
        return strings.stream()
                .map(String::toUpperCase)          // Converts string to UpperCase.
                .toList();                         // Lists.
    }

    public List<String> filterA(List<String> strings) {
        return strings.stream()
                .filter(s -> s.toUpperCase().startsWith("A"))      // Converts the strings to Uppercase and filters the elements starting with a.
                .toList();                                         // Used toUppercase to ingnore the case.
    }

    public List<String> filterB(List<String> strings) {
        return strings.stream()
                .filter(s -> s.toUpperCase().startsWith("A") && s.length() > 3)   // Filters elements starting with a and whose lenght is greater than 3.
                .toList();
    }

    public List<String> filterC(List<String> strings) {
        return strings.stream()
                .filter(s -> s.toUpperCase().startsWith("A") && s.length() > 3)   // Filters elements starting with a and whose lenght is greater than 3.
                .map(s -> new StringBuilder(s).reverse().toString())              // Creates a new string builder reverses the elements and convertes it to string.
                .toList();
    }

    public String filterD(List<String> strings) {
        return strings.stream()
                .filter(s -> s.toUpperCase().startsWith("A") && s.length() > 3)   // Filters elements starting with a and whose lenght is greater than 3.
                .map(s -> new StringBuilder(s).reverse().toString())              // Creates a new string builder reverses the elements and convertes it to string.
                .collect(Collectors.joining(", "));                       // Seperates the elements with comma.
    }

    public String filterE(List<String> strings) {
        return strings.stream()
                .filter(s -> s.toUpperCase().startsWith("A") && s.length() > 3)  // Filters elements starting with a and whose lenght is greater than 3.
                .map(s -> new StringBuilder(s).reverse().toString())             // Creates a new string builder reverses the elements and convertes it to string.
                .map(String::toUpperCase)                                        // Changes to upper case.
                .collect(Collectors.joining(", "));                     // Seperates the elements with comma.
    }

    public String filterF(List<String> strings) {
        return strings.stream()
                .filter(s -> s.toUpperCase().startsWith("A") && s.length() > 3)   // Filters elements starting with a and whose lenght is greater than 3.
                .map(s -> new StringBuilder(s).reverse().toString())              // Creates a new string builder reverses the elements and convertes it to string.
                .map(s -> s.length()>10? s.substring(0,10):s.toUpperCase()) // Gets elements with max length of 10 characters and converts to uppercase.
                .collect(Collectors.joining(", "));                       // Seperates the elements with comma.
    }

    public String filterG(List<String> strings) {
        return strings.stream()
                .filter(s -> s.toUpperCase().startsWith("A") && s.length() > 3)   // Filters elements starting with a and whose lenght is greater than 3.
                .map(s -> new StringBuilder(s).reverse().toString())              // Creates a new string builder reverses the elements and convertes it to string.
                .map(s -> s.length()>10? s.substring(0,10):s.toUpperCase()) // Gets elements with max length of 10 characters and converts to uppercase.
                .map(s -> new StringBuilder("Prefix:- " + s + " -:Suffix"))       // Writes prefix and suffix before and after each element.
                .collect(Collectors.joining(", "));                       // Seperates the elements with comma.
    }

    public String filterH(List<String> strings) {
        return strings.stream()
                .filter(s -> s.toUpperCase().startsWith("A") && s.length() > 3)    // Filters elements starting with a and whose lenght is greater than 3.
                .map(s -> new StringBuilder(s).reverse().toString())               // Creates a new string builder reverses the elements and convertes it to string.
                .map(s -> s.length()>10? s.substring(0,10):s.toUpperCase())  // Gets elements with max length of 10 characters and converts to uppercase.
                .map(s -> new StringBuilder("Prefix:- " + s + " -:Suffix"))        // Writes prefix and suffix before and after each element.
                .map(s -> s.append(", UniqueNumber: ").append(getUniqueNumber()))  // Generates a unique number( random dates) with the help of getUniqueNumber method below and appends it to String Builder.
                .collect(Collectors.joining(", "));                        // Seperates the elements with comma.
    }

    public String filterI(List<String> strings) {
        return strings.stream()
                .filter(s -> s.toUpperCase().startsWith("A") && s.length() > 3)    // Filters elements starting with a and whose lenght is greater than 3.
                .map(s -> new StringBuilder(s).reverse().toString())               // Creates a new string builder reverses the elements and convertes it to string.
                .map(s -> s.length()>10? s.substring(0,10):s.toUpperCase())  // Gets elements with max length of 10 characters and converts to uppercase.
                .map(s -> new StringBuilder("Prefix:- " + s + " -:Suffix "))       // Writes prefix and suffix before and after each element.
                .map(s -> s.append(", UniqueNumber: ").append(getUniqueNumber())   // Generates a unique number( random dates) with the help of getUniqueNumber method below and appends it to String Builder.
                        .append(", Random Number: ").append(Math.round(100 * Math.random()))) // Appends a radom number with the help of inbuild Random method.
                .collect(Collectors.joining(", "));                        // Seperates the elements with comma.
    }

    public static LocalDate getUniqueNumber() {            // Method to genrate a random date, which is then passed as a unique number.
        int dates = 100 * 365;                             // Chooses a random day in 100 years of period.
        // Chooses a random day in 100 years before and after the epoch.
        return LocalDate.ofEpochDay(ThreadLocalRandom.current().nextInt(-dates, dates));
    }


}
