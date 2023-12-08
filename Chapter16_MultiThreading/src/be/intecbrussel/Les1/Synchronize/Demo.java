package be.intecbrussel.Les1.Synchronize;

public class Demo extends Thread {
    @Override
    public void run() {
        try {

            // Displaying the thread that is running
            System.out.println("Thread " + Thread.currentThread().getId() + " is running.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
