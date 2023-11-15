package be.intecbrussel.Oefeningen.Oefening2;


public class CircleApp {
    public static void main(String[] args) {

        System.out.println("First circle: ");
        Circle circle = new Circle(10);
        System.out.println("The radius is: " + circle.getRadius());

        System.out.println("\nSecond circle: ");
        Circle circle2 = new Circle(2, 4, 5);
        System.out.println("X position is: " + circle2.getX());
        System.out.println("y position is: " + circle2.getY());
        System.out.println("The Radius is: " + circle2.getRadius());

        System.out.println("\nThird circle: ");
        Circle circle3 = new Circle(circle);
        System.out.println("X position is: " + circle.getX());
        System.out.println("y position is: " + circle.getY());
        System.out.println("The Radius is: " + circle.getRadius());

        System.out.println("\nThe area of first circle is: " + circle.getArea());
        System.out.println("The perimeter of first circle is: " + circle.getPerimeter());

        System.out.println("\nThe area of second circle is: " + circle2.getArea());
        System.out.println("The perimeter of second circle is: " + circle2.getPerimeter());

        System.out.println("\nThe area of third circle is: " + circle3.getArea());
        System.out.println("The perimeter of third circle is: " + circle3.getPerimeter());
        //System.out.println(getCount());



    }
}
