package be.intecbrussel.Oefeningen.Oefening3;

public class Rectangle extends Shape {
    @Override
    public double getArea(int length, int breadth) {
        return length * breadth;
    }

    @Override
    public double getPerimeter(int length, int breadth) {
        return 2 * (length * breadth);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", breadth=" + breadth +
                '}';
    }
}
