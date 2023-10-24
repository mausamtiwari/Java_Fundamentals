package be.intecburssel.Opdracht1;

public class CrazyRobot extends Robot {
    public CrazyRobot() {
    }

    public CrazyRobot(String unitName) {
        super(unitName);                      // Called unitname from Robot class
        StringBuilder crazyName = new StringBuilder(unitName).reverse();     // Reverses the unitName.
        System.out.println("I am crazy. My name is: " + crazyName);           // Prints
    }

    @Override
    public void boot() {       // Boot method from Robot overriden
        super.boot();
    }

    @Override
    public String toString() {
        return "CrazyRobot{}";
    }
}
