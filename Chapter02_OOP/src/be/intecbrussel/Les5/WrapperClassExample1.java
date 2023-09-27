package be.intecbrussel.Les5;

public class WrapperClassExample1 {
    public static void main(String[] args) {
        Integer myInt = 25000;
        String myString = myInt.toString();

        System.out.println(myString);
        System.out.println("This is a string with a length of: " + myString.length());
    }
}
