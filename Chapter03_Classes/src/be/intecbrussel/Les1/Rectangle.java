package be.intecbrussel.Les1;

public class Rectangle {
    public int getArea(int length, int width) {
        return length * width;
    }

    public double getArea(double length, double width) {
        return length * width;
    }

    public long getArea(long length, long width) {
        return length * width;
    }

    public void getMessageCreation(double length) {
        System.out.println("\nRectangle is created " +"with length " +length);
    }

    public void getMessageCreation(double length, double width) {
        System.out.println("Rectangle is created " + "with length " +length + " & " +"width "+ width);
    }

    public void getMessageCreation(long length, long width) {
        System.out.println("Rectangle is created " + "with length " +length + " & " +"width "+ width);
    }

    //Een static method.
    public static void messageStatic(){
        System.out.println("\nHi! from static method.");
    }
}
