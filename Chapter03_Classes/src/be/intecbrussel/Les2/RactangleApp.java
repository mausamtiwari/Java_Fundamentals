package be.intecbrussel.Les2;

public class RactangleApp {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(10,20);

        System.out.println("Rectangle 1: ");
        System.out.println("Height =  " + rectangle.getHeight());
        System.out.println("Width = " + rectangle.getWidth());

        System.out.println("\nRectangle 2: ");
        Rectangle rectangle2 = new Rectangle(1, 2, 3, 4);
        System.out.println("Height = " + rectangle2.getHeight());
        System.out.println("Width = " + rectangle2.getWidth());
        System.out.println("X position = " + rectangle2.getX());
        System.out.println("Y position = " + rectangle2.getY());

        System.out.println("\nRectangle 3: ");
        Rectangle rectangle3= new Rectangle(rectangle);
        System.out.println("Height = " + rectangle3.getHeight());
        System.out.println("Width = " + rectangle3.getWidth());
        System.out.println("X position = " + rectangle3.getX());
        System.out.println("Y position = " + rectangle3.getY());

        System.out.println("\nThe area of Rectangle 1 is: " + rectangle.getArea());
        System.out.println("The perimeter of rectangle 1 is: " + rectangle.getPerimeter());

        System.out.println("\nThe area of Rectangle 2 is: " + rectangle2.getArea());
        System.out.println("The perimeter of rectangle 2 is: " + rectangle2.getPerimeter());

        System.out.println("\nThe area of Rectangle 3 is: " + rectangle3.getArea());
        System.out.println("The perimeter of rectangle 3 is: " + rectangle3.getPerimeter());


    }
}
