package be.intecburssel.Opdracht1;

public class LiftingRobot extends Robot {
    private double maxLiftHeight;

    public LiftingRobot(String unitName, double maxLiftHeight) {
        super(unitName);                              // Super constructor
        this.maxLiftHeight = maxLiftHeight;
    }

    public void lift(double height) {    // Lifts if the height is smaller than max height.
        if (height > maxLiftHeight) {
            System.out.println("Lifting is not possible by " + height + " cm. Maximum height allowed is: " + maxLiftHeight + " cm.");
        } else {
            System.out.println("Lifted by " + height + " cm.");
        }
    }

    @Override
    public String toString() {
        return "LiftingRobot{" +
                "maxLiftHeight=" + maxLiftHeight +
                '}';
    }
}
