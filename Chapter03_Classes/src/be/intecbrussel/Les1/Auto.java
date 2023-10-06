package be.intecbrussel.Les1;

public class Auto {
    // properties van de auto class
    private String merk;
    private String model;
    private int speed;

    // All-args construtor die op public staat.
    public Auto(String merk, String model) {
        this.merk = merk;
        this.model = model;
    }
    //Hier komen de getters en setter van de properties.
    public void getMessageCreation() {
        System.out.println("Auto is created.");
    }

    public int increaseSpeed(int increment) {
        this.speed = this.speed + increment;
        //System.out.println(speed);
        return this.speed;
    }
}
