package be.intecbrussel.Les1;

public class PrintAppLambda {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> print('c', 10));
        Thread thread2 = new Thread(() -> print('*', 10));

        System.out.println(thread1.getState());
        System.out.println(thread2.getState());

        thread1.start();
        System.out.println(thread1.getState());

        thread2.start();
        System.out.println(thread2.getState());
        print('&', 10);

    }

    public static void print(char c, int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(c);
        }
    }
}
