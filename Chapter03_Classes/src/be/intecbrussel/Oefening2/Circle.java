/* Maak een klas met de naam Circle. Jullie kunnen alle details in de UML zien. En maak een andere klas van de naam
   CircleApp en probeer alle methoden aan te roepen.
   Circle
   + ANGLES:int=0 (static)
   - count: int   (static)
   - x:int
   - y:int
   - radius:int
   + Circle()
   + Circle(radius:int)
   + Circle(radius:int,x:int,y:int)
   + Circle(c:Circle)
   + getX():int
   + setX(x:int)
   +getY():int
   + setY(y:int)
   + getRadius():int
   + setRadius(radius:int)
   + getArea():double
   + getPerimeter():double
   + grow(d:int)
   + getCount():int   (static)   */

package be.intecbrussel.Oefening2;

public class Circle {
    public static int ANGLES = 0;
    private static int count;
    private int x;
    private int y;
    private int radius;

    public Circle() {                            // No args constructor.
    }

    public Circle(int radius) {                  // Constructor with radius argument
        this.radius = radius;
    }

    public Circle(int x, int y, int radius) {   // Constructor with x, y and radius as arguments.
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public Circle(Circle circle) {              // Copy constructor.
        this.x = circle.x;
        this.y = circle.y;
        this.radius = circle.radius;
    }

    public int getX() {                        // x getter
        return x;
    }

    public void setX(int x) {                 // x setter
        this.x = x;
    }

    public int getY() {                       // y getter
        return y;
    }

    public void setY(int y) {                 // y setter
        this.y = y;
    }

    public int getRadius() {                  // radius getter
        return radius;
    }

    public void setRadius(int radius) {       // radius setter
        this.radius = radius;
    }

    public double getArea() {                 // Method to return area
        return 3.14 * radius * radius;
    }

    public double getPerimeter() {            // Method to return perimeter.
        return 2 * 3.14 * radius;
    }

    public void grow(int d) {                  // Method to grow circle
        this.radius = this.radius + Math.abs(d);
    }

    public static int getCount() {             // count getter
        return count;
    }

}
