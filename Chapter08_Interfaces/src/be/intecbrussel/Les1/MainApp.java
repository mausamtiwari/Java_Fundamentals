package be.intecbrussel.Les1;

public class MainApp {
    public static void main(String[] args) {
        Vehicle car01 = new Car(0,5,30,120);
        car01.shiftGearUp();
        car01.shiftGearUp();
        car01.shiftGearUp();
        car01.shiftGearDown();
        car01.speedUp();
        car01.braking();


        System.out.println("Car current gear: " + car01.getCurrentGear());
    }
}
