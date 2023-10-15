package be.intecbrussel.Les1;

public class Car2 extends Vehicle2{
    /* Dit zal niet worden uitgevoered. Als we de this() uit comment halen en ander in de comment zetten iin de Vehicles
    *  class kun je het verschil zien. Vergeet niet dat er altijd 1 constructor zonder een this() moet zijn */

    public Car2(){
        System.out.println("No args constructor Car2");
    }

    // This will be executed third
    Car2(String typeOfVehicle){
        super(typeOfVehicle);
        System.out.println("Car constructor");
    }

}
