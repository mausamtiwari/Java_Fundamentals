package be.intecbrussel.Les3;

import java.util.Random;

public class RandomExample1 {
    public static void main(String[] args) {
        Random random = new Random();

        boolean randomBoolean = random.nextBoolean();// generates random boolean.
        System.out.println(randomBoolean);

        double randomDouble  = random.nextDouble(); // generates random double type numbers.
        System.out.println(randomDouble);

        float randomFloat = random.nextFloat();// generates random floating numbers
        System.out.println(randomFloat);

        int randomInt = random.nextInt();// generates random integer.
        System.out.println(randomInt);

        int randomIntBound = random.nextInt(50); // generates random intgers from 0 to 49.
        System.out.println(randomIntBound);
    }
}
