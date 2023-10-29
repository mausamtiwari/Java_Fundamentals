package be.intecburssel.Opdracht1;

public class Robot {
    private String unitName;

    public Robot() {              // No args constructor
        this.unitName = "nameless Robot";
        boot();                  // Boot method called in constructor.
    }

    public Robot(String unitName) {    // Constructor with argument
        this.unitName = unitName;
        boot();                       // Boot method called in constructor.
    }

    public String getUnitName() {
        return unitName;
    }

    public void boot() {
        System.out.println("The robot " + getUnitName() + " is starting up.");
    }

    @Override
    public String toString() {
        return "Robot{" +
                "unitName='" + unitName + '\'' +
                '}';
    }
}
