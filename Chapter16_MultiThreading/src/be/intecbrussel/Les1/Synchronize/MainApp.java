package be.intecbrussel.Les1.Synchronize;

public class MainApp {
    public static void main(String[] args) {
        int n = 10; // Number of threads
        for (int i = 0; i < n; i++) {
            Demo object = new Demo();
            object.start();
        }
    }
}
