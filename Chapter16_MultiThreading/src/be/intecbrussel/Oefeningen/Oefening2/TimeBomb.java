package be.intecbrussel.Oefeningen.Oefening2;

public class TimeBomb {
    int seconds;

    public TimeBomb(int seconds) {
        this.seconds = seconds;
    }

    public void activate() {
        System.out.print("The bomb is activated");
    }

    public void disarm() {
        System.out.println("Congratulations! The bomb is successfully disarmed ");
    }

}
