package be.intecbrussel.Opdracht1;


public class SUV extends Car {
    private boolean bullbar = false;
    private boolean AWDOn;


    public SUV() {
    }

    public SUV(String color, int speed, int hp, boolean AWDOn) {
        super(color, speed, hp);        // Gets color,speed and hp from super class
        this.AWDOn = AWDOn;

    }

    public boolean isBullbar() {
        return bullbar;
    }

    public void setBullbar(boolean bullbar) {
        this.bullbar = bullbar;
    }

    public void allWheelDrive(boolean aWD) {
        this.AWDOn = aWD;
    }

    public int getSpeed() {
        return super.getSpeed();      // Calls getSpeed method from super class.
    }

    public int getHp() {                         // Calls getHp method from super class.
        return super.getHp();
    }

    @Override
    public void accelerate(int amount) {
        if (AWDOn && this.getSpeed() > 30) {       // If all-wheel drive is on. The max speed is 30.
            this.setSpeed(30);
        } else {
            this.setSpeed(this.getSpeed() - (amount + (this.getHp() / 100)));  // Else sets speed with the help of super class
        }
    }

    @Override
    public String toString() {
        return "SUV{" +
                "bullbar=" + bullbar +
                ", AWDOn=" + AWDOn +
                '}';
    }
}
