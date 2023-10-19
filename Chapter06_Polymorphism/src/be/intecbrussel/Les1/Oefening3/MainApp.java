/* Schijf een programma over vormen. Maak gebruik van inheritance en polymorphism. Er moeten minimaal 3
   verschillende vormen zijn. Van deze vormen ga je de omtrek en oppervlakte berekenen */
package be.intecbrussel.Les1.Oefening3;

public class MainApp {
    public static void main(String[] args) {

        Shape square = new Square();
        System.out.println("The area of square is: " + square.getArea(4));
        System.out.println("The perimeter of square is: " + square.getPerimeter(4));

        Shape rectangle = new Rectangle();
        System.out.println("The area of rectangle is: " + rectangle.getArea(2, 2));
        System.out.println("The perimeter of recatangle is: " + rectangle.getPerimeter(2, 5));

        Shape circle = new Circle();
        System.out.println("The area of circle is: " + circle.getArea(4, 3.14));
        System.out.println("The perimeter of circle is: " + circle.getPerimeter(7, 3.14));

    }
}
