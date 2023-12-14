package be.intecbrussel.Project1;

public class Lungs implements Runnable {

    private boolean lungsFull;


    @Override
    public void run() {
        try {
            // An infinite loop created which continues until the thread is interrupted.
            while (!Thread.interrupted()) {
                System.out.println(lungsFull?"Breathe out. ": "Breathe in.");
                // Thread sleeps for a second.
                Thread.sleep(1000);
                // if the lung was full it becomes not full and if not full it becomes full.
                lungsFull = !lungsFull;
            }
        } catch (InterruptedException e) {
            e.toString();
        }

    }

}

