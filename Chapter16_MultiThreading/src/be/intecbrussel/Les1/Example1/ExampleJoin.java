package be.intecbrussel.Les1.Example1;

public class ExampleJoin {
    public static void main(String[] args) {
        try {
            Thread studeren = new Thread(new MijnThread("@", 10));
            Thread eten = new Thread(new MijnThread("€", 100));
            Thread gamen = new Thread(new MijnThread("$", 1000));

            // Je begin met studeren.
            studeren.start();
            System.out.println(studeren.getState());

            // Je beslist na 1000 ms om tijdens het studeren te gamen.
            studeren.join(1000);

            // Gamen statr dus pas na dei 1000 ms.
            gamen.start();

            // je specificeert geen tijd!
            gamen.join();

            // pas als je klaar bent met studeren en gamen ga je eten.
            eten.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
