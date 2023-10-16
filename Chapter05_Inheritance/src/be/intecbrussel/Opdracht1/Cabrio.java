package be.intecbrussel.Opdracht1;

public class Cabrio extends Car {
    private boolean sunroof;

    public Cabrio() {
    }

    public Cabrio(String color, int speed, int hp) {
        super(color, speed, hp);       // gets color,speed and hp from super class
    }

    public boolean getSunroof() {
        return this.sunroof;
    }

    public void openRoof() {
        boolean open= false;
        if(open){
            System.out.println("The sunroof is closed.");

        }else{
            System.out.println("The sunroof is open.");
        }
    }

    @Override
    public int getSpeed() {             // gets speed from superclass
        return super.getSpeed();
    }

    @Override
    public String toString() {
        return "Cabrio{" +
                "sunroof=" + sunroof +
                '}';
    }
}
