package be.intecbrussel.Les1;

public interface Vehicle {
    // constant variables -> bad practice
    public static final int DOORS =3;  // public static final is unnecessary!
    int wheels=4;

    // methods
    public abstract void speedUp();    // public abstract in unnecessary!
    void braking();
    void shiftGearUp();
    void shiftGearDown();
    int getCurrentGear();
}
