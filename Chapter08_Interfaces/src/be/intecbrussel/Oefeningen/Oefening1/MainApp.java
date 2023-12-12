/* Maak een interface genaamd Lock met de methodes en Maak een class Chest die deze interface zal implementeren.
   void lock()
   void unlock()
 */

package be.intecbrussel.Oefeningen.Oefening1;

public class MainApp {
    public static void main(String[] args) {
        Chest chest = new Chest();
        chest.lock();        // Trying to lock the chest. But the chest is initially locked.
        chest.unlock();      // Unlocking the chest.
        chest.lock();        // Locking the chest.
        chest.lock();        // Trying to lock the already locked chest.

    }
}
