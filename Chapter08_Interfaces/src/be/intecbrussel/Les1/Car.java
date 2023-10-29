package be.intecbrussel.Les1;

public class Car implements Vehicle {
    // Properties
    private int gear = 0;
    private int maxGears = 5;
    private float speed = 0f;
    private float maxSpeed = 120f;

    // Constructor
    public Car(int gear, int maxGears, float speed, float maxSpeed) {
        this.gear = gear;
        this.maxGears = maxGears;
        this.speed = speed;
        this.maxSpeed = maxSpeed;
    }

    // interface methods + implementations
    @Override
    public void speedUp() {
        if (speed < maxSpeed) {
            speed += 5f;
        }
    }

    @Override
    public void braking() {
        if (speed > 0) {
            speed = -5f;
        }
    }

    @Override
    public void shiftGearUp() {
        if (gear < maxGears) {
            gear++;
        }
    }

    @Override
    public void shiftGearDown() {
        if (gear > 0) {
            gear--;
        }
    }

    @Override
    public int getCurrentGear() {
        return gear;
    }
}
