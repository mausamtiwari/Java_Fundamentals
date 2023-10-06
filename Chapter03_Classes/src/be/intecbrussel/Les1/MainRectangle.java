package be.intecbrussel.Les1;

import static be.intecbrussel.Les1.Rectangle.messageStatic;

public class MainRectangle {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println("Area is " + rectangle.getArea(12,10));
        System.out.println("Area is " + rectangle.getArea(12.0,10.0));
        System.out.println("Area is " + rectangle.getArea(2L,1L));

        rectangle.getMessageCreation(12);
        rectangle.getMessageCreation(12.0,10.0);
        rectangle.getMessageCreation(12,10);

        messageStatic();

    }

}
