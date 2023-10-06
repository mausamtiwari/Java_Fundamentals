/* Er is een manier om extra korting op items te krijgen van verkopers in het spel. Om dat te doen, moet je ze
   cadeautjes geven. Je kunt een maximum ‘FriendShip Rank’ bereiken van 20. Jijzelf beschikt over 43 cadeautjes om te
   geven. Zorg ervoor dat jij je favoriete ‘shopkeeper’ cadeautjes geeft totdat hun FriendShip rank op 20 staat. Vanaf
   dat deze rank bereikt is, moet je stoppen met cadeautjes geven.
   Extra: Voor iedere 5de FriendShip Level, krijg je een Critical, waar 1 cadeautje, 2 punten waard is. */

package be.intecbrussel.Opdracht3;

public class Oefening2 {
    public static void main(String[] args) {
        int friendShipRank = 0;    // Initialise friendship rank with 0 and increases by 1 with each gift given.
        int giftsOwned = 43;       // Total number of gifts in the beginning.
        int giftsGiven = 0;        // Initialise with 0 given gifts.
        int points = 0;            // 0 points in the beginning. Your points increse by 1 with increment in friendship rank.
        int critical = 5;          // In each 5 given gifts, you receive 2 points instead of 1.

        System.out.println("\nYou have total " + giftsOwned + " gifts in the beginning.");   // Prints the initial number of gift.

        do {
            if (friendShipRank % critical == 0 && friendShipRank > 0) {  // In every 5 critical, 2 points is awarded.
                points += 2;
            } else points += 1;     // Points increase by 1 with the increase in friendship rank.

            giftsOwned--;
            giftsGiven++;
            friendShipRank++;

            System.out.println("\nYou have currently " + giftsOwned + " gifts. ");
            System.out.println("you have given " + giftsGiven + " gifts till now.");
            System.out.println("Your friendship rank is " + friendShipRank);
            System.out.println("You have accumulated " + points + " points till now.");

        } while (friendShipRank < 20);  // Continues loop until the friendship rank reaches 20.
        System.out.println("\nCongratulations! The friendship rank has reached 20.");
        System.out.println("You have earned total " + points + " points.");
        System.out.println("You have given total " + giftsGiven + " gifts.");
    }
}
