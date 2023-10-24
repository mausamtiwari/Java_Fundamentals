package be.intecburssel.Opdracht1;

public class RobotApp {
    public static void main(String[] args) {
        Bendingrobot bendingrobot = new Bendingrobot("Cybertron", 360);
        bendingrobot.bend(361);
        bendingrobot.bend(45);
        System.out.println();

        LiftingRobot liftingrobot = new LiftingRobot("Robo", 200);
        liftingrobot.lift(300);
        liftingrobot.lift(150);
        System.out.println();

        CrazyRobot crazyrobot = new CrazyRobot("Crobo");

    }
}
