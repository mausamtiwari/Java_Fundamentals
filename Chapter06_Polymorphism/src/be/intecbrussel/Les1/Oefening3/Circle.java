package be.intecbrussel.Les1.Oefening3;


public class Circle extends Shape {

    @Override
    public double getArea(int radius, double pi) {
        return pi * radius * radius;
    }

    @Override
    public double getPerimeter(int radius, double pi) {
        return 2 * pi * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                ", radius=" + radius +
                ", pi=" + pi +
                '}';
    }
}

