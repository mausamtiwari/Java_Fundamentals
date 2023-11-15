/* Schrijf een programma om downcasting en upcasting te tonen. De parent class is Vehicle en maak 3
   verschillende child classes. Laat zien hoe je de downcasting en upcasting uitvoert. */

package be.intecbrussel.Oefeningen.Oefening4;

public class MainApp {
    public static void main(String[] args) {

        System.out.println("UPCASTING");
        Vehicle petrol = new PetrolVehicle();
        petrol.brandName = "BMW";
        System.out.println(petrol.brandName);
        petrol.Color();
        petrol.Fuel();
        System.out.println();

        Vehicle electric = new ElectricVehicle();
        electric.brandName= "TESLA";
        System.out.println(electric.brandName);
        electric.Color();
        electric.Fuel();
        System.out.println();

        Vehicle diesel = new DieselVehicle();
        diesel.brandName= "RAM";
        System.out.println(diesel.brandName);
        diesel.Color();
        diesel.Fuel();
        System.out.println();

        System.out.println("DOWNCASTING");

        PetrolVehicle petro = (PetrolVehicle) petrol;
        System.out.println("The brand of petrol vehicle is: " + petro.brandName);

        ElectricVehicle elec = (ElectricVehicle) electric;
        System.out.println("The brand of electric vehicle is: " + elec.brandName);

        DieselVehicle dies = (DieselVehicle) diesel;
        System.out.println("The brand of diesel vehicle is: " + dies.brandName);





    }
}
