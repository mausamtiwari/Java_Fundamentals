package be.intecbrussel.Les1;

public class Vehicle2 {
    private final String typeOfVehicle;

    // This will be executed second

    public Vehicle2(){
        this("Car");
        System.out.println("Vehicle class no-args constructor");
    }

    // This will be executed first
    public Vehicle2 ( String typeOfVehicle){
        //this();
        this.typeOfVehicle = typeOfVehicle;
        System.out.println("Constructor Vehicle2 met parameters");
    }
}
