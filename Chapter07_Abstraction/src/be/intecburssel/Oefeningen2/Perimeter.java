package be.intecburssel.Oefeningen2;

public class Perimeter {
    private static final double PI = 3.141592653589793;
    private final static double radiusSun = 696340;
    private final static double radiusMoon = 1737.4;
    private final static double radiusEarth = 6371;

    private static final double getPerimeter(double radius) {
        return 2 * PI * radius;
    }

    public static void main(String[] args) {
        double sunPerimeter = getPerimeter(radiusSun);
        double moonPerimeter = getPerimeter(radiusMoon);
        double earthPerimeter = getPerimeter(radiusEarth);

        System.out.println("Perimeter of the Sun is: " + sunPerimeter);
        System.out.println("Perimeter of the Moon is: " + moonPerimeter);
        System.out.println("Perimeter of the Earth is: " + earthPerimeter);
    }
}

