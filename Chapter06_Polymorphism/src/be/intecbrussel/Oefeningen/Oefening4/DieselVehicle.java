package be.intecbrussel.Oefeningen.Oefening4;

public class DieselVehicle extends Vehicle{
    @Override
    public void Color(){
        System.out.println("Diesel Vehicle is BLUE.");
    }

    @Override
    public void Fuel(){
        System.out.println("Diesel vehicles run on DIESEL.");
    }
}
