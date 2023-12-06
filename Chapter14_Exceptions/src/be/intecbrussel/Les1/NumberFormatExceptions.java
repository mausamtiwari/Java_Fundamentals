package be.intecbrussel.Les1;

public class NumberFormatExceptions {
    public static void main(String[] args) {
        int a;
        try {
            a = Integer.parseInt("Hello");
            System.out.println("A is:" + a);
        } catch (NumberFormatException exception) {
            //exception.printStackTrace();
            System.out.println(exception.getMessage());
            System.out.println("Exception " + exception);
        }
        System.out.println("Code werkt.");
    }

}
