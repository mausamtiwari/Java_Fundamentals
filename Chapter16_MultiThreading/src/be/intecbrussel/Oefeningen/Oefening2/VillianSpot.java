package be.intecbrussel.Oefeningen.Oefening2;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Random;

public class VillianSpot {
    public static void main(String[] args) {
        Random random = new Random();
        TimeBomb timeBomb = new TimeBomb(10); // Bomb has 10 seconds!

        Thread thread1 = new Thread(timeBomb::activate);
        Thread thread2 = new Thread(timeBomb::disarm);
        Thread thread3 = new Thread(() -> System.out.print("Kaboom! The bomb has exploded."));

        // Activate the bomb.
        thread1.start();

        // Time when the bomb is activated.
        LocalDateTime bombActivationTime = LocalDateTime.now();
        System.out.println(" at :" + bombActivationTime);

        // Time when the bomb is disarmed or Blasted.
        LocalDateTime bombDiffuseTime = null;


        try {
            // Count down begins. 10 seconds left for the bomb to explode.
            for (int seconds = 10; seconds > 0; --seconds) {
                System.out.println(seconds);
                Thread.sleep(1000);
            }

            // Bomb explodes after 10 seconds. Bomb explode only once.
            //Avoids IllegalThreadStateException
            if (thread3.getState() == Thread.State.NEW) {
                thread3.start();
            }

            Thread.sleep(random.nextLong(30000));  // It will take us between 0-30 secs to disarm the bomb.
            // Bomb explosion Time.
            bombDiffuseTime = LocalDateTime.now();


            // If the duration is less than 10 seconds, bomb can be disarmed.
            if (ChronoUnit.SECONDS.between(bombActivationTime, bombDiffuseTime) < 10) {
                thread2.start();

                LocalDateTime bombDisarmedTime = LocalDateTime.now();
                System.out.println(" at : " + bombDisarmedTime);
            } else {
                // Else bomb explodes if it has not already exploded..
                if (thread3.getState() == Thread.State.NEW) {
                    thread3.start();
                }
                // Waits for bomb to explode.(Thread3)
                LocalDateTime bombExplodeTime = LocalDateTime.now();
                System.out.println(" at: " + bombExplodeTime);

                // Time taken to explode or disarm the bomd.
                Duration duration = Duration.ofSeconds(ChronoUnit.SECONDS.between(bombActivationTime, bombDiffuseTime));
                System.out.println("The total time taken is: " + duration);
            }

        } catch (InterruptedException | IllegalThreadStateException e) {
            e.printStackTrace();
        }

    }

}
