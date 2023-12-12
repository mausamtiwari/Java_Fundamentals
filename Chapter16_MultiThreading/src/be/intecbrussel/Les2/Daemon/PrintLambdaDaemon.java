package be.intecbrussel.Les2.Daemon;

public class PrintLambdaDaemon {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> print(ThreadColors.ANSI_BLUE + "1", 100));
        Thread thread2 = new Thread(() -> print(ThreadColors.ANSI_GREEN + "2", 100));
        // In dit geval kan de uitvoering van thread2 eindigen wanneer de mainmethode is voltooid.
        thread2.setDaemon(true);
        thread1.start();
        thread2.start();
        // Om aantaal beschikbaar cores op te vragen
        System.out.println(Runtime.getRuntime().availableProcessors());
    }

    private static void print(String text, int count) {
        for (int j = 0; j < count; j++) {
            System.out.print(text);
            //De lus binnen de print methode roept bij elke stap Thread.yield() aan, waardoor de processortijd
            //beschikbaar wordt gemaakt voor doorgeven aan andere threads.
            Thread.yield();
        }
    }
}
