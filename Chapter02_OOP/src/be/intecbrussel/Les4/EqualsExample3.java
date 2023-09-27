package be.intecbrussel.Les4;

public class EqualsExample3 {
    public static void main(String[] args) {
        String s1 = new String("HELLO");
        String s2 = new String("HELLO");


        System.out.println("s1 and s2 are equal: " + (s1 == s2)); // String is an object and  has reference and input.
        // == compares both the reference and input.
        System.out.println("s1 and s2 are equal: " + (s1.equals(s2))); // .equals() compares only the input

        s1 = s2; // We pointed s2 towards s1. hence it has the same reference as s1.

        System.out.println("s1 and s2 are equal: " + (s1 == s2));//Since s1 and s2 has the same reference point, s1 equals s2.

    }
}
