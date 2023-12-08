package be.intecbrussel.Les1.Runnable;

public class MultiThreadingDemo implements Runnable {
    @Override
    public void run() {
        try {
            // Displaying the thread that is running
            System.out.println("Thread " + Thread.currentThread().getId() + " is running.");

        } catch (Exception e) {
            System.out.println("Exception is caught.");
        }
    }
}
