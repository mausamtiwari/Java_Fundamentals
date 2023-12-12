package be.intecbrussel.LabwerkMultiThreading;

public class ThreadVoorbeeld {

    private int count = 0;

    public static void main(String[] args) {
        ThreadVoorbeeld voorbeeld = new ThreadVoorbeeld();
        InnerThread thread1 = new InnerThread(voorbeeld);
        InnerThread thread2 = new InnerThread(voorbeeld);
        InnerThread thread3 = new InnerThread(voorbeeld);
        thread1.start();
        thread2.start();
        thread3.start();

        System.out.println("Hallo vanaf hoofdThread.");
    }


    private static class InnerThread extends Thread {
        private ThreadVoorbeeld voorbeeld;

        public InnerThread(ThreadVoorbeeld voorbeeld) {
            this.voorbeeld = voorbeeld;

        }

        @Override
        public void run() {
            voorbeeld.incrementCount();
            System.out.println("Hallo vanaf thread " + this.getId() + " , count is nu " + voorbeeld.getCount());
        }
    }

    public synchronized void incrementCount() {
        count++;
    }

    public int getCount() {
        return count;
    }
}
