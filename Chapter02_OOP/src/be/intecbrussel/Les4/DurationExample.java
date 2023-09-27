package be.intecbrussel.Les4;

import java.time.*;


public class DurationExample {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        //DateTimeFormatter myFormatter = DateTimeFormatter.ofPattern("dd-Mm-yy HH_mm:ss");
        LocalDateTime oldDate = LocalDateTime.of(2016, 8,31,10,20,55);

        //String formattedDate = ldt.format(myFormatter);

        // De methode getSeconds() gaat de seconde bereken van 1 uur (ofHours(1))
        Duration seconds = Duration.ofHours(1);
        System.out.println(seconds.getSeconds() + " seconds");

        // Dit bereken de tijd in seconde tussen de nu en de oude datum die we hebben gecreeerd.
        Duration duration = Duration.between(oldDate,ldt);
        System.out.println(duration.getSeconds()+ " seconds");


    }
}
