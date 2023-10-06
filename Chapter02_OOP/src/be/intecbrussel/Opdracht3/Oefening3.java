/* In het spel zit je met het volgende probleem: Als jij sterker wilt worden, moet je bevriend raken met monsters.
   Je wilt dit op een constructieve manier doen, en het alleen maar tegen de monsters opnemen die je het meeste punten
   geven. De monsters geven je 1, 2 of 3 experience punten, en dat wordt ge-randomized. Je moet nog maar 15 experience
   punten halen. Je wilt maximum maar 10 monsters tegenkomen, en je wilt monsters negeren die maar 1 experience punt
   geven.
   Extra: zorg dat je stopt vanaf dat je een ‘Level up’ hebt bereikt. */

package be.intecbrussel.Opdracht3;

import java.util.Random;

public class Oefening3 {
    public static void main(String[] args) {
        int maxMonsters = 10; // You can only fight maximum 10 monsters.
        int encounteredMonsters;
        int experiencePoints = 0; // Initial experience points.

        for (encounteredMonsters = 1; encounteredMonsters <= maxMonsters; encounteredMonsters++) {
            Random rand = new Random();
            int randExperience = rand.nextInt(3) + 1;   // Generates monsters randomly with 1,2 and 3 experience points. bound 3 generates number from 0 to 2. Hence, +1 to generate from 1 to 3.

            switch (randExperience) {
                case 1:
                    System.out.println("\nMonster encountered having 1 experience points."); // Ignores if monster with 1 point is encountered.
                    break;
                case 2:
                    System.out.println("\nMonster encountered having 2 experience points.");
                    experiencePoints += 2;  // Increase 2 points if monster with 2 experience point is encountered.
                    break;
                case 3:
                    System.out.println("\nMonster encountered having 3 experience points.");
                    experiencePoints += 3;  // Increase 3 points if monster with 3 experience point is encountered.
                    break;
            }

            System.out.println("Total experience points gained: " + experiencePoints); // Prints the experience point collected in every iteration.
            System.out.println("Total numbers of minsters encountered: " + encounteredMonsters); //Prints the encountered monsters in every iteration.

            if (experiencePoints >= 15) {  // Exits the loop if 15 experience points is gained.
                System.out.println("\nYou have reached 15 experience points. Level up!");
                break;
            }
        }

        if (experiencePoints < 15) {  // Prints this if 15 points is not achieved even after encountering max monsters.
            System.out.println("\nHard luck! Max monsters encountered.");
        }
    }
}
