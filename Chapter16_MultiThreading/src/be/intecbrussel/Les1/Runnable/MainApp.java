package be.intecbrussel.Les1.Runnable;

public class MainApp {
    public static void main(String[] args) {
        int n = 10; // Number of threads
        for (int i = 0; i < n; i++) {
            Thread object = new Thread(new MultiThreadingDemo());
            object.start();
        }
    }
}
