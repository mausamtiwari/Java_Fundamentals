// Schrijf een programma om de huidige tijd en datum te krijgen

package be.intecbrussel.Oefeningen.Oefening7;

import java.time.LocalDateTime;

public class Oefening1 {
    public static void main(String[] args) {
        LocalDateTime ltdNow = LocalDateTime.now();
        System.out.println("The present date and Time is: " + ltdNow);

    }
}
