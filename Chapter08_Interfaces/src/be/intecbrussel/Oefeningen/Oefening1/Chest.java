package be.intecbrussel.Oefeningen.Oefening1;

public class Chest implements Lock {
    private boolean locked = true;      // Initially the chest is locked.

    @Override
    public void lock() {
        if (!locked) {                 // If the chest is not locked, locks the chest.
            locked = true;
            System.out.println("The chest is locked.");
        } else {                       // If the chest is already locked, prints already locked.
            System.out.println("The chest is already locked.");
        }
    }

    @Override
    public void unlock() {
        if (locked) {             // If the chest is locked, unlocks the chest.
            locked = false;
            System.out.println("The chest is now unlocked.");
        } else {                  // If the chest is already unlocked, prints already unlocked.
            System.out.println("The chest is already unlocked.");
        }
    }
}
