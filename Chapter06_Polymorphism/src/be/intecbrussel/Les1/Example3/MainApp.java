// Method overriding example

package be.intecbrussel.Les1.Example3;

public class MainApp {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.makeASound();

        Vehicle bicycle = new Bicycle();
        bicycle.makeASound();
    }
}
