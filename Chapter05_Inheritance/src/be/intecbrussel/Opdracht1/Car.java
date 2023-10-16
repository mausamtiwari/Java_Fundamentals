package be.intecbrussel.Opdracht1;


public class Car {
    private String color;
    private int speed;
    private int hp;

    public Car() {                           // No args constructor

    }

    public Car(String color, int speed) {
        this.color = color;
        this.speed = speed;
    }

    public Car(String color, int speed, int hp) {
        this.color = color;
        this.speed = speed;
        this.hp = hp;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void accelerate(int amount) {        // Acceleration method
        this.speed += amount + (hp / 100);
    }


    public void slow(int amount) {              // Slowing down method
        this.speed -= amount + (hp / 100);
    }

    public void park() {                         // Park sets speed to 0
        this.speed = 0;
        System.out.println("The vehicle is safely parked");
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", speed=" + speed +
                ", hp=" + hp +
                '}';
    }
}
