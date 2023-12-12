/* Maak een applicatie die 10 seconden aftelt. Gebruik hiervoor Thread.sleep() en toon ook de huidige tijd aan met
   LocalDateTime.*/

package be.intecbrussel.Oefeningen;

import java.time.LocalDateTime;

public class Oefening1 {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Start time" + LocalDateTime.now());
        System.out.println("The countdown begins.");
        try {
            for (int i = 10; i > 0; --i) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Happy New Year!");
        System.out.println("End time: " + LocalDateTime.now());


    }
}
