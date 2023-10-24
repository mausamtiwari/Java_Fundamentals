package be.intecburssel.Les1;

public class FinalExample2 {
    public static void main(String[] args) {
        final StringBuilder sb = new StringBuilder("Intec");
        // Printing the element
        System.out.println("Before the change: " + sb);

        // Changing internal state of the object reference by final reference variable sb
        sb.append("Brussel");

        // Again printing the element after appending above element in it
        System.out.println("After the change: " + sb);
    }
}
