package be.intecbrussel.Opdracht1;

public class ElectricCar extends Car {
    private int battery = 0;

    public ElectricCar() {

    }

    public ElectricCar(String color, int speed, int battery) {
        super(color, speed);
        this.battery = battery;
    }

    public int getBattry() {
        return battery;
    }

    @Override
    public void accelerate(int amount) {             // Acceleration method.
        this.setSpeed(this.getSpeed() + (amount + (battery / 100)));
    }

    @Override
    public void slow(int amount) {                  // Slowing down method
        this.setSpeed(this.getSpeed() - (amount + (battery / 100)));
    }

    @Override
    public void park() {                             // overrides park method from super class.
        super.park();
    }

    public void charge(int amount) {
        this.battery += amount;
    }

    public int getSpeed() {                           // Gets speed from super class.
        return super.getSpeed();
    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "battery=" + battery +
                '}';
    }
}
