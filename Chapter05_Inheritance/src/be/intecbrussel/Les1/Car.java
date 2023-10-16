package be.intecbrussel.Les1;


public class Car extends Vehicle{

    public Car(){
        //Roept de super constructor aan
        // super();
        // Eigen implementative van de Car constructor.
        System.out.println("Car class constructor");

    }


    // Car class field
    private String brandName ="Audi";

    public String getBrandName(){
        return brandName;
    }
    public void setBrandName(String brandName){
        this.brandName= brandName;
    }

    // Vehicle class methodeen
    @Override
    public void honk() {
        super.honk();
        System.out.println("tuut tuut!");
    }

    public void sound(){
        // Roept de honk() method van Vehicle.
        super.honk();

    }
}
