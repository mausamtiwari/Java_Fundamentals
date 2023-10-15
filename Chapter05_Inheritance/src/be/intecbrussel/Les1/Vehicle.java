package be.intecbrussel.Les1;

public class Vehicle {

        public Vehicle(){
            System.out.println("Vehicle class constructor");
        }
        // Vehicle class field
        private String typeOfVehicle = "Car";

        public String getTypeOfVehicle() {
            return typeOfVehicle;
        }

        public void setTypeOfVehicle(String typeOfVehicle) {
            this.typeOfVehicle = typeOfVehicle;
        }

        // Vehicle class method
        public void honk(){
            System.out.println("Toet toet");
        }


    }

