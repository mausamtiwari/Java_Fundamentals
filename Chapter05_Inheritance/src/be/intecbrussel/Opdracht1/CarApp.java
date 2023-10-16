package be.intecbrussel.Opdracht1;

public class CarApp {
    public static void main(String[] args) {
        Car[] cars = new Car[3];              // Creates an array of type Car with 3 3lements.
        cars[0] = new Cabrio("Yellow", 50, 250);   // Assigns parameters and name.

        cars[1] = new ElectricCar("Green", 50, 60);

        cars[2] = new SUV("Red", 50, 250, false);

        for (Car car : cars) {         // Loops inside the car array.
            System.out.println(car);
            car.park();               // Parks all cars.
            System.out.println();
        }

        System.out.println();
        Cabrio cab = new Cabrio("Yellow", 150, 200);
        cab.accelerate(200);
        System.out.println("The cab's speed after acceleration is: " + cab.getSpeed());
        cab.slow(200);
        System.out.println("The cab's speed after slowing down is: " + cab.getSpeed());
        cab.openRoof();
        System.out.println();

        ElectricCar elec = new ElectricCar("Green", 250, 60);
        elec.accelerate(200);
        System.out.println("The elec's speed after acceleration is: " + elec.getSpeed());
        elec.slow(200);
        System.out.println("The elec's speed after slowing down is: " + elec.getSpeed());
        System.out.println();

        SUV suv = new SUV("Red", 180, 200, true);
        System.out.println("The original speed os suv is: " + suv.getSpeed());
        suv.accelerate(200);
        System.out.println("The suv's speed after acceleration is: " + suv.getSpeed());


    }
}
