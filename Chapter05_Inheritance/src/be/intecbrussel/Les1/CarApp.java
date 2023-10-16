package be.intecbrussel.Les1;

public class CarApp {
    public static void main(String[] args) {
        // Creert nyCar object
        //Car myCar = new Car();
        Vehicle myVehicle= new Vehicle();

        // Drukt de waarde af van type of vehicle van Vehicle class en brandname van Car class.
        //System.out.println("This vehicle is a: "+ myCar.getTypeOfVehicle()+ "\nThe brand is: " + myCar.getBrandName());

        // Roept sound() mehtode op van car class. Dit roept de methode honk() van vehicle class.
        //myCar.sound();

        // Hier word honk() methjode van Car class opgeroepen.
        //myCar.honk();
        myVehicle.honk();

        System.out.println("----Separator----");

        Car myCar = new Car();
        myCar.honk();

    }
}
