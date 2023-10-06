package be.intecbrussel.Les1;


public class MainApp {
    public static void main(String[] args) {

        // We maken een nieuw object aan van de Auto class.

        Auto auto = new Auto("Toyota","Camry");
        // Methode aanroepen van de Auto class
        auto.getMessageCreation();
        //auto.increaseSpeed(100);
    }
}

