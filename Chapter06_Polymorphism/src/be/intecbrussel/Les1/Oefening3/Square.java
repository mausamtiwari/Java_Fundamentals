package be.intecbrussel.Les1.Oefening3;

public class Square extends Shape {
    @Override
    public double getArea(int length) {
        return length * length;
    }

    @Override
    public double getPerimeter(int length) {
        return 4 * length;
    }

    @Override
    public String toString() {
        return "Square{" +
                "length=" + length +
                '}';
    }
}
