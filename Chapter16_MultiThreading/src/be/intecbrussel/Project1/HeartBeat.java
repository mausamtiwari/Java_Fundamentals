package be.intecbrussel.Project1;

public class HeartBeat implements Runnable {

    private int milliSecondsBetweenBeats;

    public HeartBeat(int milliSecondsBetweenBeats) {
        this.milliSecondsBetweenBeats = milliSecondsBetweenBeats;
    }

    @Override
    public void run() {
        try {
            // An infinite loop created which continues until the thread is interrupted.
            while (!Thread.interrupted()) {
                // Thread sleeps for some time.
                Thread.sleep(milliSecondsBetweenBeats);
            }
        } catch (InterruptedException e) {
            e.toString();
        }

    }


}
