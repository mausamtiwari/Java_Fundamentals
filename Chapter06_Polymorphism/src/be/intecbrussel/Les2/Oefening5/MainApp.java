/*  Maak een super class Shape en maak 3 verschillende vormen naar keuze. Van deze figuren ga je de
    oppervlakte berekenen en een validatie uitvoeren met instanceof operator. Hier ga je kijken of de vormen
    die je hebt gecreëerd een instantie zijn van Shape class.*/

package be.intecbrussel.Les2.Oefening5;

public class MainApp {
    public static void main(String[] args) {

        Shape square = new Square();
        System.out.println("The area of square is: " + square.getArea(4));
        System.out.println("The perimeter of square is: " + square.getPerimeter(4));
        System.out.println("square is an instance of Object:  " + (square instanceof Object));
        System.out.println("square is an instance of Shape:  " + (square instanceof Shape));
        System.out.println("square is an instance of Rectangle:  " + (square instanceof Rectangle));
        System.out.println("square is an instance of Circle:  " + (square instanceof Circle));
        System.out.println();

        Shape rectangle = new Rectangle();
        System.out.println("The area of rectangle is: " + rectangle.getArea(2, 2));
        System.out.println("The perimeter of recatangle is: " + rectangle.getPerimeter(2, 5));
        System.out.println("rectangle is an instance of Object:  " + (rectangle instanceof Object));
        System.out.println("rectangle is an instance of Shape:  " + (rectangle instanceof Shape));
        System.out.println("rectangle is an instance of Rectangle:  " + (rectangle instanceof Rectangle));
        System.out.println("rectangle is an instance of Circle:  " + (rectangle instanceof Circle));
        System.out.println();

        Shape circle = new Circle();
        System.out.println("The area of circle is: " + circle.getArea(4, 3.14));
        System.out.println("The perimeter of circle is: " + circle.getPerimeter(7, 3.14));
        System.out.println("circle is an instance of Object:  " + (circle instanceof Object));
        System.out.println("circle is an instance of Shape:  " + (circle instanceof Shape));
        System.out.println("circle is an instance of Rectangle:  " + (circle instanceof Rectangle));
        System.out.println("circle is an instance of Circle:  " + (circle instanceof Circle));

    }
}