package be.intecburssel.Opdracht1;

public class Bendingrobot extends Robot {
    private double maxBendAngle;

    public Bendingrobot(String unitName, double maxBendAngle) {
        super(unitName);                                          // Super constructor.
        this.maxBendAngle = maxBendAngle;
    }

    public void bend(double angle) {  // bends if the angle is between the threshold.
        if (angle > maxBendAngle || angle <= 0 || angle >= 360) {
            System.out.println("Bending is not possible with " + angle + " degree.");
        } else {
            System.out.println("Successfully bended with " + angle + " degree.");
        }

    }

    @Override
    public String toString() {
        return "Bendingrobot{" +
                "maxBendAngle=" + maxBendAngle +
                '}';
    }
}
