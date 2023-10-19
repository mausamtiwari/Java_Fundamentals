package be.intecbrussel.Les2.Oefening5;

public class Shape {
    protected int length;
    protected int breadth;
    protected int radius;
    protected double pi;

    public Shape(){

    }

    public Shape(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public Shape(int radius, double pi) {
        this.radius = radius;
        this.pi = pi;
    }

    public Shape(int length) {
        this.length = length;
    }

    public double getArea(int length, int breadth) {
        return length * breadth;
    }

    public double getArea(int length) {
        return length * length;
    }

    public double getPerimeter(int length) {
        return 4 * length;
    }

    public double getPerimeter(int length, int breadth) {
        return 2 * (length + breadth);
    }

    public double getArea(int radius, double pi) {
        return pi * radius * radius;
    }

    public double getPerimeter(int radius, double pi) {
        return 2 * pi * radius;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "length=" + length +
                ", breadth=" + breadth +
                ", radius=" + radius +
                ", pi=" + pi +
                '}';
    }
}

