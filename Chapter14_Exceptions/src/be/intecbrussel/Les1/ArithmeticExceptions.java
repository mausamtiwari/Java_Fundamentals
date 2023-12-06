package be.intecbrussel.Les1;

public class ArithmeticExceptions {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int c;

        try {
            c = a / b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println("het getaal kan niet door null gedeeld. ");
        } finally {
            System.out.println("Finally block werkt.");
        }
        System.out.println("Code werkt.");
    }
}
