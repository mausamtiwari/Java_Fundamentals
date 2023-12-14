package be.intecbrussel.Project1;

import java.util.Random;

public class Person implements Runnable {

    private String name;
    private int age;

    private Thread heart;
    private Thread breathing;
    private Thread life;

    public Person(String name, int age, int heartBeatMilliSeconds) {
        this.name = name;
        this.age = age;
        this.heart = new Thread(new HeartBeat(1000));
        this.breathing = new Thread(new Lungs());
        this.life = new Thread(this);
    }

    @Override
    public void run() {
        try {
            Random random = new Random();
            //  Runs the loop with the startpoint of the person's age.
            for (int i = age; i < 100; i++) {
                // Creates a random number from 0 to 20
                int randInt = random.nextInt(21);
                Thread.sleep(1000);
                // If the number generated is 13, ends life.
                if (randInt == 13) {
                    endLife();
                    break;
                }
            }
        } catch (InterruptedException e) {
            e.toString();
        }
    }

    // Starts breathing, heart and ultimately life.
    public void startLife() {
        breathing.start();
        heart.start();
        life.start();
    }

    // Ends breathing, heart and ultimately life.
    public void endLife() {
        breathing.interrupt();
        heart.interrupt();
        life.interrupt();
    }
}
